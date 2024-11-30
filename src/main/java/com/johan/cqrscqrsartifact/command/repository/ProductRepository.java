package com.johan.cqrscqrsartifact.command.repository;

import com.johan.cqrscqrsartifact.command.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
