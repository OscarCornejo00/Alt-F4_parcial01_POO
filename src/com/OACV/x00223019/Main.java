package com.OACV.x00223019;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Empleado> planilla = new ArrayList<>();

    public static void main(String[] args) {
        byte op = 0;
        CalculadoraImpuestos x = new CalculadoraImpuestos();
        int m = 0;

        String menu = "1. Agregar Empleado\n" +
                "2. Despedir Empleado\n" +
                "3. Ver lista de Empleados\n" +
                "4. Calcular sueldo\n" +
                "5. Mostrar totales\n" +
                "6. Salir";

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, menu));

            switch (op) {
                case 1://Agregar empleado

                    int aux = 0;
                    String T1 = " ";

                    String[] botones = {"Servicio Profesional", "Plaza Fija"};

                    aux = JOptionPane.showOptionDialog(null, "Tipo de empleado a agregar: ", "Type", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                    String nombre = JOptionPane.showInputDialog(null, "Nombre del empleado: ");
                    String nombreDocumento = JOptionPane.showInputDialog(null, "Tipo de documento (DUI, NIT, Pasaporte, Carnet) : ");
                    String numeroDocumento = JOptionPane.showInputDialog(null, "Digite numero de documento: ");
                    String puesto = JOptionPane.showInputDialog(null, "Puesto del empleado: ");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario del empleado: "));


                    Documento doc = new Documento(nombreDocumento, numeroDocumento);


                    if (aux == 0) {
                        int mesesContrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de meses del Contrato:"));
                        m = mesesContrato;

                        Empleado nuevoEmpleado = new ServicioProfesional(nombre, puesto, salario, mesesContrato);
                        planilla.add(nuevoEmpleado);

                        new Empresa("Super Mercado Salvadoreño", planilla);

                    } else if (aux == 1) {
                        int extension = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de telefono de la oficina: "));

                        Empleado nuevoEmpleado = new PlazaFija(nombre, puesto, salario, extension);
                        planilla.add(nuevoEmpleado);

                        new Empresa("Super Mercado Salvadoreño", planilla);

                    }
                    for (Empleado p : planilla) {
                        if (p.getNombre().equals(nombre)) {

                            if (p instanceof PlazaFija) {

                                T1 = "PlazaFija";


                            }

                            x.calcularTotales(p.getNombre(), T1, m);
                        }
                    }
                    break;
                case 2://Despedir empleado
                    try {

                        if (planilla == null || planilla.size() == 0) {
                            JOptionPane.showMessageDialog(null,"Lista de empleados esta vacia");
                            throw new EmptyList("Lista de empleados vacia\n");
                        } else {
                            String despedirEmpleado = JOptionPane.showInputDialog(null, "Nombre del empleado a despedir: ");
                            boolean find = planilla.removeIf(obj -> obj.getNombre().equals(despedirEmpleado));

                            if (find = false) {
                                JOptionPane.showMessageDialog(null,"Empleado no encontrado");
                                throw new NotFoundEmployee("Empleado no encontrado\n");
                            }
                        }


                    } catch (NotFoundEmployee ex) {
                        System.out.printf(ex.getMessage());

                    } catch (EmptyList ex) {
                        System.out.printf(ex.getMessage());

                    } catch (Exception ex) {
                        System.out.printf(ex.getMessage());
                    }

                    break;
                case 3://Mostrar lista de empleados

                    try {

                        if (planilla == null || planilla.size() == 0) {
                            JOptionPane.showMessageDialog(null,"Lista de empleados esta vacia");
                            throw new EmptyList("Lista de empleados vacia\n");
                        } else {
                            JOptionPane.showMessageDialog(null, planilla);
                        }
                    } catch (EmptyList ex) {
                        System.out.printf(ex.getMessage());

                    } catch (Exception ex) {
                        System.out.printf(ex.getMessage());
                    }


                    break;

                case 4://Calcular pago
                    try {
                        double z;
                        String T = " ";
                        boolean busc = false;

                        if (planilla == null || planilla.size() == 0) {
                            JOptionPane.showMessageDialog(null,"Lista de empleados esta vacia");
                            throw new EmptyList("Lista de empleados vacia\n");
                        } else {
                            String name = JOptionPane.showInputDialog(null, "Nombre del empleado a calcular sueldo: ");


                            for (Empleado p : planilla) {
                                if (p.getNombre().equals(name)) {
                                    busc = true;
                                    if (p instanceof ServicioProfesional) {
                                        T = "ServicioProfesional";
                                    }

                                    z = x.calcularPago(p.getNombre(), T);
                                    JOptionPane.showMessageDialog(null, "El salario Liquido es: " + z);
                                }
                            }


                        }
                        if (busc = false) {
                            JOptionPane.showMessageDialog(null,"Empleado no encontrado");
                            throw new NotFoundEmployee("Empleado no encontrado\n");
                        }

                    } catch (NotFoundEmployee ex) {
                        System.out.printf(ex.getMessage());

                    } catch (EmptyList ex) {
                        System.out.printf(ex.getMessage());

                    } catch (Exception ex) {
                        System.out.printf(ex.getMessage());
                    }

                    break;
                case 5://Mostrar totales
                    try {

                        if (planilla == null || planilla.size() == 0) {
                            JOptionPane.showMessageDialog(null,"Lista de empleados esta vacia");
                            throw new EmptyList("Lista de empleados vacia\n");

                        } else {
                            JOptionPane.showMessageDialog(null, x.mostrarTotales());
                        }

                    } catch (EmptyList ex) {
                        System.out.printf(ex.getMessage());

                    } catch (Exception ex) {
                        System.out.printf(ex.getMessage());
                    }

                    break;
            }
        } while (op != 6);
    }
}