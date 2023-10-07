package com.FoskoSpringbootTr.MyLibrary.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Libri")
public class Libro {
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
    @Column
    private String titolo;
    @Column
    private String autore;
    @Column
    private Long isbn;

    public Libro(Long id, String titolo, String autore, Long isbn) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
    }
    public Libro(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
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
}
