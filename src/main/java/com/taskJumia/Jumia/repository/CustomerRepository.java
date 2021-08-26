package com.taskJumia.Jumia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.taskJumia.Jumia.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer  findByphone(@Param(value = "numPhone") String numPhone);
	
	
}
