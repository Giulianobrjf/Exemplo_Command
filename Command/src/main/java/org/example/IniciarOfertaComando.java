package org.example;

public class IniciarOfertaComando implements Comando {
    private Oferta oferta;

    public IniciarOfertaComando(Oferta oferta) {
        this.oferta = oferta;
    }

    public String executar() {
        return oferta.iniciar();
    }

    public String desfazer() {
        return oferta.finalizar();
    }
}
