package com.company;

public class Ufo {

    // diese Klasse repräsentiert ein UFO

    private int _anzahlAliens;
    private int _startWertDerAliens;
    private String _turboboost;

    public Ufo(int anzahlAliens){
        _anzahlAliens = anzahlAliens;
//        _turboboost = turboboost;
    }

    private void unsichtbarMachen(){
    }

    public int TomJonesAbspielen() {
        _startWertDerAliens = _anzahlAliens;
        return _anzahlAliens = 0;
    }

    private int Wiederbeleben() {
        return _startWertDerAliens;
    }

    public int getAnzahlDerAliens(){
        return _anzahlAliens;
    }

    public void Starten(boolean turboboost) {
        if (turboboost) {
            System.out.println("Wir starten im Turboboost");
            return; // ohne Rückgabewert möglich, wenn boolean.
        }else{
            System.out.println("Wir starten normal");
        }
    }
// Lösung von Julian über den Constructor
//    public boolean Starten(){
//        if (_turboboost == "turboboost"){
//            return true;
//        }else {
//            return false;
//        }
//    }
}
