package com.FoskoSpringbootTr.MyLibrary.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Local_User")
public class LocalUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable=false)
    private Long id;
    @Column(name = "nome",nullable=false)
    private String nome;
    @Column(name = "cognome",nullable=false)
    private String cognome;
    @Column(name = "email",nullable = false,unique = true,length=320 )
    private String email;
    @Column(name = "username",nullable = false,unique = true)
    private String username;
    @Column(name = "password",nullable = false,unique = true,length=1000)
    private String password;

    public LocalUser(Long id, String nome, String cognome, String email, String username, String password) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
