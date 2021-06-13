package com.company;

import java.util.Arrays;

public class Domino {
    private Integer[] domino;
    private Integer soma;

    public Domino(Integer[] domino) {
        this.domino = domino;
    }

    public Integer getSoma() {
        return soma;
    }

    public Integer[] getDomino() {
        return domino;
    }

    public Domino(Integer x, Integer y){
        Integer[] d = new Integer[2];
        d[0] = x;
        d[1] = y;
        this.soma = x + y;
        this.domino = d;
    }

    public Domino swap(Domino domino) {
        int a = domino.domino[0];
        domino.domino[0] = domino.domino[1];
        domino.domino[1] = a;
        return domino;

    }

    @Override
    public String toString() {
        return "Domino{" +
                "domino=" + Arrays.toString(domino) +
                '}';
    }
}
