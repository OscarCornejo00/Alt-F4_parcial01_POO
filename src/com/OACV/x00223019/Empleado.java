package com.OACV.x00223019;

import java.util.ArrayList;

public class Empleado {
    protected String nombre, puesto
    protected ArrayList<Documento> documentos;
    protected double salario;

    public Empleado(String nombre, String puesto, ArrayList<Documento> documentos, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.documentos = documentos;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public void addDocumento(Documento){

    }

    public void removeDocumento(String){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double){
        
    }
}
