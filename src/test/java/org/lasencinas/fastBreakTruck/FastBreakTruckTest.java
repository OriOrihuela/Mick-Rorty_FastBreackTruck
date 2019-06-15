package org.lasencinas.fastBreakTruck;

import org.junit.Test;
import org.lasencinas.desayuno.Desayuno;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FastBreakTruckTest {

    /* ---- PROPERTIES ---- */
    Desayuno desayuno = null;


    /* ---- TESTS ---- */
    @Test
    public void prepararEyeHoles() {
        desayuno = FastBreakTruck.prepararEyeHoles();
        assertNotNull(desayuno);
        assertEquals(2, desayuno.getItems().size());
        assertEquals(55, desayuno.getCoste(), 0.01);
    }

    @Test
    public void prepararSmiggles() {
        desayuno = FastBreakTruck.prepararSmiggles();
        assertNotNull(desayuno);
        assertEquals(2, desayuno.getItems().size());
        assertEquals(85, desayuno.getCoste(), 0.01);
    }

    @Test
    public void incluirJuguete() {
        desayuno = FastBreakTruck.prepararEyeHoles();
        FastBreakTruck.incluirJuguete(desayuno);
        assertEquals(3, desayuno.getItems().size());
        assertEquals(155, desayuno.getCoste(), 0.01);
    }
}