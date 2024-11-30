package com.johan.cqrscqrsartifact.query.service;

import com.johan.cqrscqrsartifact.query.repository.ProductQueryRepository;
import com.johan.cqrscqrsartifact.query.entity.ProductQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductQueryService {
    private final ProductQueryRepository productQueryRepository;

    public ProductQueryService(ProductQueryRepository productQueryRepository) {
        this.productQueryRepository = productQueryRepository;
    }

    public List<ProductQuery> getAllProducts() {
        return productQueryRepository.findAll();
    }
}
