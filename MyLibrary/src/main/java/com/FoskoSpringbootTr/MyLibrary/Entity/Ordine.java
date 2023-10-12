package com.FoskoSpringbootTr.MyLibrary.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Ordine")
public class Ordine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ordine_id",nullable = false)
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private LocalUser user;
    @ManyToOne(optional = false)
    @JoinColumn(name = "indirizzo_id",nullable = false)
    private Indirizzo indirizzo;
    @OneToMany(mappedBy = "ordine",cascade = CascadeType.REMOVE,orphanRemoval = true)
    private List<OrdineQantita> quantita=new ArrayList<>();

    public List<OrdineQantita> getQuantita() {
        return quantita;
    }

    public void setQuantita(List<OrdineQantita> quantita) {
        this.quantita = quantita;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalUser getUser() {
        return user;
    }

    public void setUser(LocalUser user) {
        this.user = user;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }
}
