package com.anleper.savemoney.controller;

import com.anleper.savemoney.dto.RevenueDto;
import com.anleper.savemoney.dto.UserDto;
import com.anleper.savemoney.service.RevenueService;
import com.anleper.savemoney.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaveMoneyController {
    
   
    @Autowired
    private RevenueService revenueService;
    @Autowired
    private UserService userService;
    @RequestMapping(value="/revenue", method=RequestMethod.GET)
    public ResponseEntity<RevenueDto> revenue(@RequestBody RevenueDto news) {
        // RevenueDto revenueDto = news;
        revenueService.insertRevenue(news);
        return  new ResponseEntity<>(news,HttpStatus.ACCEPTED) ;
        
    }

    @RequestMapping(value="/signUp" , method=RequestMethod.POST) 
    public ResponseEntity<UserDto> signUp(@RequestBody UserDto userDto ){
        userService.signup(userDto);
        return new ResponseEntity<>(HttpStatus.ACCEPTED) ;
    }


    

 
    

}
