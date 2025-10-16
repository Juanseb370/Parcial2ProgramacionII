package com.parcial2.Juego;

public class Dragon extends Criatura implements Volador {

    private String Escamas;
    private boolean Volando = false;

    //CONSTRUCTOR
    
    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.Escamas = escamas;
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

    public boolean getVolando() {
        return this.Volando;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danoTotal = this.Fuerza * 2;
        System.out.println(this.nombre + " lanza un ataque causando " + danoTotal + " de daño.");
        objetivo.defender(danoTotal);
    }

    @Override
    public void defender(int dano) {
        if (Volando) {
            System.out.println(this.nombre + " ha esquivado el ataque");
            aterrizar();
        } else {
            if (Escamas == "Acero") {
                this.salud -= dano / 3;
                System.out.println(this.nombre + " tiene escamas de Acero y reduce el daño un tercio.");
                System.out.println("Recibe " + dano / 3 + " de daño.");

            } else if (Escamas == "Plata") {
                this.salud -= dano / 4;
                System.out.println(this.nombre + " tiene escamas de Plata y reduce el daño un cuarto.");
                System.out.println("Recibe " + dano / 4 + " de daño.");
            } else {
                this.salud -= dano / 2;
            }
        }

    }

    @Override
    public void volar() {
        System.out.println(this.nombre + " está volando.");
        Volando = true;
    }

    @Override
    public void aterrizar() {
        System.out.println(this.nombre + " ha aterrizado.");
        Volando = false;
    }

}
