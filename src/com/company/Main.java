package com.company;

import java.io.IOException;

public class Main {

    static Mao[] maos = new Mao[3];

    public static void main(String[] args) throws IOException {
//        Importador_CSV.CSV_reader("C:/dominos.csv");

        Domino a = new Domino(3, 4);
        Domino b = new Domino(4, 3);
        Domino[] c = new Domino[2];
        c[0] = a;
        c[1] = b;
        Mao mao = new Mao(2, c);
//        mao.somaPosicao(0, mao);
        System.out.println(mao.verificaMatch(mao));








    }
}
