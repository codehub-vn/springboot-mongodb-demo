package com.codehub.demo.service;

import com.codehub.demo.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List getProducts() {
        return repository.findAll();
    }
}
