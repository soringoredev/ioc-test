package com.example.demo_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Chef myChef777;

    //constructor
    @Autowired
    public DemoController(Chef theChef) {
        myChef777 = theChef;
    }
}
