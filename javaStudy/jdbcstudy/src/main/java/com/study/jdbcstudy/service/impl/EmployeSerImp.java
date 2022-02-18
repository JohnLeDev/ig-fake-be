package com.study.jdbcstudy.service.impl;

import java.util.List;

import com.study.jdbcstudy.dao.ImployeeDao;
import com.study.jdbcstudy.model.Employee;
import com.study.jdbcstudy.service.EmployeSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeSerImp  implements EmployeSer{
    @Autowired
    private ImployeeDao imployeeDao;

    @Override
    public List<Employee> getAllEmployee() {
        
        return imployeeDao.getAllEmployee();
    }

    @Override
    public void insertEmployee(Employee employee) {
        // TODO Auto-generated method stub
        imployeeDao.insertEmployee(employee);
    }
    
}
