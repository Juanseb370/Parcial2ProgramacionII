package com.parcial2.Juego;

public class Mago extends Criatura implements Magico {

    private String Hechizos = "Tierra";
    private int danoTotal = 0;

    //CONSTRUCTOR

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public int getDanoTotal() {
        return this.danoTotal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getSalud() {
        return this.salud;
    }

    public int getFuerza() {
        return this.Fuerza;
    }

    @Override
    public void atacar(Criatura objetivo) {
        lanzarHechizo();
        // int danoTotal = this.Fuerza;
        objetivo.defender(danoTotal);
    }

    @Override
    public void defender(int dano) {
        this.salud -= dano / 2;
        System.out.println("El mago recibe " + dano / 2 + " de daño.");

    }

    @Override
    public void lanzarHechizo() {
        // int danoTotal = danoBase;

        switch (Hechizos) {
            case "Tierra":
                // Daño base sin modificadores
                danoTotal = this.Fuerza;
                break;
            case "Fuego":
                danoTotal = this.Fuerza * 2;
                System.out.println(
                        this.nombre + " lanza hechizo de " + Hechizos + " causando " + danoTotal + " de daño.");
                if (Math.random() < 0.5) {
                    //System.out.println(this.nombre + " ha quemado al objetivo!");
                }
                break;
            case "Hielo":
                danoTotal = this.Fuerza * 3;
                System.out.println(
                        this.nombre + " lanza hechizo de " + Hechizos + " causando " + danoTotal + " de daño.");
                if (Math.random() < 0.2) {
                    //System.out.println(this.nombre + " ha congelado al objetivo!");
                }
                break;
            case "Rayo":
                danoTotal = this.Fuerza * 6;
                System.out.println(
                        this.nombre + " lanza hechizo de " + Hechizos + " causando " + danoTotal + " de daño.");
                break;
            default:
                System.out.println(this.nombre + " no tiene un hechizo válido.");
                return;
        }

        // this.ultimoDano = danoTotal; // Guardamos el daño para usarlo en atacar()
    }

    @Override
    public void aprenderHechizo() {
        if (Hechizos == "Tierra") {
            System.out.println(this.nombre + " aprende el hechizo de fuego.");
            Hechizos = "Fuego";
        } else if (Hechizos == "Fuego") {
            System.out.println(this.nombre + " aprende el hechizo de hielo.");
            Hechizos = "Hielo";
        } else if (Hechizos == "Hielo") {
            System.out.println(this.nombre + " aprende el hechizo de rayo.");
            Hechizos = "Rayo";
        } else if (Hechizos == "Rayo") {
            System.out.println(this.nombre + " no puede aprender más hechizos");
        }

    }
}
