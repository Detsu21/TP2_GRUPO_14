package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("AA202020", "Juan", "Perez", LocalDate.of(1990, 5, 15), "Masculino", "Calle Falsa 123", "1122334455", "juan@email.com");
        Persona persona2 = new Persona("20202020", "Maria", "Gomez", LocalDate.of(1995, 10, 20), "Femenino", "Avenida Siempreviva 742", "1199887766", "maria@email.com");

        System.out.println("--- Validación DNI 1 ---");
        try {
            Persona.VerificarDNI(persona1.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }

        System.out.println("\n--- Validación DNI 2 ---");
        try {
            Persona.VerificarDNI(persona2.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }
    }
}