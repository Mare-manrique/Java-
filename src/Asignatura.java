import java.util.ArrayList;
import java.util.List;

public class Asignatura {

	public int codigoAsignatura;
	public String nombreAsignatura;
	public String materiales;
	public List<Grupo> listaGrupo = new ArrayList<Grupo>();

	private Grupo group;

	public Asignatura() {

	}

	public Asignatura(int codigoAsignatura, String nombreAsignatura, String materiales) {
		super();
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

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public List<Grupo> getListaGrupo() {
		return listaGrupo;
	}

	public void setListaGrupo(List<Grupo> listaGrupo) {
		this.listaGrupo = listaGrupo;
	}

	public void agregarGrupo(Grupo grupo) {
		listaGrupo.add(grupo);
	}

	@Override
	public String toString() {
		return "Asignatura [codigoAsignatura=" + codigoAsignatura + ", nombreAsignatura=" + nombreAsignatura
				+ ", materiales=" + materiales + ",grupo=" + listaGrupo + "]";
	}

}
