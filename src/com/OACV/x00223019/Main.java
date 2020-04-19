package com.OACV.x00223019;

import javax.print.Doc;
import javax.swing.*;
import java.util.ArrayList;


public class Main {

    static ArrayList<Documento> Documento = new ArrayList<>();
    static ArrayList<Empleado> planilla = new ArrayList<>();

    public static void main(String[] args) {
        byte op = 0;

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
                    String tipo=" ";

                    String[] botones = {"Servicio Profesional", "Plaza Fija"};

                    aux = JOptionPane.showOptionDialog(null, "Tipo de empleado a agregar: ", "Type", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                    if (aux == 0) {
                        tipo="Servicio Profesional";
                    }
                    if (aux == 1) {
                        tipo="Plaza Fija";
                    }


                    String nombre = JOptionPane.showInputDialog(null,"Nombre del empleado: ");
                    String puesto = JOptionPane.showInputDialog(null, "Puesto del empleado: ");
                    String nombreDocumento = JOptionPane.showInputDialog(null,"Tipo de documento (DUI, Pasaporte, Carnet): ");
                    String numeroDocumento = JOptionPane.showInputDialog(null, "Digite numero de documento: ");
                    Documento nuevoDocumento = new Documento(nombreDocumento,numeroDocumento);
                    double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario del empleado: "));

                    if (tipo.equalsIgnoreCase("Sevicio Profesional")){
                        int mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de meses del Contrato:"));

                        planilla.add(new ServicioProfesional(nombre, puesto, Documento, salario, mesesContrato));

                    } else if (tipo.equalsIgnoreCase("Plaza Fija")) {
                        int extension = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de telefono de la oficina: "));

                        planilla.add(new PlazaFija(nombre, puesto, Documento, salario, extension));

                    }
                    break;
                case 2://Despedir empleado
                    String nombreB = JOptionPane.showInputDialog(null,"Nombre del empleado a despedir: ");
                    planilla.removeIf(s -> s.getNombre() == nombreB);

                    break;
                case 3://Mostrar lista de empleados

                    JOptionPane.showMessageDialog(null, planilla);

                    break;

                /*case 4:
                    String name = JOptionPane.showInputDialog(null,"Nombre del empleado a calcular sueldo: ");
                    Empleado persona = null;

                    for (Empleado obj : Empresa.getPlanilla()) {
                        if (obj.getNombre().equalsIgnoreCase(name)) {
                            persona = obj;
                        }
                    }

                    break;*/
            }
        }while(op != 6);
    }
}
