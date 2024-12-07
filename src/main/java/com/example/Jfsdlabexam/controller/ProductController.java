package com.example.Jfsdlabexam.controller;

import com.example.Jfsdlabexam.model.Product;
import com.example.Jfsdlabexam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> viewAllProducts() {
        return productService.getAllProducts();
    }
}
