package com.FoskoSpringbootTr.MyLibrary.Dto;

public class LibroDto {
    private Long id;
    private String nomeProdotto;
    private String autore;
    private Long isbn;
    private Double prezzo;

    public LibroDto(Long id, String nomeProdotto, String autore, Long isbn, Double prezzo) {
        this.id = id;
        this.nomeProdotto = nomeProdotto;
        this.autore = autore;
        this.isbn = isbn;
        this.prezzo = prezzo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
}
