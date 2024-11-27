package com.zero.hutool.controller;

import com.zero.hutool.service.HutoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hutool")
public class HutoolController {

    HutoolService hutoolService;

    @Autowired
    public HutoolController(HutoolService hutoolService) {
        this.hutoolService = hutoolService;
    }

    @RequestMapping("/test")
    public String test() {
        return "hutool test";
    }

}
