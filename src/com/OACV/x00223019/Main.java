package com.OACV.x00223019;

import javax.print.Doc;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner in = new Scanner(System.in);
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
                        String nombreDocumento = JOptionPane.showInputDialog(null, "Tipo de documento (DUI, NIT, Pasaporte, Carnet) : ");
                        String numeroDocumento = JOptionPane.showInputDialog(null, "Digite numero de documento: ");
                        String puesto = JOptionPane.showInputDialog(null, "Puesto del empleado: ");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario del empleado: "));


                        Documento doc = new Documento(nombreDocumento, numeroDocumento);


                        if (aux == 0){
                            int mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de meses del Contrato:"));

                            Empleado nuevoEmpleado = new ServicioProfesional(nombre, puesto, salario, mesesContrato);
                            planilla.add(nuevoEmpleado);

                            new Empresa("Super Mercado Salvadoreño",planilla);

                        } else if (aux==1) {
                            int extension = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de telefono de la oficina: "));

                            Empleado nuevoEmpleado = new PlazaFija(nombre, puesto, salario, extension);
                            planilla.add(nuevoEmpleado);

                            new Empresa("Super Mercado Salvadoreño",planilla);

                        }

                    break;
                case 2://Despedir empleado
                    try{

                        if (planilla == null || planilla.size()==0){
                            throw new EmptyList ("Lista de empleados vacia\n");
                        } else {
                            String despedirEmpleado = JOptionPane.showInputDialog(null,"Nombre del empleado a despedir: ");
                            boolean find = planilla.removeIf(obj -> obj.getNombre() .equals(despedirEmpleado));

                            if (find = false){
                                throw new NotFoundEmployee ("Empleado no encontrado\n");
                            }
                        }



                    } catch (NotFoundEmployee ex){
                        System.out.printf(ex.getMessage());

                    } catch (EmptyList ex){
                        System.out.printf(ex.getMessage());

                    } catch (Exception ex){
                        System.out.printf(ex.getMessage());
                    }

                    break;
                case 3://Mostrar lista de empleados

                    try {

                        if (planilla == null || planilla.size()==0){
                            throw new EmptyList ("Lista de empleados vacia\n");
                        } else {
                            JOptionPane.showMessageDialog(null, planilla);
                        }
                    }

                    catch (EmptyList ex){
                        System.out.printf(ex.getMessage());

                } catch (Exception ex){
                        System.out.printf(ex.getMessage());
                }


                break;

                case 4:
                    try {
                        double z;
                        String  T = " ";

                            if (planilla == null || planilla.size()==0){
                                throw new EmptyList ("Lista de empleados vacia\n");
                            } else {
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

                                if (bus = false){
                                    throw new NotFoundEmployee ("Empleado no encontrado\n");
                                }
                            }

                    } catch (NotFoundEmployee ex){
                        System.out.printf(ex.getMessage());

                    } catch (EmptyList ex){
                        System.out.printf(ex.getMessage());

                    } catch (Exception ex){
                        System.out.printf(ex.getMessage());
                    }

                    break;
                case 5://Mostrar totales
                    try {

                        if (planilla == null || planilla.size()==0){
                            throw new EmptyList ("Lista de empleados vacia\n");
                        } else {
                            JOptionPane.showMessageDialog(null,x.mostrarTotales());
                        }

                    } catch (EmptyList ex){
                        System.out.printf(ex.getMessage());

                    } catch (Exception ex){
                        System.out.printf(ex.getMessage());
                    }

                    break;
            }
        }while(op != 6);
    }
}