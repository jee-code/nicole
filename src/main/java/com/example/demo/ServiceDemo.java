package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ServiceDemo {

    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
