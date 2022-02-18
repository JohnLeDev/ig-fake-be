package com.energycompany.ntcpetroleum.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
@Entity 
@Table(name = "orders")
@Data
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  
    @Column( name = "name")
    private String name ;

    // @Column
    // private String startNumber;
    // @Column
    // private String endNumber ;
    // @Column
    // private String price ; 
    // @Column
    // private Date time ;
    // @Column
    // private String nameStaff;

}
