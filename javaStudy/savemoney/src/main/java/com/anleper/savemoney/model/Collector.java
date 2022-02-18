package com.anleper.savemoney.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import antlr.collections.List;
import lombok.Data;

@Entity
@Table( name = "collectors" )
@Data
public class Collector extends BaseModel{
    @Column
    private  Date date ;
    @Column
    private String note ;
    @Column
    private Long price;
    @Column
    private String category ; 
    

    @ManyToOne
    @JoinColumn(name="user_id")
    private User userdata ;
}
