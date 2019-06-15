package org.lasencinas.item.bebida.subtipos;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.item.bebida.Bebida;
import org.lasencinas.packing.objetos.Tubo;

import static org.junit.Assert.*;

public class FleebJuiceTest {

    /* ---- PROPERTIES ---- */
    private Bebida fleebJuice = null;


    /* ---- BEFORE ---- */
    @Before
    public void setUp() {
        fleebJuice = new FleebJuice();
    }

    @Test
    public void notNullTest() {
        assertNotNull(fleebJuice);
    }

    @Test
    public void nombreTest() {
        assertEquals("FleebJuice", fleebJuice.nombre());
    }

    @Test
    public void empaquetadoTest() {
        assertEquals(Tubo.class, fleebJuice.empaquetado().getClass());
    }

    @Test
    public void pvpTest() {
        assertEquals(35, fleebJuice.pvp(), 0.01);
    }
}