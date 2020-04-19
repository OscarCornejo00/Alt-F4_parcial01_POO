package com.OACV.x00223019;

public class CalculadoraImpuestos {
    private static double totalRenta,totalISSS,totalAFP, Pago;
    String ServicioProfesional, PlazaFija;

    private CalculadoraImpuestos(double totalRenta, double totalISSS, double totalAFP) {
        this.totalRenta = totalRenta;
        this.totalISSS = totalISSS;
        this.totalAFP = totalAFP;
    }

 /*   public double calcularPago(String Empleado, String tipoEmpleado){
        if (tipoEmpleado == ServicioProfesional){
            double AFP, ISSS, renta, pago;
            double salario=0;

            if (tipoEmpleado == ServicioProfesional){

                double restante = 0;
                AFP = 0.0625 * salario;
                ISSS = 0.03 * salario;
                restante = salario - totalISSS - totalAFP;

                if (restante >= 0.01 && restante <= 472) {
                    renta=0;
                } else if (restante <= 895.24) {
                    renta=0.1*(restante-472)+17.67;
                } else if (restante <= 2038.10) {
                    renta=0.2*(restante-895.24)+60;
                } else {
                    renta=0.3*(restante-2038.10)+288.57;
                }
                pago=restante-renta;

                return pago;
            } else {

                renta=0.1*salario;
                pago=salario-renta;

                return pago;
            }

            totalISSS+=ISSS;
            totalAFP+=AFP;
            totalRenta+=renta;
        }
    }
*/
    public  String mostrarTotales(String Empleado, String tipoEmpleado){
        if (tipoEmpleado == ServicioProfesional){
            return  Empleado;
        } else {
            return Empleado;
        }
    }



}
