package com.study.jdbcstudy.dao;

import java.util.List;

import com.study.jdbcstudy.model.Employee;

public interface ImployeeDao {

    List<Employee> getAllEmployee();
    void  insertEmployee( Employee employee);
}
