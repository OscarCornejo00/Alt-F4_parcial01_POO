package com.OACV.x00223019;

import javax.print.Doc;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Documento> Documento = new ArrayList<>();
    static ArrayList<Empleado> planilla = new ArrayList<>();

    public static void main(String[] args) {
        byte op = 0;
        CalculadoraImpuestos x = new CalculadoraImpuestos();

        String menu = "1. Agregar Empleado\n" +
                "2. Despedir Empleado\n" +
                "3. Ver lista de Empleados\n" +
                "4. Calcular sueldo\n" +
                "5. Mostrar totales\n" +
                "6. Salir";

        do{
            op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));

            switch (op){
                case 1://Agregar empleado
                    int aux=0;

                    String[] botones = {"Servicio Profesional", "Plaza Fija"};

                    aux = JOptionPane.showOptionDialog(null, "Tipo de empleado a agregar: ", "Type", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                    String nombre = JOptionPane.showInputDialog(null,"Nombre del empleado: ");
                    String puesto = JOptionPane.showInputDialog(null, "Puesto del empleado: ");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario del empleado: "));

                    if (aux == 0){
                        int mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de meses del Contrato:"));

                        Empleado nuevoEmpleado = new ServicioProfesional(nombre, puesto, null,  salario, mesesContrato);
                        //anadirDocumento(nuevoEmpleado);
                        planilla.add(nuevoEmpleado);
                        new Empresa("Super Mercado Salvadoreño",planilla);

                    } else if (aux==1) {
                        int extension = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de telefono de la oficina: "));

                        Empleado nuevoEmpleado = new PlazaFija(nombre, puesto,null,  salario, extension);
                        //anadirDocumento(nuevoEmpleado);
                        planilla.add(nuevoEmpleado);
                        new Empresa("Super Mercado Salvadoreño",planilla);

                    }
                    break;
                case 2://Despedir empleado
                    String despedirEmpleado = JOptionPane.showInputDialog(null,"Nombre del empleado a despedir: ");
                    planilla.removeIf(obj -> obj.getNombre() .equals(despedirEmpleado));

                    break;
                case 3://Mostrar lista de empleados

                    JOptionPane.showMessageDialog(null, planilla);

                    break;

                case 4:
                    double z;
                    String  T = " ";
                    String name = JOptionPane.showInputDialog(null,"Nombre del empleado a calcular sueldo: ");
                    boolean bus=false;

                    for (Empleado p: planilla){
                        if(p.getNombre() .equals(name)){
                            if(p instanceof ServicioProfesional){
                                T="ServicioProfesional";
                                bus=true;
                            }

                            z = x.calcularPago(p.getNombre(),T);
                            JOptionPane.showMessageDialog(null,"El salario Liquido es: " + z);
                        }
                    }
                    if(bus==false)JOptionPane.showMessageDialog(null, "NO se encontro empleado!");

                    break;
                case 5://Mostrar totales
                    JOptionPane.showMessageDialog(null,x.mostrarTotales());
                    break;
            }
        }while(op != 6);
    }

    public static void anadirDocumento(Empleado e){
        byte op = 0;

            String nombreDocumento = JOptionPane.showInputDialog(null,"Tipo de documento (DUI, NIT, Pasaporte, Carnet) : ");
            String numeroDocumento = JOptionPane.showInputDialog(null, "Digite numero de documento: ");

            Documento doc = new Documento(nombreDocumento, numeroDocumento);

            e.addDocumento(doc);
    return;
    }
}