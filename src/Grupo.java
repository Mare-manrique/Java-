import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grupo {

	private String horario;
	private String nombreGrupo;
	private int codigoGrupo;
	private List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	Scanner sc = new Scanner(System.in);

	Docente docente;

	public Grupo(String horario, String nombreGrupo, int codigoGrupo, Docente docente) {
		super();
		this.horario = horario;
		this.nombreGrupo = nombreGrupo;
		this.codigoGrupo = codigoGrupo;
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

	@Override
	public String toString() {
		return "Grupo [horario=" + horario + ", nombreGrupo=" + nombreGrupo + ", codigoGrupo=" + codigoGrupo
				+ ", docente=" + docente + ", alumno=" + listaAlumnos + "]";
	}

}
