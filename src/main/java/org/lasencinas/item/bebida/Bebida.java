package org.lasencinas.item.bebida;

import org.lasencinas.item.Item;

public abstract class Bebida implements Item {

    /* ---- MAIN BEHAVIOURS ---- */
    @Override
    public String toString() {
        return "Item: " + nombre() +
                ", Empaquetado: " + empaquetado() +
                ", Precio: " + pvp();
    }
}
