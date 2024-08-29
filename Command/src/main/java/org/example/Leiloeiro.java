package org.example;

import java.util.Stack;

public class Leiloeiro {
    private Comando comandoAtual;
    private Stack<Comando> historicoComandos = new Stack<>();

    public void setComando(Comando comando) {
        this.comandoAtual = comando;
    }

    public void manipularOferta() {
        comandoAtual.executar();
        historicoComandos.push(comandoAtual);
    }

    public void desfazerUltimaOferta() {
        if (!historicoComandos.isEmpty()) {
            Comando comando = historicoComandos.pop();
            comando.desfazer();
        }
    }
}
