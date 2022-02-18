package com.example.managerpe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long lonId;
    @Column
    private String code ;
    @Column
    private String name ;
}
