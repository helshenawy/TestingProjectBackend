package com.taskJumia.Jumia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskJumia.Jumia.Service.CustomerService;
import com.taskJumia.Jumia.models.Customer;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> listAll() {

		return customerService.findAllCustomers();
	}
	
 
 
	
}
