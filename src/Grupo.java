import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Grupo {

	private String horario;
	private String nombreGrupo;
	private int codigoGrupo;
	private List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	

	Docente docente;

	public Grupo(String horario, String nombreGrupo, int codigoGrupo) {
		super();
		this.horario = horario;
		this.nombreGrupo = nombreGrupo;
		this.codigoGrupo = codigoGrupo;
	
	}
    
	public Grupo(Docente docente) {
		this.docente = docente;
	}

	
	public Grupo() {

	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public int getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(int codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	

	public void agregarAlumno(Alumno alumno) {
		listaAlumnos.add(alumno);
	}
	
	public void listarAlumnos(Alumno alumno) {
		if (listaAlumnos.isEmpty()) {
			System.out.println("La lista está vacia");
			return;
		}

		Iterator it = listaAlumnos.iterator();

		System.out.println("La lista de alumnos es: ");
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

	@Override
	public String toString() {
		return "Grupo [horario=" + horario + ", nombreGrupo=" + nombreGrupo + ", codigoGrupo=" + codigoGrupo
				+ ", docente=" + docente + ", alumno=" + listaAlumnos + "]";
	}

}
