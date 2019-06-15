package org.lasencinas.item;

import org.lasencinas.packing.Packing;

public interface Item {
    String nombre();
    Packing empaquetado();
    Float pvp();
}
