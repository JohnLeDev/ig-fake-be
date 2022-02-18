package com.anleper.savemoney.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table( name = "users" )
@Data
public class User {;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id ;
    @Column 
    private String userName ;
    @Column
    private String passWord ;
    @Column
    private String accessToken; 
    @Column( name = "createdDate")
    private Date createdDate ;
    @OneToMany(mappedBy =  "userdata")
    private List<Revenue> revenuesdata = new ArrayList<>();
    @OneToMany(mappedBy = "userdata")
    private List<Collector> collectorsdata = new ArrayList<>();
    // @ManyToMany
    // @JoinTable(name = "user_report", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn (name = "report_id"))
    // private List<Report> reportmaps  = new ArrayList<>();

}
