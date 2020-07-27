package com.mvc.get;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/regestration")
	public String welcome(Model model) {
		
		model.addAttribute("reservation",new Products());
		return "form";
	}
	
	@RequestMapping("/submitForm")
	public String submite(@ModelAttribute("reservation") Products product) throws SQLException {
		
		Connections con = new Connections();
		int id = con.save(product);
		System.out.println(id);
		return "confirm";	
	}
	
	@RequestMapping("/getproducts")
	public String getProducts(Model model) {
		Connections con = new Connections();
		List<Products> list = con.getAll();
		model.addAttribute("lists", list);
		for(Products p: list)
			System.out.println(p);
		return "allproducts";
		
	}
}
