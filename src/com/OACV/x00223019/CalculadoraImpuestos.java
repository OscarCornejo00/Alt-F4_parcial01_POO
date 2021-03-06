package com.OACV.x00223019;


public class CalculadoraImpuestos {
    private static double totalRenta,totalISSS,totalAFP, Pago=0;

    public CalculadoraImpuestos() {
    }

    public double calcularPago(String Empleado, String tipoEmpleado){
        double AFP=0, ISSS=0, renta;
        double salario=0;

        for(Empleado s: Main.planilla){
            if(s.getNombre() .equals(Empleado)){
                salario=s.getSalario();
            }
        }

        if (tipoEmpleado .equals("PlazaFija")){

            double restante = 0;
            AFP = 0.0625 * salario;
            ISSS = 0.03 * salario;
            restante = salario - ISSS - AFP;

            if (restante >= 0.01 && restante <= 472) {
                renta=0;
            } else if (restante <= 895.24) {
                renta=0.1*(restante-472)+17.67;
            } else if (restante <= 2038.10) {
                renta=0.2*(restante-895.24)+60;
            } else {
                renta=0.3*(restante-2038.10)+288.57;
            }
            Pago=restante-renta;

        } else {

            renta=0.1*salario;
            Pago=salario-renta;

        }

        return Pago;
    }

    public void calcularTotales(String Empleado, String tipoEmpleado,int meses){

        double AFP=0, ISSS=0, renta=0;
        double salario=0;

        for(Empleado s: Main.planilla){
            if(s.getNombre() .equals(Empleado)){
                salario=s.getSalario();
            }
        }

        if (tipoEmpleado .equals("PlazaFija")){

            double restante = 0;
            AFP = 0.0625 * salario;
            ISSS = 0.03 * salario;
            restante = salario - ISSS - AFP;

            if (restante >= 0.01 && restante <= 472) {
                renta=0;
            } else if (restante <= 895.24) {
                renta=0.1*(restante-472)+17.67;
            } else if (restante <= 2038.10) {
                renta=0.2*(restante-895.24)+60;
            } else {
                renta=0.3*(restante-2038.10)+288.57;
            }


        } else {
            renta=0.1*salario;
            renta+=meses;
        }


        totalRenta+=renta;
        totalAFP+=AFP;
        totalISSS+=ISSS;

    }

    public  String mostrarTotales(){
        String totales= " ";
        totales="Total de renta: "+totalRenta+"\nTotal de ISSS: "+totalISSS+"\nTotal AFP: "+totalAFP;

        return totales;
    }

}