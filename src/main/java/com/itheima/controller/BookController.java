package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/books")
public class BookController {

    int i = 100/0;
    @GetMapping
    public String getById() {
        Random random = new Random();
        System.out.println(String.valueOf(random));
        return String.valueOf(random);
    }
}
