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
    public void prepararEyeHolesTest() {
        desayuno = FastBreakTruck.prepararEyeHoles();
        assertNotNull(desayuno);
        assertEquals(2, desayuno.getItems().size());
        assertEquals(55, desayuno.getCoste(), 0.01);
    }

    @Test
    public void prepararSmigglesTest() {
        desayuno = FastBreakTruck.prepararSmiggles();
        assertNotNull(desayuno);
        assertEquals(2, desayuno.getItems().size());
        assertEquals(85, desayuno.getCoste(), 0.01);
    }

    @Test
    public void incluirJugueteTest() {
        desayuno = FastBreakTruck.prepararEyeHoles();
        FastBreakTruck.incluirJuguete(desayuno);
        assertEquals(3, desayuno.getItems().size());
        assertEquals(155, desayuno.getCoste(), 0.01);
    }
}