package com.OACV.x00223019;

import java.util.ArrayList;

public class PlazaFija extends Empleado {
    private int extensión;

    public PlazaFija(String nombre, String puesto, double salario, ArrayList<Documento> listDocu, int extensión) {
        super(nombre, puesto, salario, listDocu);
        this.extensión = extensión;
    }
}
