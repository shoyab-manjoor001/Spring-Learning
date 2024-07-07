package com.example.SpringBootMVC.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    // using HttpServletRequest.....
//    @RequestMapping("submit")
//    public String submit(HttpServletRequest httpServletRequest, HttpSession httpSession)
//    {
//        System.out.println("Inside...s");
//        int input1 = Integer.parseInt(httpServletRequest.getParameter("input1"));
//        int input2 = Integer.parseInt(httpServletRequest.getParameter("input2"));
//        int res =  input1 + input2;
//        httpSession.setAttribute("res",res);
//        return "result.jsp";
//    }



//    @RequestMapping("submit")
//    public String submit(int input1 , int input2 , HttpSession httpSession)
//    {
//        int res =  input1 + input2;
//        httpSession.setAttribute("res",res);
//        return "result.jsp";
//    }

    // using RequestParam annotaion...
//    @RequestMapping("submit")
//    public String submit(@RequestParam("input1") int input1 ,@RequestParam("input2") int input2, HttpSession httpSession)
//    {
//        int res =  input1 + input2;
//        httpSession.setAttribute("res",res);
//        return "result.jsp";
//    }

    // using  RequestMapping annotation and  Model object...
    @RequestMapping("submit")
    public String submit(@RequestParam("input1") int input1 , @RequestParam("input2") int input2, Model model)
    {
        int res =  input1 + input2;
        model.addAttribute("res",res);
        return "result";
    }
}
