package org.lasencinas.packing.objetos;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.packing.Packing;

import static org.junit.Assert.*;

public class TuboTest {

    /* ---- PROPERTIES ---- */
    private Packing tubo = null;


    /* ---- BEFORE ---- */
    @Before
    public void setUp() {
        tubo = new Tubo("HakunaMatata");
    }

    @Test
    public void notNullTest() {
        assertNotNull(tubo);
    }

    @Test
    public void envoltorioTest() {
        assertEquals("HakunaMatata", tubo.envoltorio());
    }

    @Test
    public void toStringTest() {
        /**
         * Must print "tubo"
         */
        System.out.println(tubo);
    }
}