package com.johan.cqrscqrsartifact.query;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductQueryRepository extends MongoRepository<ProductQuery, String> {}

