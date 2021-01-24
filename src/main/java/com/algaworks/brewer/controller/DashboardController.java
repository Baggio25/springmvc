package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DashboardController {

	@GetMapping
	public ModelAndView iniciar() {
		ModelAndView mv = new ModelAndView("/Dashboard");
		return mv;
	}
	
}
