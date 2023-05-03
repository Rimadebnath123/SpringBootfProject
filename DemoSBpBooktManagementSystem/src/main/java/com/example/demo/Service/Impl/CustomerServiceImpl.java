package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Service.CustomerService;

@Repository
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerrepository;
	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerrepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerrepository.findAll();
	}

}
