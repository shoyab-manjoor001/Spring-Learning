package com.example.JobApp.controller;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping({"/","home"})
    public String home()
    {
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob()
    {
        return "addjob";
    }

    @RequestMapping(method = RequestMethod.POST,path = "handleForm")
    public String handleForm(JobPost jobPost)
    {
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model)
    {
        List<JobPost> jobs = jobService.getAllJobs();
        model.addAttribute("jobPosts",jobs);
      return "viewalljobs";
    }
}
