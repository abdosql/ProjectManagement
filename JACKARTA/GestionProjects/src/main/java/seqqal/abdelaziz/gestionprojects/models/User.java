package seqqal.abdelaziz.gestionprojects.models;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String login;

    private String password;

    @ManyToOne
    @JoinColumn(name = "teammember_id")
    private TeamMember teamMember;

    // Constructors
    public User() {
    }

    public User(String login, String password, TeamMember teamMember) {
        this.login = login;
        this.password = password;
        this.teamMember = teamMember;
    }

    // Getters and Setters
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TeamMember getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(TeamMember teamMember) {
        this.teamMember = teamMember;
    }
}
