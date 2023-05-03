package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController

public class CustomerController {
	@Autowired
	CustomerService customerservice;
	
	
	@PostMapping(value="/customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customerservice.addCustomer(customer);
	}
	@GetMapping(value="/customer")
	public List<Customer> getAllCustomer()
	{
		return customerservice.getAllCustomer();
	}
	
}
