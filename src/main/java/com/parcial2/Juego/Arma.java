package com.parcial2.Juego;

public class Arma {
    private String nombre;
    private int danoAdicional;



    public void atacarConArma(Criatura objetivo) {
        objetivo.salud -= this.danoAdicional;
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }

}


