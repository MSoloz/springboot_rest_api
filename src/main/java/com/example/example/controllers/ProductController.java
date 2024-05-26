package com.example.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.example.entities.Product;
import com.example.example.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController()
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService productService;


    @PostMapping("/create")
    public Product getMethodName(@RequestBody Product product) {
        return  productService.addProduct(product);
    }
    
    
}
