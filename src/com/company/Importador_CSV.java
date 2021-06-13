package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Importador_CSV {

    public static void CSV_reader(String filePath) throws IOException {

        String file = filePath;
        BufferedReader reader = null;
        String line = "";
        int quantPecas = 0;
        int quantMaos = 0;

        try {
            reader = new BufferedReader(new FileReader(file));

            while((line = reader.readLine()) != null) {

                int quantDominos = Integer.parseInt(line);
                Domino[] dominos = new Domino[quantDominos];

                for(int i = 0; i < quantDominos; i++){
                    line = reader.readLine();

                    String[] row = line.split(";");
                    Domino readDomino = leDomino(row);
                    dominos[i] = readDomino;
                }

                Mao maoNova = new Mao(quantDominos, dominos);

                Main.maos[quantMaos] = maoNova;
                quantMaos++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static Domino leDomino(String[] row){
        Integer x = Integer.parseInt(row[0]);
        Integer y = Integer.parseInt(row[1]);
        Domino d = new Domino(x, y);

        return (d);
    }


}
