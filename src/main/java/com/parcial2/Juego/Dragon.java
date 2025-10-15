package com.parcial2.Juego;

public class Dragon extends Criatura implements Volador {

    private String Escamas;

    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.Escamas = escamas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danoTotal = this.Fuerza * 2;
        objetivo.salud -= danoTotal;
    }

    @Override
    public void defender(int dano) {
        if (Escamas == "Acero") {
            this.salud -= dano / 2;
        }else if (Escamas == "Plata") {
            this.salud -= dano / 3;
        } else {
            this.salud -= dano;
        }
        
    }

    @Override
    public void volar() {
        System.out.println(this.nombre + " está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println(this.nombre + " ha aterrizado.");
    }
    
}
