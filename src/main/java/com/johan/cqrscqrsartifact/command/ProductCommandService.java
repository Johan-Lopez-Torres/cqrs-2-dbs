package com.johan.cqrscqrsartifact.command;

import com.johan.cqrscqrsartifact.Product;
import com.johan.cqrscqrsartifact.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductCommandService {
    private final ProductRepository productRepository;

    public ProductCommandService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(String name, Double price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        return productRepository.save(product);
    }
}
