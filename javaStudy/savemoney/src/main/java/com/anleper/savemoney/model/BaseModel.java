package com.anleper.savemoney.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.Getter;

@MappedSuperclass
@Data
public class BaseModel {
    @Getter
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id ;

    
    @Column( name = "createdBy")
    private String createdBy ; 

    @Column( name = "createdDate")
    private Date createdDate ;

    
    @Column( name = "modifiedBy")
    private String modifiedBy ;

    
    @Column( name = "modeifiedDate") 
    private Date modeifiedDate ;
}
