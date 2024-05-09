/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class Vehiculos {

    private String marcaVehiculo;
    private int cedulaPropietario;
    private int yearFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Vehiculos(String m, int c, int f, double v) {
        
        marcaVehiculo = m;
        cedulaPropietario = c;
        yearFabricacion = f;
        valorVehiculo = v;

    }

    public Vehiculos(String m, int c, int f) {
       marcaVehiculo = m;
        cedulaPropietario = c;
        yearFabricacion = f;
        valorVehiculo = 20000;
    }

    public void establecerMarcaVehiculo(String m) {
        marcaVehiculo = m;
    }

    public void establecerCedulaPropietario(int c) {
        cedulaPropietario = c;
    }

    public void establecerYearFabricacion(int f) {
        yearFabricacion = f;
    }

    public void establecerValorVehiculo(double v) {
        valorVehiculo = v;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valorVehiculo * 0.00002) * (2024 - yearFabricacion);
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerCedulaPropietario() {
        return cedulaPropietario;
    }

    public int obtenerYearFabricacion() {
        return yearFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    // el metodo to Strin la representacion  del objeto
    @Override
    public String toString() {
        String cadena = String.format("\nCaracteristicas del Vehiculo\n\n"
                + "Marca del Vehículo:%s\n"
                + "Cédula del Propietario:%d\n"
                + "Año de Fabricación:%d\n"
                + "Valor del Vehículo:%.2f $\n"
                + "Valor Matricula:%.2f $\n",
                obtenerMarcaVehiculo(),
                obtenerCedulaPropietario(),
                obtenerYearFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
