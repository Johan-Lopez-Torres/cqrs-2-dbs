package com.johan.cqrscqrsartifact.command.event;

import lombok.*;
import org.springframework.context.ApplicationEvent;


@Getter
@Setter
public class ProductCreatedEvent extends ApplicationEvent {

    private Long productId;
    private String name;
    private Double price;

    public ProductCreatedEvent(Object source, Long productId, String name, Double price) {
        super(source);
        this.productId = productId;
        this.name = name;
        this.price = price;
    }



}
