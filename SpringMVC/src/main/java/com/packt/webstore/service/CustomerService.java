package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.Customer;

/**
 * @author life
 *
 */
public interface CustomerService
{
	List<Customer> getAllCustomers();
}
