package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@Controller
public class PageController {
	@RequestMapping("/hello")
	public String index() {
		return "hello";
	}
	
	//@RequestMapping("/greeting")
	//public String greeting (@RequestParam(value = "name", required = false, defaultValue = "dunia") String name, Model model)
//	{
	// model.addAttribute ("name​", name);
	// return "greeting";
//	}
	
	@RequestMapping(value = {"/greeting", "greeting/{name}"})
	public String greetingPath(@PathVariable Optional<String> name, Model model) {
		
		if (name.isPresent()) {
			model.addAttribute("name", name.get());
		} 
		else {
			model.addAttribute("name", "apap");
		}
		
	return "greeting";
	
	}
	
	@RequestMapping("/perkalian")
	public String Perkalian(
			@RequestParam(value="a", required=false) Integer a, 
			@RequestParam(value="b", required=false) Integer b, 
			Model model) {
		System.out.println(b);
		
		if (a==null)
		{
			a = 0;
		}
		if (b==null)
		{
			b = 0;
		}
		 Integer hasil = a*b;
		model.addAttribute("hasilperkalian", a + " X " + b + " = " +hasil);
		System.out.println(model);
	return "perkalian";
	
	}
	
}