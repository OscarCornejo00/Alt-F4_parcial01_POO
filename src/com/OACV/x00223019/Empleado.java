package com.OACV.x00223019;

import java.util.ArrayList;

public class Empleado {
    protected String nombre, puesto;
    protected double salario;
    protected ArrayList<Documento> listDocu;

    public Empleado(String nombre, String puesto, double salario, ArrayList<Documento> listDocu) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.listDocu = listDocu;
    }


}
