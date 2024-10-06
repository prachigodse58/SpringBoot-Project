package com.telusko.JobApp.repo;

import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(55, "Java Developer", "Must have good experience in core Java and advanced Java", 2, Arrays.asList("Spring Boot", "Core Java")),
            new JobPost(43, "Full Stack Developer", "Experience in both frontend and backend technologies", 3, Arrays.asList("React", "Node.js", "MongoDB")),
            new JobPost(33, "DevOps Engineer", "Experience in CI/CD pipelines and cloud infrastructure", 4, Arrays.asList("AWS", "Docker", "Kubernetes")),
            new JobPost(45, "Data Scientist", "Knowledge in machine learning and data analysis", 2, Arrays.asList("Python", "TensorFlow", "Pandas")),
            new JobPost(52, "Mobile App Developer", "Expertise in developing Android and iOS apps", 3, Arrays.asList("Flutter", "Kotlin", "Swift"))
    ));


    public List<JobPost> getAllJobs(){
        return jobs;

   }
   public void addJob(JobPost job){
        jobs.add(job);
       System.out.print(jobs);
   }
}
