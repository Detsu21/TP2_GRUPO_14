package ejercicio2;

public class Polideportivo extends Edificio implements IInstalacion {

	private String nombre;
    
	
	public Polideportivo(String nombre, double superficie){
		
		super(superficie);
		
		this.setNombre(nombre);

	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + ", TipoDeInstalacion= " + getTipoDeInstalacion() + ", Superficie= " + this.getSuperficieEdificio();
	}
	

	

}
