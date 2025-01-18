package com.learning.hibernate.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.hibernate.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
