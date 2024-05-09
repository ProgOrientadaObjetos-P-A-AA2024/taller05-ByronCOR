/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.Vehiculos;

/**
 *
 * @author Usuario
 */
public class EjecutorDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        boolean bandera = true;

        while (bandera) {
            System.out.println("\nIngresar la marca del vehículo\n");
            String marcaVehiculo = entrada.nextLine();
            System.out.println("\nIngresar cédula del propietario:\n");
            int cedulaPropietario = entrada.nextInt();
            System.out.println("\nIngresar el año de fabricación:\n");
            int yearFabricacion = entrada.nextInt();
            System.out.println("\nIngresar el valor del vehículo:\n");
            double valorMatricula = entrada.nextDouble();
            Vehiculos auto = new Vehiculos(marcaVehiculo,
                    cedulaPropietario,
                    yearFabricacion,
                    valorMatricula);
            auto.calcularValorMatricula();
            cadena = String.format("%s%s\n", cadena, auto);
            entrada.nextLine();
            System.out.println("\nPara continuar agregando datos "
                    + "digite SI\n");
            String opcion = entrada.nextLine();
            opcion = opcion.toUpperCase();
            if (opcion.equals("SI")) {
                bandera = false;
            }

        }
        System.out.printf("%s\n", cadena);
    }

}
