package org.example;

public class Oferta {
    private String item;

    public Oferta(String item) {
        this.item = item;
    }

    public String iniciar() {
        return "A oferta para " + item + " foi iniciada.";
    }

    public String finalizar() {
        return "A oferta para " + item + " foi finalizada.";
    }
}
