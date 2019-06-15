package org.lasencinas.item.toy;

import org.lasencinas.item.Item;
import org.lasencinas.packing.Packing;

public abstract class Toy implements Item {

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public String toString() {
        return "Item: " + nombre() +
                ", Empaquetado: " + empaquetado() +
                ", Precio: " + pvp();
    }
}
