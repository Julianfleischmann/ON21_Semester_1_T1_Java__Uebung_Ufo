package com.company;

public class Ufo {

    // diese Klasse repräsentiert ein UFO

    private int _anzahlAliens;
    private int _startWertDerAliens;
    private String _turboboost;

    public Ufo(int anzahlAliens, String turboboost){
        _anzahlAliens = anzahlAliens;
        _turboboost = turboboost;
    }

    private void unsichtbarMachen(){
    }

    private int TomJonesAbspielen() {
        _startWertDerAliens = _anzahlAliens;
        return _anzahlAliens = 0;
    }

    private int Wiederbeleben() {
        return _startWertDerAliens;
    }

    public int getAnzahlDerAliens(){
        return _anzahlAliens;
    }

    public boolean Starten(){
        if (_turboboost == "turboboost"){
            return true;
        }else {
            return false;
        }
    }
}
