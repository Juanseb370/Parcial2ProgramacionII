package com.parcial2.Juego;

public class Arma {
    private String nombre;
    private int danoAdicional;

    public String getNombre() {
        return this.nombre;
    }

    //CONSTRUCTOR

    public Arma(String nombre, int danoAdicional){
        this.nombre = nombre;
        this.danoAdicional = danoAdicional;
    }

    public void atacarConArma(Criatura objetivo) {
        objetivo.salud -= this.danoAdicional;
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }

}


