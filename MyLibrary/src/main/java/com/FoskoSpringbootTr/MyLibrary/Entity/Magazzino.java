package com.FoskoSpringbootTr.MyLibrary.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Magazzino")
public class Magazzino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "libro_id",nullable = false,unique = true)
    private Libro libro;
    @Column(name = "quantita")
    private Integer quantitaInStock;

    public Integer getQuantitaInStock() {
        return quantitaInStock;
    }

    public void setQuantitaInStock(Integer quantitaInStock) {
        this.quantitaInStock = quantitaInStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
