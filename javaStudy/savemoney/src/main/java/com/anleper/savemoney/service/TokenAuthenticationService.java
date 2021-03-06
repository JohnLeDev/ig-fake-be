package com.anleper.savemoney.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.Authentication;
public class TokenAuthenticationService {
    static final long EXPIRATIONTIME= 864;
    static final String SECRET = "ThisIsASecret";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "authorization";

    public static void addAuthentication(HttpServletResponse res , String username){
        String JWT =  Jwts.builder().setSubject(username).setExpiration(new Date(System.currentTimeMillis()+EXPIRATIONTIME)).
        signWith(SignatureAlgorithm.HS512,SECRET).compact();
        res.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
    }
    public static Authentication getAuthenticationManager(HttpServletRequest request){
        String token = request.getHeader(HEADER_STRING);
        if(token != null){
            String user = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody().getSubject();
            return user != null ? new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList()):null;
        }
        return null;
    }
}
