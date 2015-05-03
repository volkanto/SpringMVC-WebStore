package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import com.packt.webstore.service.CustomerService;

/**
 * @author life
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired private CustomerRepository customerRepository;
	
	/* (non-Javadoc)
	 * @see com.packt.webstore.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<Customer> getAllCustomers()
	{
		return this.customerRepository.getAllCustomers();
	}

}
