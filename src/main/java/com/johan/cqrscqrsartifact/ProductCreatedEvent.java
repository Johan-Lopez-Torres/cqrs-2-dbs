package com.johan.cqrscqrsartifact;

import lombok.Data;

@Data
public class ProductCreatedEvent {
    private Long productId;
    private String name;
    private Double price;

    // Constructor, getters y setters
}
