package empleado;

import java.util.List;

public class Empleado {
    private static int contadorEmpleados = 0; 
    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private double salarioMensual;

    public Empleado(String nombre, String apellidos, double salarioMensual) {
        this.idEmpleado = ++contadorEmpleados; 
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioMensual = salarioMensual;
    }

    public static double calcularTotalNomina(List<Empleado> empleados) {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += empleado.salarioMensual;
        }
        return totalNomina;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
}

