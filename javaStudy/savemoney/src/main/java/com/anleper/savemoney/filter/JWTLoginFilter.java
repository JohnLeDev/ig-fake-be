package com.anleper.savemoney.filter;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anleper.savemoney.dto.UserDto;
import com.anleper.savemoney.model.User;
import com.anleper.savemoney.service.TokenAuthenticationService;
import com.auth0.net.Request;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

    protected JWTLoginFilter(String defaultFilterProcessesUrl, AuthenticationManager authenticationManager) {
        super(defaultFilterProcessesUrl, authenticationManager);
        setAuthenticationManager(authenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest arg0, HttpServletResponse arg1)
            throws AuthenticationException, IOException, ServletException {
        // TODO Auto-generated method stub
        UserDto credentials = new UserDto(arg0.getParameter("email"),arg0.getParameter("password") );
        
        return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(credentials.getEmail(), credentials.getPassword(),Collections.emptyList()));
    }
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
            Authentication authResult) throws IOException, ServletException {
        // TODO Auto-generated method stub
        // super.successfulAuthentication(request, response, chain, authResult);
        TokenAuthenticationService.addAuthentication(response, authResult.getName());

    }
}
