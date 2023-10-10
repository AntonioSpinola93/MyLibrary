package com.FoskoSpringbootTr.MyLibrary.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Indirizzo")
public class Indirizzo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "address_line_1",nullable = false)
    private String indirizzoLinea1;
    @Column(name = "address_line_2")
    private String indirizzoLinea2;
    @Column(name = "Città",nullable = false)
    private String city;
    @Column(name = "provincia",nullable = false)
    private String provincia;
    @Column(name = "Cap",nullable = false,length = 5)
    private Integer cap;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private LocalUser user;

    public Indirizzo(Long id, String indirizzoLinea1, String indirizzoLinea2, String city, String provincia, Integer cap, LocalUser user) {
        this.id = id;
        this.indirizzoLinea1 = indirizzoLinea1;
        this.indirizzoLinea2 = indirizzoLinea2;
        this.city = city;
        this.provincia = provincia;
        this.cap = cap;
        this.user = user;
    }
    public Indirizzo(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndirizzoLinea1() {
        return indirizzoLinea1;
    }

    public void setIndirizzoLinea1(String indirizzoLinea1) {
        this.indirizzoLinea1 = indirizzoLinea1;
    }

    public String getIndirizzoLinea2() {
        return indirizzoLinea2;
    }

    public void setIndirizzoLinea2(String indirizzoLinea2) {
        this.indirizzoLinea2 = indirizzoLinea2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Integer getCap() {
        return cap;
    }

    public void setCap(Integer cap) {
        this.cap = cap;
    }

    public LocalUser getUser() {
        return user;
    }

    public void setUser(LocalUser user) {
        this.user = user;
    }
}
