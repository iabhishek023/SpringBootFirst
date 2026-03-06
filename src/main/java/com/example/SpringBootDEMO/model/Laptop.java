package com.example.SpringBootDEMO.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Let's compile the code with Laptop!!");
    }
}
