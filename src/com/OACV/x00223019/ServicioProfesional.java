package com.OACV.x00223019;

public class ServicioProfesional extends Empleado {
    private int mesesContrato;

    public ServicioProfesional(String nombre, String puesto,  double salario, int mesesContrato) {
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMeses() {
        return mesesContrato;
    }

    public void setMeses(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public String toString() {
        return "Tipo: Servicio Profesional" + "\n" +
                "Nombre: " + getNombre () +  "\n" +
                "Puesto:  " + getPuesto() + "\n" +
                "Salario: "+getSalario() + "\n" +
                "Meses de duracion contrato: "+mesesContrato + "\n\n" ;
    }
}
