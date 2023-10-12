package com.FoskoSpringbootTr.MyLibrary.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Libri")
public class Libro extends Prodotto {
    /*
    La classe Libro al momento emula un libro avente come attributi titolo autore e codice univoco isbn
    Il prossimo step sarà quello di rendere autore una entity a parte per creare una relazione una a molti 1 autore + opere
    Un ulteriore step possibile sarà quello di aggiungere un .jpg copertina per dare un immagine del libro al front end
    Possibili idee saranno interazione con utente/ cliente per prestito o vendita ancora da definire
    Ulteriore step aggiungere enumerato GENERE libro da sviluppare

     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Titolo")
    private String nomeProdotto;
    @Column(name = "Autore")
    private String autore;
    @Column(name = "ISBN")
    private Long isbn;
    @Column(name = "Prezzo")
    private Double prezzo;
    @OneToOne(mappedBy = "libro",cascade = CascadeType.REMOVE,optional = false,orphanRemoval = true)
    private Magazzino magazzino;


    public Libro(Long id, String nomeProdotto,String autore,Long isbn, Double prezzo) {
        super(nomeProdotto, prezzo);
        this.id=id;
        this.autore=autore;
        this.isbn=isbn;
    }
    public Libro(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    @Override
    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
}


