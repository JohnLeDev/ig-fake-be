package com.study.jdbcstudy.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Employee {
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String name;
}
