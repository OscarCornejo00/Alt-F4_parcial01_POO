package com.OACV.x00223019;

public class PlazaFija extends Empleado{
    private int extensión;

    public PlazaFija(String nombre, String puesto, double salario, int extensión) {
        super(nombre, puesto, salario);
        this.extensión = extensión;
    }



    public int getExtensión() {
        return extensión;
    }

    public void setExtensión(int extensión) {
        this.extensión = extensión;
    }

    public String toString() {
        return "Tipo: Plaza Fija" + "\n" +
                "Nombre: " + getNombre () +  "\n" +
                "Puesto:  " + getPuesto() + "\n" +
                "Salario: "+getSalario() + "\n" +
                "Extensión: "+getExtensión() + "\n\n";
    }
}
