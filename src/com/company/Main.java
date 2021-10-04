package com.company;

public class Main {

    public static void main(String[] args) {

        Ufo raumschiff = new Ufo(77, "turboboost");

        System.out.println(raumschiff.getAnzahlDerAliens());

        System.out.println(raumschiff.getAnzahlDerAliens());


        if (raumschiff.Starten()) {
            System.out.println("Raumschiff startet schnell");
        }else {
            System.out.println("Raumschiff startet ohne Turboboost");
        }
    }
}
