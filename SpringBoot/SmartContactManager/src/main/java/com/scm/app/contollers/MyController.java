package com.scm.app.contollers;

import com.scm.app.entities.User;
import com.scm.app.helper.Message;
import com.scm.app.services.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // Handler for Home Page
    @GetMapping({ "/", "/index" })
    public String Home(Model model) {
        model.addAttribute("title", "Index Web Page");
        return "index";
    }

    // Handler for Login Page
    @GetMapping("/signin")
    public String loginPage(Model model) {
        model.addAttribute("title", "login page");
        return "login";
    }

    // Handler for Sign Up Page
    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("title", "signup page");
        model.addAttribute("user", new User());
        return "signup";
    }

    // Handler For Aboout Page.
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "about page");
        return new String("about");
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Working";
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping("/user")
    @ResponseBody
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/process_form")
    public String registerUser(@Valid @ModelAttribute("user") User u1,
            @RequestParam(defaultValue = "false") boolean agreement, Model model,
            RedirectAttributes redirectAttrs, BindingResult bindingResult) {

        try {

            if (!agreement) {
                System.out.println("You have not accepted Terms and Conditions.");
                throw new Exception("You have not accepted Terms and Conditions");
            }

            if (bindingResult.hasErrors()) {
                model.addAttribute("user", u1);
                System.out.println("inside binding result");
                return "signup";
            }

            // object coming from UI.
            System.out.println(u1);

            u1.setEnabled(true);
            u1.setRole("ROLE_USER");
            u1.setImageUrl("Default.png");
            u1.setPassword(passwordEncoder.encode(u1.getPassword()));

            User u2 = userService.saveUser(u1);

            // Saved User..
            System.out.println("Saved User: " + u2);
            model.addAttribute("user", new User());

            redirectAttrs.addFlashAttribute("message", new Message("Successfully Registered", "alert-success"));

            // session.setAttribute("message", new Message("Successfully Registered",
            // "alert-success"));
            return "redirect:/signup";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("user", u1);
            redirectAttrs.addFlashAttribute("message", new Message("something went wrong!!", "alert-danger"));

            // session.setAttribute("message", new Message("something went wrong!!",
            // "alert-danger"));
            return "redirect:/signup";
        }
    }

}
