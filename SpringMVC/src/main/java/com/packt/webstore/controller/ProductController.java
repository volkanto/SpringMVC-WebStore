package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.packt.webstore.service.OrderService;
import com.packt.webstore.service.ProductService;

/**
 * @author life
 *
 */
@Controller
@RequestMapping("/products")
public class ProductController
{
	@Autowired 
	private OrderService orderService;
	@Autowired 
	private ProductService productService;
	
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping
	public String list(Model model)
	{
		model.addAttribute("products", this.productService.getAllProducts());
		return "products";
	}
	
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/all")
	public ModelAndView allProducts()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("products", this.productService.getAllProducts());
		modelAndView.setViewName("products");
		
		return modelAndView;
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/order/P1234/2")
	public String process()
	{
		this.orderService.processOrder("P1234", 2);
		return "redirect:/products";
	}
	
	@RequestMapping("/{category}")
	public String getProductsByCategory(Model model, @PathVariable(value="category") String argCategory)
	{
		model.addAttribute("products", this.productService.getProductsByCategory(argCategory));
		return "products";
	}
	
}
