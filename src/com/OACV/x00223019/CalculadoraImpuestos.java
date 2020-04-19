package com.OACV.x00223019;

public class CalculadoraImpuestos {
    private static double totalRenta,totalISSS,totalAFP, Pago;
    String ServicioProfesional, PlazaFija;

    private CalculadoraImpuestos(double totalRenta, double totalISSS, double totalAFP) {
        this.totalRenta = totalRenta;
        this.totalISSS = totalISSS;
        this.totalAFP = totalAFP;
    }

    public double calcularPago(String Empleado, String tipoEmpleado){
        if (tipoEmpleado == ServicioProfesional){
            return Pago;
        } else {
            return Pago;
        }
    }

    public  String mostrarTotales(String Empleado, String tipoEmpleado){
        if (tipoEmpleado == ServicioProfesional){
            return  Empleado;
        } else {
            return Empleado;
        }
    }



}
