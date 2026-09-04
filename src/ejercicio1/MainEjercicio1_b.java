package ejercicio1;
import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDate;
import java.util.Arrays;


public class MainEjercicio1_b {
    public static void main(String[] args) {
    	
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        
        	listaEmpleados.addAll(Arrays.asList(
        	        new Empleado("11111111", "Carlos", "Gomez", LocalDate.of(1985, 3, 10), "Masculino", "Calle A 123", "1111", "carlos@email.com", "Vendedor"),
        	        new Empleado("22222222", "Lucia", "Paz", LocalDate.of(1992, 7, 21), "Femenino", "Calle B 456", "2222", "lucia@email.com", "Gerente"),
        	        new Empleado("33333333", "Marcos", "Ruiz", LocalDate.of(1988, 1, 5), "Masculino", "Calle C 789", "3333", "marcos@email.com", "Administrativo"),
        	        new Empleado("44444444", "Ana", "Luz", LocalDate.of(1995, 11, 30), "Femenino", "Calle D 012", "4444", "ana@email.com", "Programadora"),
        	        new Empleado("55555555", "Diego", "Rios", LocalDate.of(1980, 9, 15), "Masculino", "Calle E 345", "5555", "diego@email.com", "Analista")
        			));
        
        

        System.out.println("--- Información de Empleados en ArrayList ---");
        Iterator<Empleado> it = listaEmpleados.iterator();
        
        while (it.hasNext()) {
            Empleado empleado = it.next();
            System.out.println(empleado.toString());
        }
    }
}