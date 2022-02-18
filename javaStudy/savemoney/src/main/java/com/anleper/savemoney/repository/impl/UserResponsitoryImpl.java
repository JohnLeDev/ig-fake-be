package com.anleper.savemoney.repository.impl;

import javax.transaction.Transactional;

import com.anleper.savemoney.model.User;
import com.anleper.savemoney.repository.UserResponsitory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserResponsitoryImpl implements UserResponsitory {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int signUp(User user) {
        StringBuilder sql = 
            new StringBuilder("INSERT INTO revenue.users (pass_word, user_name, created_date) VALUES (?,?,?)");
        return jdbcTemplate.update(sql.toString(), user.getPassWord(),user.getUserName(),user.getCreatedDate());
    }
    
}
