package com.OACV.x00223019;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> list;

    public Empresa(String nombre, ArrayList<Empleado> listEmpl) {
        this.nombre = nombre;
        this.list = list;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getList() {
        return list;
    }


}
