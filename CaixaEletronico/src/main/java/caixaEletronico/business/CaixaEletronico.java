package caixaEletronico.business;

import caixaEletronico.model.Notas;

public class CaixaEletronico {

    public Notas fazerSeparacaoDeNotas(int valorSolicitado) {
        Notas notas = new Notas();

        int novoValor = 0;
 
        novoValor = valorSolicitado / 100;
        notas.setNota100(novoValor);
        novoValor = valorSolicitado - (100 * novoValor);

        novoValor = novoValor / 50;
        notas.setNota50(novoValor);
        novoValor = novoValor - (50 * novoValor);

        novoValor = novoValor / 20;
        notas.setNota20(novoValor);
        novoValor = novoValor - (20 * novoValor);

        novoValor = novoValor / 10;
        notas.setNota10(novoValor);
        novoValor = novoValor - (10 * novoValor);

        novoValor = novoValor / 5;
        notas.setNota5(novoValor);
        novoValor = novoValor - (5 * novoValor);

        novoValor = novoValor / 2;
        notas.setNota2(novoValor);
        novoValor = novoValor - (2 * novoValor);

        if (this.validarNotasRecebidas(valorSolicitado, notas)) {
            return notas;
        } else {
            return null;
        }

    }

    private boolean validarNotasRecebidas(int valorSolicitado, Notas notas) {

        int valorASerConferido = 0;

        valorASerConferido = (notas.getNota100() * 100) + valorASerConferido;
        valorASerConferido = (notas.getNota50() * 50) + valorASerConferido;
        valorASerConferido = (notas.getNota20() * 20) + valorASerConferido;
        valorASerConferido = (notas.getNota10() * 10) + valorASerConferido;
        valorASerConferido = (notas.getNota5() * 5) + valorASerConferido;
        valorASerConferido = (notas.getNota2() * 2) + valorASerConferido;

        if (valorASerConferido == valorSolicitado) {
            return true;
        } else {
            return false;
        }

    }

}
