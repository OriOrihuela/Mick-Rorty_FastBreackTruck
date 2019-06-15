package org.lasencinas.packing.objetos;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.packing.Packing;

import static org.junit.Assert.*;

public class CajaTest {

    /* ---- PROPERTIES ---- */
    private Packing caja = null;


    /* ---- BEFORE ---- */
    @Before
    public void setUp() {
        caja = new Caja("HakunaMatata");
    }

    @Test
    public void notNullTest() {
        assertNotNull(caja);
    }

    @Test
    public void envoltorioTest() {
        assertEquals("HakunaMatata", caja.envoltorio());
    }

    @Test
    public void toStringTest() {
        /**
         * Must print "caja"
         */
        System.out.println(caja);
    }
}