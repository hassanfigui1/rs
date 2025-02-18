package app.model;

import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

public class JobApplication extends BaseEntity{
    @ManyToOne
    private Candidate candidate;
    @ManyToOne
    private Job job;
    private String status;

}
