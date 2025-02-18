package app.controller;

import app.model.Job;
import app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.findAll();
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.save(job);
    }
}
