package com.example.SpringMVC.Controller;

import com.example.SpringMVC.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {


    // using ModelandView Object to set View and Attributes...
//    @RequestMapping("addingAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int id , @RequestParam("aname") String name,ModelAndView modelAndView)
//    {
//        Alien alien = new Alien();
//        alien.setAid(id);
//        alien.setAname(name);
//        modelAndView.addObject("al",alien);
//        modelAndView.setViewName("showAlien");
//        return modelAndView;
//    }

    // without using ModelandView Object And Model Attribute...
//    @RequestMapping("addingAlien")
//    public String addAlien(Alien alien)
//    {
//        Alien alien = new Alien();
//        alien.setAid(id);
//        alien.setAname(name);
//        modelAndView.addObject("al",alien);
//        modelAndView.setViewName("showAlien");
//        return modelAndView;
//        return "showAlien" ;
//}

    // using ModelandView Object And Model Attribute...
    @RequestMapping("addingAlien")
    public ModelAndView addAlien(@ModelAttribute("alien") Alien alien,ModelAndView modelAndView)
    {
        modelAndView.addObject("alien",alien);
        modelAndView.setViewName("showAlien");
        return modelAndView;
    }

}
