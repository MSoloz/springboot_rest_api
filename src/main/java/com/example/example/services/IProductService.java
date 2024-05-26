package com.example.example.services;

import org.springframework.stereotype.Service;
import com.example.example.entities.Product;


@Service
public interface IProductService {
 
    Product addProduct(Product product);
    
} 
