package com.packt.webstore.domain.repository;

import java.util.List;
import com.packt.webstore.domain.Product;

/**
 * @author life
 *
 */
public interface ProductRepository
{
	List<Product> getAllProducts();
	Product getProductById(String argProductId);
	List<Product> getProductsByCategory(String argCategory);
}
