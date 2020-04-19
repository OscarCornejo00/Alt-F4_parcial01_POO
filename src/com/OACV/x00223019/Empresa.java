package com.OACV.x00223019;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre, ArrayList<Empleado> planilla) {
        this.nombre = nombre;
        this.planilla = planilla;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(String Empleado){

    }

    public void quitEmpleado(String Empleado){

    }


}
