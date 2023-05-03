package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;

@Service
public interface CustomerService {
	
	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomer();


}
