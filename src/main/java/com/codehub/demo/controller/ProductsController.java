package com.codehub.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.codehub.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "OK";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List getProducts() {
        return productService.getProducts();
    }

}