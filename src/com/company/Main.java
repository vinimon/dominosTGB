package com.company;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Mao[] maos = Importador_CSV.CSV_reader("C:/Users/Pichau/Documents/dominos.csv");

        /*
         * Domino a = new Domino(3, 4); Domino b = new Domino(4, 3); Domino[] c = new
         * Domino[2]; c[0] = a; c[1] = b;
         */

        Mao mao = new Mao();
        // mao.somaPosicao(0, mao);

        for (int i = 0; i < maos.length; i++) {
           // System.out.println(mao.verificaMatch(maos[i]));

            // faz o swap caso necessario
            // mao.setQuant(3);

            int pos = 0;
            while (mao.verificaMatch(maos[i]) == false && pos < maos[i].getQuant()) {

               // System.out.println("swap " + "posição: " + pos);
                mao.swap(maos[i], pos);
                //System.out.println(mao.verificaMatch(maos[i]));
                if (mao.verificaMatch(maos[i]) == false) {
                    mao.swap(maos[i], pos);
                }
                pos++;
            }
            if (mao.verificaMatch(maos[i]) == false) {
                // exclui uma peça
                System.out.println("Exclui peça");
              // maos[maos.length - 1] = null;
               maos[i].setQuant(maos[i].getQuant()-1);
                int pos2 = 0;
                while (mao.verificaMatch(maos[i]) == false && pos2 < maos[i].getQuant()) {

                   // System.out.println("swap " + "posição: " + pos2);
                    mao.swap(maos[i], pos2);
                  //  System.out.println(mao.verificaMatch(maos[i]));
                    if (mao.verificaMatch(maos[i]) == false) {
                        mao.swap(maos[i], pos2);
                    }
                    pos2++;
                }
             
            }
            
            
            if(mao.verificaMatch(maos[i]) == false){
                System.out.println("impossível");
            }
            else{
                System.out.println(mao.getSoma()+ " nenhum dominó descartado");}


        }

    }

    public void name() {

    }

}
