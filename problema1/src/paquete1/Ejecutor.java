/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete2.Estudiante;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar 1 o 2");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("Ingresar el nombre del estudiante\n");
            String nombre = entrada.nextLine();
            System.out.println("Ingresar la calificación 1\n");
            double nota1 = entrada.nextDouble();
            System.out.println("Ingresar la calificación 2\n");
            double nota2 = entrada.nextDouble();
            Estudiante libreta1 = new Estudiante(nombre,nota1,nota2);
            libreta1.calcularPromedio();
            System.out.printf("%s\n", libreta1);
        } else {
            System.out.println("Ingresar el nombre del estudiante\n");
            String nombre = entrada.nextLine();
            System.out.println("Ingresar la calificación 1\n");
            double nota1 = entrada.nextDouble();
            System.out.println("Ingresar la calificación 2\n");
            double nota2 = entrada.nextDouble();
            System.out.println("Ingresar la calificación 3\n");
            double nota3 = entrada.nextDouble();
            Estudiante libreta2 = new Estudiante(nombre,nota1,nota2,nota3);
            libreta2.calcularPromedio();
            System.out.printf("%s\n", libreta2);
        }
    }

}
