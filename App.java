import temperatura.Temperatura;
import empleado.Empleado;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        double tempF = 75;
        double tempC = Temperatura.fahrenheitACelsius(tempF);
        System.out.printf("%.2f grados Fahrenheit son %.2f grados Celsius.%n", tempF, tempC);

        tempC = 25;
        tempF = Temperatura.celsiusAFahrenheit(tempC);
        System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit.%n", tempC, tempF);

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", "Perez", 2500000));
        empleados.add(new Empleado("Maria", "Gomez", 3000000));
        empleados.add(new Empleado("Carlos", "Lopez", 2800000));

        System.out.println("Informacion de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("ID: " + empleado.getIdEmpleado());
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Apellidos: " + empleado.getApellidos());
            System.out.println("Salario: " + empleado.getSalarioMensual());
            System.out.println();
        }

        double totalNomina = Empleado.calcularTotalNomina(empleados);
        System.out.printf("El total de la nomina de la empresa es: $%.2f%n", totalNomina);
    }
}

