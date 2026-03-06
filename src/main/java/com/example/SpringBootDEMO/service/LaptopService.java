package com.example.SpringBootDEMO.service;

import com.example.SpringBootDEMO.model.Laptop;
import com.example.SpringBootDEMO.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop laptop){
        repo.save(laptop);
    }

    public boolean isGoodForProg(Laptop laptop){
        return true;
    }
}
