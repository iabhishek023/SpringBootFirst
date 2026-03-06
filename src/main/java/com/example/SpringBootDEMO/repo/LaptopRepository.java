package com.example.SpringBootDEMO.repo;

import com.example.SpringBootDEMO.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Laptop saved to database");
    }
}
