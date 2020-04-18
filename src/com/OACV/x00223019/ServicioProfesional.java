package com.OACV.x00223019;

import java.util.ArrayList;

public class ServicioProfesional extends Empleado {
    private int mesesContrato;

    public ServicioProfesional(String nombre, String puesto, double salario, ArrayList<Documento> listDocu, int mesesContrato) {
        super(nombre, puesto, salario, listDocu);
        this.mesesContrato = mesesContrato;
    }
}
