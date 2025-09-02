package dev.nathan.CRUD.repository;

import dev.nathan.CRUD.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
