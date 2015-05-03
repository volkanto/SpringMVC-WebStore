package com.packt.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.OrderService;

/**
 * @author life
 *
 */
@Service
public class OrderServiceImpl implements OrderService
{
	@Autowired
	private ProductRepository productRepository;   
	
	/* (non-Javadoc)
	 * @see com.packt.webstore.service.OrderService#processOrder(java.lang.String, java.lang.Integer)
	 */
	@Override
	public void processOrder(String argProductId, Integer argCount)
	{
		Product productById = this.productRepository.getProductById(argProductId);

		if (productById.getUnitsInStock() < argCount)
		{
			throw new IllegalArgumentException(
					"Out of Stock. Available Units in stock"
							+ productById.getUnitsInStock());
		}

		productById.setUnitsInStock(productById.getUnitsInStock() - argCount);
	}
}
