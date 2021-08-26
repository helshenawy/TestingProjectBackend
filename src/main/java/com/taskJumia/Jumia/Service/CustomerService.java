package com.taskJumia.Jumia.Service;

import java.util.List;

import com.taskJumia.Jumia.models.Customer;

public interface CustomerService {

	public List<Customer> findAllCustomers();
	
	public Customer findByphone(String numPhone);
}
