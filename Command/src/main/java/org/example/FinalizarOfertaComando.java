package org.example;

public class FinalizarOfertaComando implements Comando {
    private Oferta oferta;

    public FinalizarOfertaComando(Oferta oferta) {
        this.oferta = oferta;
    }

    public String executar() {
        return oferta.finalizar();
    }

    public String desfazer() {
        return oferta.iniciar();
    }
}
