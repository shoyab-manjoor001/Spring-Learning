package com.example.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.validation.entities.User;

import jakarta.validation.Valid;

@Controller
public class MyContorller {

	@GetMapping("/first")
	public String firstHandler() {
		return "first";
	}

	// @GetMapping("/form")
	// public String formHandler(Model model) {
	// model.addAttribute("entity", new Entity());
	// return "myform";
	// }

	// // Handler for Submit form ...
	// @PostMapping("/submitform")
	// public String submitHandler(@ModelAttribute Entity entity, Model model) {
	// model.addAttribute("e", entity);
	// System.out.println(entity.toString());
	// return "submit";
	// }

	@GetMapping("/form")
	public String formHandler(Model model) {
		model.addAttribute("user", new User());
		return "myform";
	}

	// Handler for Submit form ...
	@PostMapping("/submitform")
	public String submitHandler(@Valid User user, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "myform";
		}
		model.addAttribute("e", user);
		System.out.println(user.toString());
		return "submit";
	}
}
