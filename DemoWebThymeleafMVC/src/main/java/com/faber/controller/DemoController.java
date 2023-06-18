package com.faber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DemoController {
	
	//DOC https://spring.io/guides/gs/serving-web-content/
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name",name);//Modelo de spring para agg variables a la vista
	        return "greeting"; //página a navegar
	  }

}
