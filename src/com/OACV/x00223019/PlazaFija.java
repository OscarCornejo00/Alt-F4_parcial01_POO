package com.OACV.x00223019;

import java.util.ArrayList;

public class PlazaFija extends Empleado {
    private int extensión;


    public PlazaFija(String nombre, String puesto, ArrayList<Documento> documentos, double salario, int extensión) {
        super(nombre, puesto, documentos, salario);
        this.extensión = extensión;
    }

    public int getExtensión() {
        return extensión;
    }

    public void setExtensión(int extensión) {
        this.extensión = extensión;
    }

    public String toString() {
        return "Nombre: " + getNombre() +  " || Puesto:  " + getPuesto()+
                " || Documento: " + getDocumentos() + " || Salario: "+getSalario()+ " || Extensión: "+getExtensión();
    }
}
