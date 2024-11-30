package com.johan.cqrscqrsartifact;

import com.johan.cqrscqrsartifact.query.ProductQuery;
import com.johan.cqrscqrsartifact.query.ProductQueryRepository;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ProductEventListener {
    private final ProductQueryRepository productQueryRepository;

    public ProductEventListener(ProductQueryRepository productQueryRepository) {
        this.productQueryRepository = productQueryRepository;
    }

    @EventListener
    public void handleProductCreatedEvent(ProductCreatedEvent event) {
        ProductQuery productQuery = new ProductQuery();
        productQuery.setId(event.getProductId().toString());
        productQuery.setName(event.getName());
        productQuery.setPrice(event.getPrice());
        productQueryRepository.save(productQuery);
    }
}
