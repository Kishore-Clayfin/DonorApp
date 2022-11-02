package com.cf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomePageController 
{
	@GetMapping("/home")
	public ModelAndView homePage()
	{
		ModelAndView mv=new ModelAndView("homepage");
		return mv;
	}
}
