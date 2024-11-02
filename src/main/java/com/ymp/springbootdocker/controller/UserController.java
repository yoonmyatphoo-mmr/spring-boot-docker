package com.ymp.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: yoon-myat-phoo
 * created: 02/11/2024 - 9:50 AM
 * project: spring-boot-docker
 * package: com.ymp.springbootdocker.controller
 */

@RestController
public class UserController {

    @GetMapping("/message")
    public String getMessage() {
        return "Welcome to JavaTechie..!!";
    }

}
