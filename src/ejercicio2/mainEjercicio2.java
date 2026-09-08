package ejercicio2;
import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IInstalacion> arrayEdificios = new ArrayList<IInstalacion>();
		
		  arrayEdificios.add(new Polideportivo("Deportes", 30.5));
		  arrayEdificios.add(new Polideportivo("Eventos", 40.1));
		  arrayEdificios.add(new Polideportivo("Musicales", 10.5));
		  
		  arrayEdificios.add(new EdOficina("Oficina1", 12.1, 10));
		  arrayEdificios.add(new EdOficina("Oficina2", 30.2, 2));	
		  
			Iterator<IInstalacion> it = arrayEdificios.iterator();
			
			while(it.hasNext()) {
				
				IInstalacion i = it.next();
	            System.out.println(i.toString());
			}
		
	}

}
