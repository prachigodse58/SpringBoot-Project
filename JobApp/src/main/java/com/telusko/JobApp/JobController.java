package com.telusko.JobApp;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public String home(){
        return "home";//this refers to home.html
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }
    @PostMapping("handleForm")
    public String success(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }
    @GetMapping("viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobs= service.getAllJobs();
        m.addAttribute("JobPosts", jobs);
    return "viewalljobs";
    }
}
