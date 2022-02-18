package com.anleper.savemoney.service.imlp;

import java.time.LocalDate;
import java.util.Date;

import com.anleper.savemoney.dto.UserDto;
import com.anleper.savemoney.model.User;
import com.anleper.savemoney.repository.UserResponsitory;
import com.anleper.savemoney.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserResponsitory userResponsitory;
    @Override
    public UserDto signup(UserDto userDto) {
        User user = toUser(userDto);
        
        userResponsitory.signUp(user);
        // TODO Auto-generated method stub
        return null;
    }
    private User toUser(UserDto userDto) {
        User user = new  User();
        user.setUserName(userDto.getEmail());
        user.setPassWord(userDto.getPassword());
        user.setCreatedDate(new Date(System.currentTimeMillis()));
        return user;

    }
    
}
