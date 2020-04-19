package com.OACV.x00223019;

import java.util.ArrayList;

public class ServicioProfesional extends Empleado {
    private int mesesContrato;

    public ServicioProfesional(String nombre, String puesto, ArrayList<Documento> documentos, double salario, int mesesContrato) {
        super(nombre, puesto, documentos, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMeses() {
        return mesesContrato;
    }

    public void setMeses(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public String toString() {
        return "Nombre: " + getNombre() +  " || Puesto:  " + getPuesto()+
                " || Documento: " + getDocumentos() + " || Salario: "+getSalario()+ " || Duración de contrato: "+getMeses();
    }
}
