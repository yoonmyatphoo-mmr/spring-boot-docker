package com.ymp.springbootdocker.model;

import lombok.Data;

/**
 * author: yoon-myat-phoo
 * created: 02/11/2024 - 9:30 AM
 * project: spring-boot-docker
 * package: com.ymp.springbootdocker.model
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String age;
    private String email;
}
