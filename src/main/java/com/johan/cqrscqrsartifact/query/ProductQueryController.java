package com.johan.cqrscqrsartifact.query;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/queries/products")
public class ProductQueryController {
    private final ProductQueryService productQueryService;

    public ProductQueryController(ProductQueryService productQueryService) {
        this.productQueryService = productQueryService;
    }

    @GetMapping("/get-producto")
    public ResponseEntity<List<ProductQuery>> getAllProducts() {
        return ResponseEntity.ok(productQueryService.getAllProducts());
    }
}
