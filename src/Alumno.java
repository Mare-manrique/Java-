

public class Alumno  extends Persona {

	public int codigoEstudiantil;
	public String semestre;

	
	
	Alumno(String nombre, String apellidos, String anioNacimiento, int codigoEstudiantil, String semestre) {
		super(nombre, apellidos, anioNacimiento);
		this.codigoEstudiantil = codigoEstudiantil;
		this.semestre = semestre;
	}
	public int getCodigoEstudiantil() {
		return codigoEstudiantil;
	}
	public void setCodigoEstudiantil(int codigoEstudiantil) {
		this.codigoEstudiantil = codigoEstudiantil;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		return "Alumno [nombre ="+nombre+ " ,apellido="+apellidos+",codigoEstudiantil=" + codigoEstudiantil + ", semestre=" + semestre + "]";
	}
	
	


}