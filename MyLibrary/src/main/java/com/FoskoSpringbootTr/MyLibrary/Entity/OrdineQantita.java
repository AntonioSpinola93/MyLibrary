package com.FoskoSpringbootTr.MyLibrary.Entity;


import jakarta.persistence.*;

/*
Questa tabella tiene traccia della quantità ordinata di un prodotto
 */
@Entity
@Table(name = "ordine_quantita")
public class OrdineQantita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    // Il prodotto ordinato
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_libro",nullable = false)
    private Libro libro;
    //la quantità ordinata
    @Column(name = "quantita",nullable = false)
    private Integer quantitaOrdinata;
    //L' ordine stesso
    @ManyToOne(optional = false)
    @JoinColumn(name = "ordine_id",nullable = false)
    private Ordine ordine;

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

    public Integer getQuantitaOrdinata() {
        return quantitaOrdinata;
    }

    public void setQuantitaOrdinata(Integer quantitaOrdinata) {
        this.quantitaOrdinata = quantitaOrdinata;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }
}
