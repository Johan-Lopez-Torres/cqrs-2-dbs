package com.johan.cqrscqrsartifact.command.service;

import com.johan.cqrscqrsartifact.command.entity.Product;
import com.johan.cqrscqrsartifact.command.event.ProductCreatedEvent;
import com.johan.cqrscqrsartifact.command.repository.ProductRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ProductCommandService {
    private final ProductRepository productRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public ProductCommandService(ProductRepository productRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.productRepository = productRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Product createProduct(String name, Double price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        ProductCreatedEvent productCreatedEvent = new ProductCreatedEvent(this, product.getId(), product.getName(), product.getPrice());
        applicationEventPublisher.publishEvent(productCreatedEvent);
        return productRepository.save(product);

    }
}
