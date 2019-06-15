package org.lasencinas.item.cereales.subtipos;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.item.cereales.Cereales;
import org.lasencinas.packing.objetos.Caja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SmigglesTest {

    /* ---- PROPERTIES ---- */
    private Cereales smiggles = null;


    /* ---- BEFORE ---- */
    @Before
    public void setUp() {
        smiggles = new Smiggles();
    }

    @Test
    public void notNullTest() {
        assertNotNull(smiggles);
    }

    @Test
    public void nombreTest() {
        assertEquals("Smiggles", smiggles.nombre());
    }

    @Test
    public void empaquetadoTest() {
        assertEquals(Caja.class, smiggles.empaquetado().getClass());
    }

    @Test
    public void pvpTest() {
        assertEquals(50, smiggles.pvp(), 0.01);
    }
}