package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {
	public static void main(String[] args) {
		
		Persona p1 = new Persona("45896321", "Lucía", "Fernández", LocalDate.of(1995, 3, 14), "Femenino", "Av. Siempre Viva 742", "1132456789", "lucia.fernandez@mail.com");
		Persona p2 = new Persona("37281945", "Martín", "Gómez", LocalDate.of(1988, 11, 2), "Masculino", "Calle San Martín 123", "1145678910", "martin.gomez@mail.com");
		Persona p3 = new Persona("40987654", "Carla", "Domínguez", LocalDate.of(2001, 7, 25), "Femenino", "Belgrano 456", "1167894321", "carla.dominguez@mail.com");
		Persona p4 = new Persona("32547896", "Julián", "Pérez", LocalDate.of(1993, 1, 5), "Masculino", "Mitre 890", "1176543210", "julian.perez@mail.com");
		Persona p5 = new Persona("45896321", "Lucía", "Fernández", LocalDate.of(1995, 3, 14), "Femenino", "Av. Siempre Viva 742", "1132456789", "lucia.fernandez@mail.com");
		
		HashSet<Persona> listaPersonas = new HashSet<Persona>();		
		
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		listaPersonas.add(p5); //No se agrega porque esta repetida
		
		System.out.println("--- Información de Personas en HashSet ---");
		Iterator<Persona> it = listaPersonas.iterator();
		
		while(it.hasNext()) {
			
			Persona persona = it.next();
            System.out.println(persona.toString());
		}
		
	}
}
