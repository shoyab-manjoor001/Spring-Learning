package com.example.thymeleaf.contorller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homeHandler() {
		return "home";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String aboutMethod(Model model) {
		model.addAttribute("name", "Demo Name");
		model.addAttribute("city", "Modinagar");
		return "about";
	}

	@RequestMapping(value = "/loop", method = RequestMethod.GET)
	public String loopHandler(Model model) {

		List<String> names = List.of("Abc", "Def", "Ghi", "Jkl");
		model.addAttribute("names", names);
		return "loop";
	}

}
