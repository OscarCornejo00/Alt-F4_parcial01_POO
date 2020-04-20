package com.OACV.x00223019;

import javax.print.Doc;
import java.util.ArrayList;

abstract class Empleado {
    protected String nombre, puesto;
    protected ArrayList<Documento> documentos;
    protected double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        documentos = documentos;
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

    public void addDocumento(Documento d){
        documentos.add(d);

    }

    public void removeDocumento(String Documento){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario){

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }


}
