package org.lasencinas.desayuno;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.item.bebida.Bebida;
import org.lasencinas.item.bebida.subtipos.FleebJuice;
import org.lasencinas.item.bebida.subtipos.TurbulentJuice;
import org.lasencinas.item.cereales.Cereales;
import org.lasencinas.item.cereales.subtipos.Eyeholes;
import org.lasencinas.item.cereales.subtipos.Smiggles;
import org.lasencinas.item.toy.Toy;
import org.lasencinas.item.toy.subtipos.Plumbus;
import org.lasencinas.noEyeholesException.NoEyeholesException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DesayunoTest {

    /* ---- PROPERTIES ---- */
    private Desayuno desayuno = null;
    private Desayuno desayuno2 = null;
    private Cereales eyeholes = null;
    private Cereales smiggles = null;
    private Bebida turbulentJuice = null;
    private Bebida fleebJuice = null;
    private Toy plumbus = null;


    /* ---- BEFORE ---- */
    @Before
    public void setUp() throws Exception {
        desayuno = new Desayuno();
        desayuno2 = new Desayuno();
        eyeholes = new Eyeholes();
        smiggles = new Smiggles();
        turbulentJuice = new TurbulentJuice();
        fleebJuice = new FleebJuice();
        plumbus = new Plumbus();
    }


    /* ---- TESTS ---- */
    @Test
    public void getItemsTest() {
        assertNotNull(desayuno.getItems());
    }

    @Test
    public void addCerealOrDrinkTest() {
        assertNotNull(eyeholes);
        assertNotNull(turbulentJuice);

        desayuno.addCerealOrDrink(eyeholes);
        desayuno.addCerealOrDrink(turbulentJuice);

        assertEquals(2, desayuno.getItems().size());
    }

    @Test
    public void addToyTest() {
        assertNotNull(plumbus);

        desayuno.addCerealOrDrink(eyeholes);
        desayuno.addCerealOrDrink(turbulentJuice);
        try {
            desayuno.addToy(plumbus);
        } catch (NoEyeholesException e) {
            e.printStackTrace();
        }
        assertEquals(3, desayuno.getItems().size());

        desayuno2.addCerealOrDrink(smiggles);
        desayuno2.addCerealOrDrink(fleebJuice);
        try {
            desayuno2.addToy(plumbus);
        } catch (NoEyeholesException e) {
            e.printStackTrace();
        }
        assertEquals(2, desayuno2.getItems().size());
    }

    @Test
    public void mostrarItemsTest() {
        desayuno.addCerealOrDrink(eyeholes);
        desayuno.addCerealOrDrink(turbulentJuice);
        try {
            desayuno.addToy(plumbus);
        } catch (NoEyeholesException e) {
            e.printStackTrace();
        }
        desayuno.mostrarItems();
    }

    @Test
    public void getCosteTest() {
        assertEquals(0, desayuno.getCoste(), 0.01);

        desayuno.addCerealOrDrink(eyeholes);
        desayuno.addCerealOrDrink(turbulentJuice);
        try {
            desayuno.addToy(plumbus);
        } catch (NoEyeholesException e) {
            e.printStackTrace();
        }

        assertEquals(155, desayuno.getCoste(), 0.01);
    }
}