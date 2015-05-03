package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author life
 *
 */
@Controller
public class HomeController
{
	/**
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String welcome(Model model)
	{
		model.addAttribute("greeting", "Welcome to Web Store!");
		model.addAttribute("tagline", "The one and only amazing webstore");

		return "welcome";
	}
}
