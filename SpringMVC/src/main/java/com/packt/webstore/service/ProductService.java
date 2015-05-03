package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.Product;

/**
 * @author life
 *
 */
public interface ProductService
{
	List<Product> getAllProducts();
	Product getProductById(String argProductId);
	List<Product> getProductsByCategory(String argCategory);
}
