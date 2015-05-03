package com.packt.webstore.service;

/**
 * @author life
 *
 */
public interface OrderService
{
	void processOrder(String argProductId, Integer argCount);
}
