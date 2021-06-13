package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Importador_CSV {

    public static Mao[] CSV_reader(String filePath) throws IOException {

        String file = filePath;
        BufferedReader reader = null;
        String line = "";
        Mao[] newMao = new Mao[0];

        try {
            reader = new BufferedReader(new FileReader(file));

            while((line = reader.readLine()) != null && Integer.parseInt(line) != 0) {

                int quantDominos = Integer.parseInt(line);

                Domino[] dominos = new Domino[quantDominos];

                for (int i = 0; i < quantDominos; i++) {
                    line = reader.readLine();

                    String[] row = line.split(";");
                    Domino readDomino = leDomino(row);
                    dominos[i] = readDomino;
                }

                Mao maoNova = new Mao(quantDominos, dominos);

                newMao = insereMao(newMao, maoNova);
            }
            return newMao;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Mao[] insereMao(Mao[] maos, Mao mao){
        int count = maos.length;
        Mao[] newArr = new Mao[count+1];

        for (int i = 0; i < count; i++) {
            newArr[i] = maos[i];
        }
        newArr[newArr.length-1] = mao;
        return newArr;
    }

    public static Domino leDomino(String[] row){
        Integer x = Integer.parseInt(row[0]);
        Integer y = Integer.parseInt(row[1]);
        Domino d = new Domino(x, y);

        return (d);
    }


}
