package com.packt.webstore.domain.repository;

import java.util.List;

import com.packt.webstore.domain.Customer;

/**
 * @author life
 *
 */
public interface CustomerRepository
{
	List<Customer> getAllCustomers();
}
