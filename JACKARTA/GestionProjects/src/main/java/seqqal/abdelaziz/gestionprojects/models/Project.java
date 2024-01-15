package seqqal.abdelaziz.gestionprojects.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer project_id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date start_date;

    @Temporal(TemporalType.DATE)
    private Date end_date;

    // Constructors
    public Project() {
    }

    public Project(String name, Date start_date, Date end_date) {
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    // Getters and Setters
    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}