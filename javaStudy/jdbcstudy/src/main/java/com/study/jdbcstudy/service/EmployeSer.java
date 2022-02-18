package com.study.jdbcstudy.service;

import java.util.List;

import com.study.jdbcstudy.model.Employee;

public interface EmployeSer {
     List<Employee> getAllEmployee();
     void insertEmployee(Employee employee);
}
