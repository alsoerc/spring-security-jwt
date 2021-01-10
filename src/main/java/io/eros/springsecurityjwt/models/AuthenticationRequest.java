package io.eros.springsecurityjwt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userCredentials")
public class AuthenticationRequest {

    @Id
    private int id;

    @Column(name = "nombre")
    private String username;

    @Column(name = "clave")
    private String password;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
