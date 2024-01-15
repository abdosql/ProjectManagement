package seqqal.abdelaziz.gestionprojects.models;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer task_id;

    private String description;

    private boolean status;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "teammember_id")
    private TeamMember teamMember;

    // Constructors
    public Task() {
    }

    public Task(String description, boolean status, Project project, TeamMember teamMember) {
        this.description = description;
        this.status = status;
        this.project = project;
        this.teamMember = teamMember;
    }

    // Getters and Setters
    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public TeamMember getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(TeamMember teamMember) {
        this.teamMember = teamMember;
    }
}
