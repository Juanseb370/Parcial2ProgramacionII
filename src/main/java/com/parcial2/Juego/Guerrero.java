package com.parcial2.Juego;

public class Guerrero extends Criatura {

    private Arma arma;

    //CONSTRUCTOR

    public Guerrero(String nombre, int salud, int Fuerza) {
        super(nombre, salud, Fuerza);
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

    public void equiparArma(Arma arma) {
        this.arma = arma;
        System.out.println(this.nombre + " a equipado " + arma.getNombre());
    }

    @Override
    public void atacar(Criatura objetivo) {
        int danoTotal = this.Fuerza;
        if (arma != null) {
            if (arma.getNombre().equals("Excalibur")) {
                arma.atacarConArma(objetivo);
                danoTotal = this.Fuerza * 3;
                System.out.println(
                        this.nombre + " lanza un ataque causando " + danoTotal + " de daño, ademas de atacar con "
                                + arma.getNombre() + " y hacer " + arma.getDanoAdicional() + "de daño adicional.");
            } else if (arma.getNombre().equals("Drenadora")) {
                arma.atacarConArma(objetivo);
                this.salud += this.Fuerza + arma.getDanoAdicional();
                System.out.println(
                        this.nombre + " lanza un ataque causando " + danoTotal + " de daño y curandose.");
            }
        } else {
            danoTotal = this.Fuerza;
            System.out.println(this.nombre + " lanza un ataque causando " + danoTotal + " de daño.");
        }
        objetivo.defender(danoTotal);
    }

    @Override
    public void defender(int dano) {
        if (arma != null) {
            if (arma.getNombre().equals("Espada-Escudo")) {
                this.salud -= dano / 5;
                System.out.println("El guerrero recibe " + dano / 5 + " de daño.");
            } else {
                this.salud -= dano / 3;
                System.out.println("El guerrero recibe " + dano / 3 + " de daño.");
            }
        } else {
            this.salud -= dano / 3;
            System.out.println("El guerrero recibe " + dano / 3 + " de daño.");
        }

    }
}
