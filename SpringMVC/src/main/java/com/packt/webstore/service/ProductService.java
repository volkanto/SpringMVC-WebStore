package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
	Set<Product> getProductsByFilter(Map<String, List<String>> argFilterParams);
}
