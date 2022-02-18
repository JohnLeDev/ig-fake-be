package com.anleper.savemoney.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table( name = "reports" )
@Data
public class Report extends BaseModel{
    @Column
    private Long revanue;
    @Column
    private Long collector;
    @Column
    private Date date;
    @Column 
    private String note ;
    
    // @ManyToMany(mappedBy =  "reportmaps")
    // private List<User> users = new ArrayList<>();
}
 