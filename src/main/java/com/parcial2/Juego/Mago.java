package com.parcial2.Juego;

public class Mago extends Criatura implements Magico {

    private String Hechizos = "Tierra";

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danoTotal = this.Fuerza;
        objetivo.salud -= danoTotal;
    }

    @Override
    public void defender(int dano) {
        this.salud -= dano / 2; // Los magos reciben menos daño
    }

    @Override
    public void lanzarHechizo() {
        if (Hechizos == "Tierra") {
            
        }
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(this.nombre + " aprende un nuevo hechizo.");
    }
}
