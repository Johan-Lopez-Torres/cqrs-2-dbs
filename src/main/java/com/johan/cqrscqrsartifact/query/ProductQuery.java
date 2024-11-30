package com.johan.cqrscqrsartifact.query;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@Data
public class ProductQuery {
    @Id
    private String id;
    private String name;
    private Double price;

    // Getters y setters
}

