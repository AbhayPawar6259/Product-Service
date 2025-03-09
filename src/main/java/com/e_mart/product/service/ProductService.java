package com.e_mart.product.service;

import com.e_mart.product.entity.ProductEntity;
import com.e_mart.product.repository.ProductRepository;
import com.e_mart.product.repository.service.ProductRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepositoryService productRepositoryService;

    @Autowired
    public ProductService(ProductRepositoryService productRepositoryService) {
        this.productRepositoryService = productRepositoryService;
    }

    public List<ProductEntity> getAllProducts() {
        return productRepositoryService.getAllProducts();
    }
}
