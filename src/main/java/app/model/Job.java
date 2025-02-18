package app.model;

import jakarta.persistence.Entity;

@Entity

public class Job extends BaseEntity{
    private String title;
    private String description;
}
