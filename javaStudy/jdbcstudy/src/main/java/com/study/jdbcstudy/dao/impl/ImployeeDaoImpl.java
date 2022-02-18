package com.study.jdbcstudy.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.study.jdbcstudy.dao.ImployeeDao;
import com.study.jdbcstudy.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ImployeeDaoImpl implements ImployeeDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getAllEmployee() {
        String sql  = "SELECT * FROM EMPLOYEE";
        return jdbcTemplate.query(sql, new RowMapper<Employee>(){

            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                // TODO Auto-generated method stub
                Employee employee = new Employee();
                
                employee.setId(rs.getInt("id"));
                return employee;
            }
           
        });
        // TODO Auto-generated method stub
      
    }

    @Override
    public void insertEmployee(Employee employee) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO EMPLOYEE(id,name) VALUES("+ employee.getId() + " ,\""+ employee.getName() + " \" " +") " ;
        jdbcTemplate.execute(sql);
    }

   
    
}
