package com.johan.cqrscqrsartifact.query.entity;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
@Data
public class ProductQuery {
    @Id
    private String id;
    private String name;
    private Double price;

    // Getters y setters
}

