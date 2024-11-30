package com.johan.cqrscqrsartifact.query;

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
