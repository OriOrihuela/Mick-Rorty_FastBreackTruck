package org.lasencinas.fastBreakTruck;

import org.lasencinas.desayuno.Desayuno;
import org.lasencinas.item.bebida.Bebida;
import org.lasencinas.item.bebida.subtipos.FleebJuice;
import org.lasencinas.item.bebida.subtipos.TurbulentJuice;
import org.lasencinas.item.cereales.Cereales;
import org.lasencinas.item.cereales.subtipos.Eyeholes;
import org.lasencinas.item.cereales.subtipos.Smiggles;
import org.lasencinas.item.toy.Toy;
import org.lasencinas.item.toy.subtipos.Plumbus;
import org.lasencinas.noEyeholesException.NoEyeholesException;

public class FastBreakTruck {

    /* ---- MAIN BEHAVIOURS ---- */
    public static Desayuno prepararEyeHoles() {
        Cereales eyeHoles = new Eyeholes();
        Bebida turbulentJuice = new TurbulentJuice();
        Desayuno desayuno = new Desayuno();
        desayuno.addCerealOrDrink(eyeHoles);
        desayuno.addCerealOrDrink(turbulentJuice);
        return desayuno;
    }

    public static Desayuno prepararSmiggles() {
        Cereales smiggles = new Smiggles();
        Bebida fleebJuice = new FleebJuice();
        Desayuno desayuno = new Desayuno();
        desayuno.addCerealOrDrink(smiggles);
        desayuno.addCerealOrDrink(fleebJuice);
        return desayuno;
    }

    public static void incluirJuguete(Desayuno eyeDes) {
        Toy plumbus = new Plumbus();
        try {
            eyeDes.addToy(plumbus);
        } catch (NoEyeholesException e) {
            e.printStackTrace();
        }
    }
}
