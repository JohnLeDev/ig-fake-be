package com.anleper.savemoney.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
@Table( name = "revenues" )
@Data
public class Revenue extends BaseModel {
   
    @Column
    private Date date ;
    @Column
    private String note ;
    @Column
    private Double revenueMoney ;
    @Column
    private String category ;
    
    @ManyToOne
    @JoinColumn(name="user_id")
    private User userdata;
    
}
