package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Ufo raumschiff = new Ufo(77);

        System.out.println(raumschiff.getAnzahlDerAliens());
        raumschiff.TomJonesAbspielen();
        System.out.println(raumschiff.getAnzahlDerAliens());
        raumschiff.Wiederbeleben();
        System.out.println(raumschiff.getAnzahlDerAliens());

        raumschiff.Starten(true);

//        if (raumschiff.Starten()) {
//            System.out.println("Raumschiff startet schnell");
//        }else {
//            System.out.println("Raumschiff startet ohne Turboboost");
//        }
    }
}
