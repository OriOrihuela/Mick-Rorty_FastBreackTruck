package org.lasencinas.item.cereales.subtipos;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.item.cereales.Cereales;
import org.lasencinas.packing.objetos.Caja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EyeholesTest {

    /* ---- PROPERTIES ---- */
    private Cereales eyeholes = null;


    /* ---- BEFORE ---- */
    @Before
    public void setUp() {
        eyeholes = new Eyeholes();
    }

    @Test
    public void notNullTest() {
        assertNotNull(eyeholes);
    }

    @Test
    public void nombreTest() {
        assertEquals("Eyeholes", eyeholes.nombre());
    }

    @Test
    public void empaquetadoTest() {
        assertEquals(Caja.class, eyeholes.empaquetado().getClass());
    }

    @Test
    public void pvpTest() {
        assertEquals(25, eyeholes.pvp(), 0.01);
    }
}