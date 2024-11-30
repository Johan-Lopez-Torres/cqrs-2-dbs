package com.johan.cqrscqrsartifact.query.repository;

import com.johan.cqrscqrsartifact.query.entity.ProductQuery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductQueryRepository extends MongoRepository<ProductQuery, String> {}

