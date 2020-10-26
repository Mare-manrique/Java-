import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalArea {

	public static List<Asignatura> listaAsiganturas = new ArrayList<Asignatura>();
	public static List<Grupo> listaGrupo = new ArrayList<Grupo>();
	public static List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	public static List<Docente> listaDocentes = new ArrayList<Docente>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Docente docenteMartin = new Docente("Martin", "Ochoa", "1975", 74581, "Matematica pura");
		Docente docenteCamilo = new Docente("Camilo", "Rodriguez", "1980", 47512, "Matematica pura");
		Docente docenteMariana = new Docente("Mariana", "Camargo", "1991", 67312, "Linguistica");

		listaDocentes.add(docenteMartin);
		listaDocentes.add(docenteCamilo);
		listaDocentes.add(docenteMariana);

		Asignatura asignaturaMatematicas = new Asignatura(111205, "Matematicas", "calculadora");
		Asignatura asignaturaLinguistica = new Asignatura(111205, "Linguistica", "Libros");

		listaAsiganturas.add(asignaturaMatematicas);
		listaAsiganturas.add(asignaturaLinguistica);

		Alumno alumno = new Alumno("Maria", "Espitia", "2001", 12345, "Dos");
		Alumno alumno1 = new Alumno("Carla", "Rodriguez", "1997", 24561, "Tres");
		Alumno alumno2 = new Alumno("Camilo", "Camargo", "2000", 12485, "Dos");
		Alumno alumno3 = new Alumno("David", "Peñaloza", "1998", 57846, "Dos");
		Alumno alumno4 = new Alumno("Teresa", "Arias", "1999", 47621, "Tres");
		Alumno alumno5 = new Alumno("Maicol", "Ortiz", "2001", 31524, "Dos");

		listaAlumnos.add(alumno);
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);

		Grupo grupo1 = new Grupo("8-10", "Matematicas-1", 123, docenteMartin);
		Grupo grupo2 = new Grupo("4-8", "Matematicas-2", 147, docenteCamilo);
		Grupo grupo3 = new Grupo("6-8", "Linguistica", 159, docenteMariana);

		listaGrupo.add(grupo1);
		listaGrupo.add(grupo2);
		listaGrupo.add(grupo3);

		for (Grupo group : listaGrupo) {
			for (Asignatura asignatura : listaAsiganturas) {
				System.out.println("Desea añadir este grupo " + group.getNombreGrupo() + " a la asigantura "
						+ asignatura.getNombreAsignatura() + "  ?s/n ");
				String opcion = sc.next();
				if (opcion.equalsIgnoreCase("s")) {
					asignatura.agregarGrupo(group);
					break;
				}
			}
		}

		
		
			for (Alumno alum : listaAlumnos) {
				for (Asignatura asignatura : listaAsiganturas) {
				System.out.println("Desea añadir este alumno a la asignatura " + asignatura.getNombreAsignatura()
						+ "  ? s/n " + alum);
				String opcionGrupo = sc.next();
				if (opcionGrupo.equalsIgnoreCase("s")) {
					for (Grupo group : listaGrupo) {
						System.out.println(
								"Desea añadir este alumno al grupo " + group.getNombreGrupo() + "? s/n " + alum);
						String opcion = sc.next();
						if (opcion.equalsIgnoreCase("s")) {
							grupo1.agregarAlumno(alum);
							break;
						}

					}
				}

			}
		}

		System.out.println();
		for (int i = 0; i < listaAsiganturas.size(); i++) {
			System.out.println(listaAsiganturas.get(i));
		}

		System.out.println("Ingrese el codigo del grupo que desa ver");
		int codigoGrupo = sc.nextInt();
		for (Grupo group : listaGrupo) {
			if ((group.getCodigoGrupo()) == codigoGrupo) {
				System.out.println(group);
			}

		}

	}

}
