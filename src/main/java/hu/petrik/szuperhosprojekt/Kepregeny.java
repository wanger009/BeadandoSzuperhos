package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String fajlElérésiÚt) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fajlElérésiÚt))) {
            String sor;
            while ((sor = reader.readLine()) != null) {
                String[] adatok = sor.split(" ");
                String tipus = adatok[0];
                int kutyukSzama = Integer.parseInt(adatok[1]);

                Szuperhos szuperhos;
                if (tipus.equals("Vasember")) {
                    szuperhos = new Vasember();
                } else if (tipus.equals("Batman")) {
                    szuperhos = new Batman();
                } else {
                    continue;
                }

                for (int i = 0; i < kutyukSzama; i++) {
                    if (szuperhos instanceof Milliardos) {
                        ((Milliardos) szuperhos).kutyutKeszit();
                    }
                }

                szuperhosLista.add(szuperhos);
            }
        }
    }

    public static void szuperhosok() {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }

    public static void main(String[] args) {
        try {
            szereplok("szuperhosok.txt");
            szuperhosok();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}