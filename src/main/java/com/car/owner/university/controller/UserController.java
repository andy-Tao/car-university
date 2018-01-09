package com.car.owner.university.controller;

import com.car.owner.university.bean.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TaoWei
 * @date 2018/1/9
 */
@RestController
public class UserController {

    @Value("${com.university.username}")
    private String username;
    @Value("${com.university.tips}")
    private String tips;
    @Value("${com.university.all}")
    private String allMsg;

    @Autowired
    ConfigTestBean testBean;

    @RequestMapping(value = "/login")
    public String getTips(){
        return testBean.getUsername();
    }

    @RequestMapping(value = "/login1")
    public String getAllTips(){
        return this.username;
    }
}
