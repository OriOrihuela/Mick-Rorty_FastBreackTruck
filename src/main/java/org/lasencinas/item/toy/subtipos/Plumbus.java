package org.lasencinas.item.toy.subtipos;

import org.lasencinas.item.toy.Toy;
import org.lasencinas.packing.Packing;
import org.lasencinas.packing.objetos.Caja;

public class Plumbus extends Toy {

    /* ---- PROPERTIES ---- */
    private Packing caja = new Caja("Plumbus");
    private float precio = 100;

    /* ---- CONSTRUCTORS ---- */
    public Plumbus() {
    }

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public String nombre() {
        return caja.envoltorio();
    }

    @Override
    public Packing empaquetado() {
        return caja;
    }

    @Override
    public Float pvp() {
        return precio;
    }
}
