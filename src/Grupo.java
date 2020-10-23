
public class Grupo {

	public String horario;
	public String nombreGrupo;
	public int codigoGrupo;
	

	Asignatura asignatura;
	Docente docente;
	Alumno alumno;
	Alumno alumno1;

	public Grupo() {

	}

	public Grupo(String nombreGrupo, int codigoGrupo, String horario, Asignatura asigantura, Docente docente,
			Alumno alumno, Alumno alumno1) {
		super();
		this.horario = horario;
		this.nombreGrupo = nombreGrupo;
		this.codigoGrupo = codigoGrupo;
		this.docente = docente;
		this.alumno = alumno;
		this.alumno1 = alumno1;
		this.asignatura = asigantura;
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

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}



	@Override
	public String toString() {
		return "Grupo [horario=" + horario + ", nombreGrupo=" + nombreGrupo + ", codigoGrupo=" + codigoGrupo
				+ ", asignatura=" + asignatura + ", docente=" + docente + ", alumno=" + alumno + ", alummno1= "+alumno1+"]";
	}
	

}
