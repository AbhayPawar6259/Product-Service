package com.e_mart.product.repository.service;

import com.e_mart.product.entity.ProductEntity;
import com.e_mart.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRepositoryService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductRepositoryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
}
