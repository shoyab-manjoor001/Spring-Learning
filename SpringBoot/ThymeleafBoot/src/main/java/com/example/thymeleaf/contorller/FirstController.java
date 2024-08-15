package com.example.thymeleaf.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FirstController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String aboutMethod(Model model) {
		model.addAttribute("name", "Demo Name");
		model.addAttribute("city", "Modinagar" );
		return "about";
	}

}
