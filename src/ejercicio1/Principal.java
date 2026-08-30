package ejercicio1;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// test de las distintas clases
		Empleado emp1 = new Empleado();
		Persona guy1 = new Persona();

		System.out.println(guy1.toString());

		System.out.println(emp1.toString());
		System.out.println("El próximo legajo será el: " + emp1.devuelveProximoLegajo());

		Empleado emp2 = new Empleado();
		System.out.println(emp2.toString());
		System.out.println("El próximo legajo será el: " + emp2.devuelveProximoLegajo());
		
		Empleado emp3 = new Empleado();
		System.out.println(emp3.toString());
		System.out.println("El próximo legajo será el: " + emp3.devuelveProximoLegajo());
		
		Empleado emp4 = new Empleado("45896321","Lucía","Fernández",LocalDate.of(1995,3,14),"Femenino","Av. Siempre Viva 742","1132456789","lucia.fernandez@mail.com","Desarrolladora Backend");
		System.out.println(emp4.toString());
		System.out.println("El próximo legajo será el: " + emp4.devuelveProximoLegajo());
		
		Empleado emp5 = new Empleado("37281945","Martín","Gómez",LocalDate.of(1988,11,2),"Masculino","Calle San Martín 123","1145678910","martin.gomez@mail.com","Analista de Datos");
		System.out.println(emp5.toString());
		System.out.println("El próximo legajo será el: " + emp5.devuelveProximoLegajo());
	}

}
