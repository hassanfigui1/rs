package app.service;

import app.model.Job;
import app.repository.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class JobService extends GenericService<Job> {
    public JobService(JobRepository repository) {
        super(repository);
    }
}
