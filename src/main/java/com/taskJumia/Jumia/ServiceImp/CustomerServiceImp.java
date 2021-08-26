package com.taskJumia.Jumia.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskJumia.Jumia.Service.CustomerService;
import com.taskJumia.Jumia.models.Customer;
import com.taskJumia.Jumia.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepository repo;

	@Override
	public List<Customer> findAllCustomers() {
		List<Customer> listCustomer = repo.findAll();

		return listCustomer;
	}

	@Override
	public Customer findByphone(String numPhone) {
		// TODO Auto-generated method stub
		return repo.findByphone(numPhone);
	}

}
