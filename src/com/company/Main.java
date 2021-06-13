package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Mao[] maos = Importador_CSV.CSV_reader("C:/dominos.csv");


        Domino a = new Domino(3, 4);
        Domino b = new Domino(4, 3);
        Domino[] c = new Domino[2];
        c[0] = a;
        c[1] = b;
        Mao mao = new Mao();
//        mao.somaPosicao(0, mao);

        for (int i = 0; i < maos.length; i++){
            System.out.println(mao.verificaMatch(maos[i]));;
        }










    }
}
