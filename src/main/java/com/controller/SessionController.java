package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.CustomerAddressEntity;
import com.entity.CustomerEntity;
import com.repository.CustomerAddressRepository;
import com.repository.CustomerRepository;

@RestController
public class SessionController {

	@Autowired
	CustomerRepository customerrepo;
	
	@Autowired
	CustomerAddressRepository addressrepo;
	
	@PostMapping("/customersignup")
	public CustomerEntity customerSignup(@RequestBody CustomerEntity customerentity)
	{
		customerrepo.save(customerentity);
		return customerentity;
	}
	
	@PostMapping("/customeraddress")
	public CustomerAddressEntity customeraddress(@RequestBody CustomerAddressEntity addressentity)
	{
		addressrepo.save(addressentity);
		return addressentity;
	}
	
}
