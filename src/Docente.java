
public class Docente extends Persona{
	
	protected int codigoProfesor;
	protected String areaDocente;
	
	
	
	Docente(String nombre, String apellidos, String anioNacimiento, int codigoProfesor, String areaDocente) {
		super(nombre, apellidos, anioNacimiento);
		this.codigoProfesor = codigoProfesor;
		this.areaDocente = areaDocente;
	}

	public int getCodigoProfesor() {
		return codigoProfesor;
	}

	public void setCodigoProfesor(int codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}

	public String getAreaDocente() {
		return areaDocente;
	}

	public void setAreaDocente(String areaDocente) {
		this.areaDocente = areaDocente;
	}

	@Override
	public String toString() {
		return "Docente [nombre ="+nombre+ " ,apellido="+apellidos+",codigoProfesor=" + codigoProfesor + ", areaDocente=" + areaDocente + "]";
	}

	
}