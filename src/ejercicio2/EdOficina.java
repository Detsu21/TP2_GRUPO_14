package ejercicio2;

public class EdOficina extends Edificio implements IInstalacion{

	private String nombre;
	private int n_oficinas;
	
	public EdOficina(String nombre, double superficie, int n_oficinas){
		
		super(superficie);
		
		this.getN_Oficinas(n_oficinas);
		this.setNombre(nombre);
	}
	
	@Override
	public int getTipoDeInstalacion() {
		return 2;
	}

	public int getN_Oficinas(int n_oficinas)
	{
		return n_oficinas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + ", TipoDeInstalacion= " + getTipoDeInstalacion() + ", Superficie= " + this.getSuperficieEdificio() + ", N. Oficinas= " + this.getN_Oficinas(n_oficinas);
	}
}