package com.example.thymeleaf.contorller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

	// controller for Home Page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homeHandler() {
		return "home";
	}

	// Controller for About Page..
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String aboutMethod(Model model) {
		model.addAttribute("name", "Demo Name");
		model.addAttribute("city", "Modinagar");
		return "about";
	}

	// Controller for Looping Page
	@RequestMapping(value = "/loop", method = RequestMethod.GET)
	public String loopHandler(Model model) {
		List<String> names = List.of("Abc", "Def", "Ghi", "Jkl");
		model.addAttribute("names", names);
		return "loop";
	}

	// Controller for Conditional Statement Page
	@RequestMapping(value = "/condition", method = RequestMethod.GET)
	public String conditionHandler(Model m) {
		m.addAttribute("isActive", "true");
		m.addAttribute("gender", 'F');
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		m.addAttribute("myList", list);
		return "condition";
	}

	// Handler for include/insert/replace fragment..
	@RequestMapping(value = "/includeFragment", method = RequestMethod.GET)
	public String includeFragmentHandler() {
		return "includeFragment";
	}

	// hander for passing dynamic data to Fragment.
	@RequestMapping(value = "/fragment", method = RequestMethod.GET)
	public String fragmentHandler(Model model) {
		model.addAttribute("title", "Demo Title");
		model.addAttribute("subtitle", "Subtitle Demo");
		return "fragment";
	}

	// handler related to inheritence.
	@RequestMapping(value = "/aboutnew", method = RequestMethod.GET)
	public String inheritance(Model model) {
		model.addAttribute("title", "Demo Title");
		model.addAttribute("subtitle", "Subtitle Demo");
		return "aboutnew";
	}
}
