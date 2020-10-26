
public class Persona {
	protected String nombre;
	protected String apellidos;
	protected String anioNacimiento;
	
	
	
	public Persona(String nombre, String apellidos,
			String anioNacimiento) {
		
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioNacimiento = anioNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(String anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
