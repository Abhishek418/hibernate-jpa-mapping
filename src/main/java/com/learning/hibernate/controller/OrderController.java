package com.learning.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.hibernate.dto.OrderRequest;
import com.learning.hibernate.entity.Customer;
import com.learning.hibernate.entity.repository.CustomerRepo;
import com.learning.hibernate.entity.repository.ProductRepo;


@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
		Customer customer = orderRequest.getCustomer();
		return customerRepo.save(customer);
		
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrder(){
		return customerRepo.findAll();
	}

}
