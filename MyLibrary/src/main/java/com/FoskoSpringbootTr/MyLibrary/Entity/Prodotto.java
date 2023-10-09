package com.FoskoSpringbootTr.MyLibrary.Entity;

public abstract class Prodotto {
    private String nomeProdotto;
    private Double prezzo;

    public Prodotto(String nomeProdotto, Double prezzo) {
        this.nomeProdotto = nomeProdotto;
        this.prezzo = prezzo;
    }

    public Prodotto() {

    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public Double getPrezzo() {
        return prezzo;
    }
}
