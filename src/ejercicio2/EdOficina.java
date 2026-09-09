package ejercicio2;

public class EdOficina extends Edificio implements IInstalacion{

	private String nombre;
	private int n_oficinas;
	
	public EdOficina(String nombre, double superficie, int n_oficinas){
		
		super(superficie);
		
		this.setN_oficinas(n_oficinas);
		this.setNombre(nombre);
	}
	
	@Override
	public int getTipoDeInstalacion() {
		return 2;
	}

	public int getN_oficinas() {
		return n_oficinas;
	}

	public void setN_oficinas(int n_oficinas) {
		this.n_oficinas = n_oficinas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre + ", TipoDeInstalacion= " + getTipoDeInstalacion() + ", Superficie= " + this.getSuperficieEdificio() + ", N. Oficinas= " + this.getN_oficinas();
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdOficina otroEdificio = (EdOficina) obj;

        return Double.compare(otroEdificio.getSuperficieEdificio(), this.getSuperficieEdificio()) == 0 &&
               this.n_oficinas == otroEdificio.getN_oficinas();
    }
}