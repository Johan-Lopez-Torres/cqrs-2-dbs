package com.johan.cqrscqrsartifact.command.controller;

import com.johan.cqrscqrsartifact.command.entity.Product;
import com.johan.cqrscqrsartifact.command.service.ProductCommandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/commands/products")
public class ProductCommandController {
    private final ProductCommandService productCommandService;

    public ProductCommandController(ProductCommandService productCommandService) {
        this.productCommandService = productCommandService;
    }

    @PostMapping("create-product")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productCommandService.createProduct(product.getName(), product.getPrice());
        return ResponseEntity.ok(createdProduct);
    }
}
