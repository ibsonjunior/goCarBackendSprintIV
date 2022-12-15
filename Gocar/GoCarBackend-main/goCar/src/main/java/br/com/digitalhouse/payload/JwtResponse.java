package br.com.digitalhouse.payload;

import java.util.List;

public class JwtResponse {

    private Long id;
    private String username;
    private String name;
    private String lastname;

    private List<String> roles;
    private String type = "Bearer";

    private String token;

    public JwtResponse( Long id, String username, String name, String lastname, List<String> roles, String token) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.roles = roles;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
