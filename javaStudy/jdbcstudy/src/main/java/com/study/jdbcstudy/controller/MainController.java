package com.study.jdbcstudy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.study.jdbcstudy.model.Employee;
import com.study.jdbcstudy.service.EmployeSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private EmployeSer employeSer;
    @RequestMapping(value = "/employees" , method = RequestMethod.GET )
    public String employee(HttpServletRequest request) {
        List<Employee> employees = employeSer.getAllEmployee();
        request.setAttribute("employee", employees);
        return "employee";
    }
    @RequestMapping(value = "/employee" , method = RequestMethod.POST )
    public String insertEmployee(HttpServletRequest request, @RequestBody Employee employee ) {
        employeSer.insertEmployee(employee);
        // request.setAttribute("employee", employee);
        return "employee";
    }

    @GetMapping(value="/hello")
    public String  getMethodName(HttpServletRequest  request) {
        Long x =null ;
        x += 10 ; 
        request.setAttribute("hello", "DDCM M !!!!!!!!!!!!");
        return "hello";
    }
    
}
