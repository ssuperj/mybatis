package com.review.controller;

import com.review.service.MybaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcTestController {

    @Autowired
    MybaService service;

    @RequestMapping("/myba")
    public String myba() {
        String totSize = service.totSize("");
        return totSize + "";
    }
}