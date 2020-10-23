

public class Asignatura {

	public int codigoAsignatura;
	public String nombreAsignatura;
	public String materiales;

    public Asignatura() {
    	
    }
	
	
	public Asignatura(int codigoAsignatura, String nombreAsignatura, String materiales) {
		this.codigoAsignatura = codigoAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.materiales = materiales;
	
	}

	public int getCodigoAsignatura() {
		return codigoAsignatura;
	}

	public void setCodigoAsignatura(int codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setAsignaturas(String materiales) {
		this.materiales = materiales;
	}


	@Override
	public String toString() {
		return "Asignatura [codigoAsignatura=" + codigoAsignatura + ", nombreAsignatura=" + nombreAsignatura
				+ ", materiales=" + materiales + "]";
	}

	

}
