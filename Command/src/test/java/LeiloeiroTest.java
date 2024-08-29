import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeiloeiroTest {

    Leiloeiro leiloeiro;
    Oferta ofertaCarro;

    @BeforeEach
    void setUp() {
        leiloeiro = new Leiloeiro();
        ofertaCarro = new Oferta("Carro");
    }

    @Test
    public void deveIniciarOferta() {
        Comando iniciarOferta = new IniciarOfertaComando(ofertaCarro);
        leiloeiro.setComando(iniciarOferta);
        leiloeiro.manipularOferta();

        assertEquals("A oferta para Carro foi iniciada.", iniciarOferta.executar());
    }


    @Test
    public void deveFinalizarOferta() {
        Comando finalizarOferta = new FinalizarOfertaComando(ofertaCarro);
        leiloeiro.setComando(finalizarOferta);
        leiloeiro.manipularOferta();

        assertEquals("A oferta para Carro foi finalizada.", finalizarOferta.executar());
    }
    @Test
    public void deveDesfazerIniciarOferta() {
        Comando iniciarOferta = new IniciarOfertaComando(ofertaCarro);
        leiloeiro.setComando(iniciarOferta);
        leiloeiro.manipularOferta();

        leiloeiro.desfazerUltimaOferta();
        assertEquals("A oferta para Carro foi finalizada.", iniciarOferta.desfazer());
    }
}
