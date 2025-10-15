package com.parcial2.Juego;

public abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int Fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.Fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);

    
    public abstract void defender(int dano);

    //METODO ESTAVIVA

    public boolean estaViva() {
        return this.salud > 0;
    }


}
