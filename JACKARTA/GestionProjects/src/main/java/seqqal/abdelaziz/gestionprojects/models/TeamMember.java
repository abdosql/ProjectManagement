package seqqal.abdelaziz.gestionprojects.models;

import javax.persistence.*;

@Entity
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teammember_id;

    private String name;

    private String email;

    private String role;

    // Constructors
    public TeamMember() {
    }

    public TeamMember(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters and Setters
    public Integer getTeammember_id() {
        return teammember_id;
    }

    public void setTeammember_id(Integer teammember_id) {
        this.teammember_id = teammember_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
