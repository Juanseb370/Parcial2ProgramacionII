package com.parcial2.juego.tests;
import org.junit.jupiter.api.Test;

import com.parcial2.Juego.Dragon;
import com.parcial2.Juego.Mago;

import static org.junit.jupiter.api.Assertions.*;

public class MagoTest {
    
    // El mago siempre inicia de base con el hechizo de tierra, y va aprendiendo hechizos cada vez que se usa el metodo aprenderHechizo()
    // La lógica de aprender es, aprende uno nuevo y olvida el anterior, y ya estan predeterminados los hechizos de cada nivel arriba
    // El primer hechizo que aprende, es Fuego, multiplica x2 su daño, el siguiente es hielo que multiplica x3 su daño, y el último
    // Es el rayo que múltiplica x6 su daño
    @Test
    public void testAprenderHechizo(){
        Mago mago = new Mago("Merlin", 500, 100);
        mago.aprenderHechizo();
        assertEquals("Fuego", mago.getHechizo());
    }
}
