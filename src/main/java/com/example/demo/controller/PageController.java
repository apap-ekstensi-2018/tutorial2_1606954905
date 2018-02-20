package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController
{
	 @RequestMapping("/hello")
	 public String index ()
	 {
		 return "hello";
	 }
	 
	 @RequestMapping("/greeting")
	// public String greeting (@RequestParam(value = "name", required = false) String
	//		 name, Model model)
	 public String greeting (@RequestParam(value = "name", required = false,
	 defaultValue = "dunia") String name, Model model)
	 {
	  model.addAttribute ("name​", name);
	  return "greeting";
	 }
}