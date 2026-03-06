package com.example.SpringBootDEMO.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Let's compile the code with Desktop!!");
    }
}
