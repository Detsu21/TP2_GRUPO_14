package ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDate;

public class MainEjercicio1_b {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("11111111", "Carlos", "Gomez", LocalDate.of(1985, 3, 10), "Masculino", "Calle A 123", "1111", "carlos@email.com", "Vendedor");
        Empleado emp2 = new Empleado("22222222", "Lucia", "Paz", LocalDate.of(1992, 7, 21), "Femenino", "Calle B 456", "2222", "lucia@email.com", "Gerente");
        Empleado emp3 = new Empleado("33333333", "Marcos", "Ruiz", LocalDate.of(1988, 1, 5), "Masculino", "Calle C 789", "3333", "marcos@email.com", "Administrativo");
        Empleado emp4 = new Empleado("44444444", "Ana", "Luz", LocalDate.of(1995, 11, 30), "Femenino", "Calle D 012", "4444", "ana@email.com", "Programadora");
        Empleado emp5 = new Empleado("55555555", "Diego", "Rios", LocalDate.of(1980, 9, 15), "Masculino", "Calle E 345", "5555", "diego@email.com", "Analista");

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);
        listaEmpleados.add(emp3);
        listaEmpleados.add(emp4);
        listaEmpleados.add(emp5);

        System.out.println("--- Información de Empleados en ArrayList ---");
        Iterator<Empleado> it = listaEmpleados.iterator();
        
        while (it.hasNext()) {
            Empleado empleado = it.next();
            System.out.println(empleado.toString());
        }
    }
}