package org.lasencinas.item.bebida.subtipos;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.item.bebida.Bebida;
import org.lasencinas.packing.objetos.Tubo;

import static org.junit.Assert.*;

public class TurbulentJuiceTest {

    /* ---- PROPERTIES ---- */
    private Bebida turbulentJuice = null;


    /* ---- BEFORE ---- */
    @Before
    public void setUp() {
        turbulentJuice = new TurbulentJuice();
    }

    @Test
    public void notNullTest() {
        assertNotNull(turbulentJuice);
    }

    @Test
    public void nombreTest() {
        assertEquals("TurbulentJuice", turbulentJuice.nombre());
    }

    @Test
    public void empaquetadoTest() {
        assertEquals(Tubo.class, turbulentJuice.empaquetado().getClass());
    }

    @Test
    public void pvpTest() {
        assertEquals(30, turbulentJuice.pvp(), 0.01);
    }
}