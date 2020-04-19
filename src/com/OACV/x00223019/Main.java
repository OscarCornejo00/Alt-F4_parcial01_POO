package com.OACV.x00223019;

import javax.print.Doc;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Documento> Documento = new ArrayList<>();

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
                case 1:
                    String tipo = JOptionPane.showInputDialog(null, "Digite tipo de Empleado a agregar (Sevicio Profesional, Plaza Fija): ");

                    String nombre = JOptionPane.showInputDialog(null,"Nombre del empleado: ");
                    String puesto = JOptionPane.showInputDialog(null, "Puesto del empleado: ");
                    String nombreDocumento = JOptionPane.showInputDialog(null,"Tipo de documento (DUI, Pasaporte, Carnet): ");
                    String numeroDocumento = JOptionPane.showInputDialog(null, "Digite numero de documento: ");
                    Documento nuevoDocumento = new Documento(nombreDocumento,numeroDocumento);
                    double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario del empleado: "));

                    if (tipo.equalsIgnoreCase("Sevicio Profesional")){
                        int mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de meses del Contrato:"));

                        new ServicioProfesional(nombre, puesto, Documento, salario, mesesContrato);
                    } else if (tipo.equalsIgnoreCase("Plaza Fija")) {
                        int extension = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de telefono de la oficina: "));

                        new PlazaFija(nombre, puesto, Documento, salario, extension);

                    }
            }
        }while(op != 6);
    }
}
