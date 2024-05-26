package com.example.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.example.entities.Product;
import com.example.example.repositories.ProductRepository;


@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
       return productRepository.save(product);
    }
    
}
