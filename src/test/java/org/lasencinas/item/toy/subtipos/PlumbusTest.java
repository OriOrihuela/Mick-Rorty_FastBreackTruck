package org.lasencinas.item.toy.subtipos;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.item.toy.Toy;
import org.lasencinas.packing.objetos.Caja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlumbusTest {

    /* ---- PROPERTIES ---- */
    private Toy plumbus = null;


    /* ---- BEFORE ---- */
    @Before
    public void setUp() {
        plumbus = new Plumbus();
    }

    @Test
    public void notNullTest() {
        assertNotNull(plumbus);
    }

    @Test
    public void nombreTest() {
        assertEquals("Plumbus", plumbus.nombre());
    }

    @Test
    public void empaquetadoTest() {
        assertEquals(Caja.class, plumbus.empaquetado().getClass());
    }

    @Test
    public void pvpTest() {
        assertEquals(100, plumbus.pvp(), 0.01);
    }
}