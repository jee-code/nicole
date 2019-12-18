package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Autowired
    private ServiceDemo serviceDemo;

    @Test
    public void doTesr(){
        Integer res = serviceDemo.add(1, 2);
        assertEquals(Integer.valueOf(3), res);
    }
}
