package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.service.CustomerService;

/**
 * @author life
 *
 */
@Controller
public class CustomerController
{
	@Autowired 
	private CustomerService customerService;
	
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/customers")
	public String customerList(Model model)
	{
		model.addAttribute("customers", this.customerService.getAllCustomers());
		return "customers";
	}

}
