package com.parcial2;

import com.parcial2.Juego.Arma;
import com.parcial2.Juego.Dragon;
import com.parcial2.Juego.Guerrero;
import com.parcial2.Juego.Mago;

public class Main {
    public static void main(String[] args) {
        int contador1 = 1;
        int contador2 = 1;
        Arma armaElegida;

        // SE CREAN LOS OBJETOS DE CADA CLASE

        Arma arma1 = new Arma("Excalibur", 100);
        Arma arma2 = new Arma("Drenadora", 50);
        Arma arma3 = new Arma("Espada-Escudo", 0);
        Arma[] armas = { arma1, arma2, arma3 };
        Guerrero guerrero1 = new Guerrero("El inquisidor", 800, 300);
        Dragon dragon1 = new Dragon("Dragón Escarlata", 1000, 100, "Acero");
        Dragon dragon2 = new Dragon("Dragón Platino", 2000, 200, "Plata");
        Mago mago1 = new Mago("Mago Supremo", 600, 40);

        System.out.println("-------- Bienvenido a la pelea del siglo --------");
        System.out.println("-------- Pelea 1 --------");

        // SE INICIA LA PRIMERA PELEA

        do {
            System.out.println("\n------------ Turno " + contador1 + " ------------\n");
            System.out.println("Salud Dragon: " + dragon1.getSalud());
            System.out.println("Salud Mago: " + mago1.getSalud());
            dragon1.volar();
            mago1.aprenderHechizo();
            mago1.atacar(dragon1);
            System.out.println("Salud Dragon: " + dragon1.getSalud());
            dragon1.atacar(mago1);
            System.out.println("Salud Mago: " + mago1.getSalud());
            contador1++;
        } while (dragon1.estaViva() && mago1.estaViva());

        // SE INICIA LA SEGUNDA PELEA

        System.out.println("-------- Pelea 2 --------");

        do {
            System.out.println("\n------------ Turno " + contador2 + " ------------\n");
            System.out.println("Salud Guerrero: " + guerrero1.getSalud());
            System.out.println("Salud Dragon: " + dragon2.getSalud());
            guerrero1.atacar(dragon2);
            System.out.println("Salud Dragon: " + dragon2.getSalud());
            dragon2.atacar(guerrero1);
            System.out.println("Salud Guerrero: " + guerrero1.getSalud());
            int indice = (int) (Math.random() * armas.length);
            armaElegida = armas[indice];
            guerrero1.equiparArma(armaElegida);
            contador2++;
        } while (dragon2.estaViva() && guerrero1.estaViva());

    }
}