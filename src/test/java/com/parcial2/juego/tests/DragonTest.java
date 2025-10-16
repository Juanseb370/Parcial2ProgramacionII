package com.parcial2.juego.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.parcial2.Juego.Dragon;

public class DragonTest {
    
    // El dragón al implementar la interfaz Volador, tiene un método único que es Volar(), en este caso, se nos ocurrió hacer que cuando
    // El dragón este volando, el siguiente ataque lanzado por su rival lo esquive, e inmediatamente use el otro método único aterrizar()
    @Test
    public void testDragonVolando(){
        Dragon dragon1 = new Dragon("Ross", 2000, 500, "Acero");
        dragon1.volar();
        assertEquals(true, dragon1.getVolando());
        dragon1.defender(2000);
        assertEquals(2000, dragon1.getSalud());
    }
}
