package com.springboot.controller;

import com.springboot.jopo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Empcontroller {
    @Autowired
    private Emp ep;

    public Emp getEp() {
        return ep;
    }

    public void setEp(Emp ep) {
        this.ep = ep;
        System
    }
    public
}
