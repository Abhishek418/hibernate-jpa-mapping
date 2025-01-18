package com.learning.hibernate.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.hibernate.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
