import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalArea {

	public static List<Asignatura> listaAsiganturas = new ArrayList<Asignatura>();

	public static List<Docente> listaDocentes = new ArrayList<Docente>();
	public static List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	public static List<Grupo> listaGrupo = new ArrayList<Grupo>();

	public static void main(String[] args) {

		Asignatura asignatura = new Asignatura(111205, "Matematicas", "calculadora");
		Asignatura asignatura1 = new Asignatura(111205, "Linguistica", "Libros");

		listaAsiganturas.add(asignatura);
		listaAsiganturas.add(asignatura1);

		Docente docente = new Docente("Martin", "Ochoa", "1975", 74581, "Matematica pura");
		Docente docente1 = new Docente("Camilo", "Rodriguez", "1980", 47512, "Matematica pura");
		Docente docente2 = new Docente("Mariana", "Camargo", "1991", 67312, "Linguistica");

		listaDocentes.add(docente);
		listaDocentes.add(docente1);
		listaDocentes.add(docente2);

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

		Grupo grupo = new Grupo("Matematicas-1", 123, "8-10", asignatura, docente, alumno, alumno2);
		Grupo grupo1 = new Grupo("Matematicas-2", 123, "4-8", asignatura, docente1, alumno1, alumno4);
		Grupo grupo2 = new Grupo("Linguistica", 159, "6-8", asignatura1, docente2, alumno3, alumno5);

		listaGrupo.add(grupo);
		listaGrupo.add(grupo1);
		listaGrupo.add(grupo2);

		System.out.println("Digite la posicion del grupo que desea ver");
		Scanner sc = new Scanner(System.in);
		int posicionGrupo = sc.nextInt();

		System.out.println(listaGrupo.get(posicionGrupo-1));

	}

}
