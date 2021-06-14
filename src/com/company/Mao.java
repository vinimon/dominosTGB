package com.company;

import java.util.Arrays;

public class Mao {
    private Integer quant;
    private Domino[] mao;
    private int soma;

    public Mao(Integer quant, Domino[] mao) {
        this.quant = quant;
        this.mao = mao;
    }

    public Mao() {

    }

    public Integer getQuant() {
        return quant;
       
    }
    public int getSoma() {
        return soma;
       
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Domino[] getMao() {
        return mao;
    }

    public boolean verificaSeEhPar(Domino[] dominos) {
        int soma = 0;
        for (int i = 1; i < dominos.length; i++) {
            soma += dominos[i].getSoma();
        }
        if (soma % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaMatch(Mao mao) {
        if (somaPosicao(0, mao) == somaPosicao(1, mao)) {
            return true;
        } else {
            return false;
        }
    }

    public Integer[] somaMao(Mao mao) {
        int somaCima = 0;
        int somaBaixo = 0;
        Domino[] dominos = mao.getMao();

        for (int i = 0; i < dominos.length; i++) {
            somaCima += dominos[i].getDomino()[0];
            somaBaixo += dominos[i].getDomino()[1];
        }
        Integer[] response = new Integer[2];
        response[0] = somaCima;
        response[1] = somaBaixo;
        return response;
    }

    // soma cima ou baixo, passando em posicao
    public Integer somaPosicao(int posicao, Mao mao) {
        int soma = 0;
        Domino[] dominos = mao.getMao();

        for (int i = 0; i < dominos.length; i++) {
            soma += dominos[i].getDomino()[posicao];
        }
        this.soma= soma;
        return soma;
    }

    public void swap(Mao mao, int pos) {

        Domino[] dominos = mao.getMao();

        dominos[0].swap(dominos[pos]);

    }

    @Override
    public String toString() {
        return "Mao{" + "quant=" + quant + ", mao=" + Arrays.toString(mao) + '}';
    }
}
