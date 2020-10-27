import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Maria Espitia
 * @version: 26/10/2020
 *
 */

public class PrincipalArea {

	public static List<Asignatura> listaAsiganturas = new ArrayList<Asignatura>();
	public static List<Grupo> listaGrupo = new ArrayList<Grupo>();
	public static List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	public static List<Docente> listaDocentes = new ArrayList<Docente>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cantidadDocentes;
		int cantidadAsignaturas;
		int cantidadGrupos;
		int cantidadAlumnos;
		boolean leido = false;
		Docente docente = new Docente();
		Asignatura asignatura = new Asignatura();
		Grupo grupo = new Grupo();
		Alumno alumno = new Alumno();

		do {
			/**
			 * //@exception InputMismatchException ex, ESTA ES LANZADA POR UN OBJETO
			 * SCANNER, LA CUAL INDICA QUE EL TIPO DE VARIABLE INGRESADO, NO COINCIDE CON EL
			 * ESPERADO
			 */
			try {
				System.out.println("Digite la cantidad de docentes a ingresar");// SE PIDE LA CANTIDAD DE DOCENTES A
																				// CREAR
				cantidadDocentes = sc.nextInt();

				for (int i = 0; i < cantidadDocentes; i++) {// PIDE LA INFORMACION DE CADA DOCENTE DEPENDIENDO DE LA
															// CANTIDAD DE DOCENTES
					docente = new Docente();
					System.out.println("Digite el nombre del docente " + (i + 1));
					docente.nombre = sc.next();
					System.out.println("Digite el apellido del docente " + (i + 1));
					docente.apellidos = sc.next();
					System.out.println("Digite el año de nacimiento del docente " + (i + 1));
					docente.anioNacimiento = sc.next();
					System.out.println("Digite el codigo del docente " + (i + 1));
					docente.codigoProfesor = sc.nextInt();
					System.out.println("Digite el area del docente " + (i + 1));
					docente.areaDocente = sc.next();

					listaDocentes.add(docente);
					leido = true;
				}

			} catch (InputMismatchException ex) {
				System.out.println("Ah introducido un valor erroneo en el codigo del docente");
				sc.next(); // SE LEE EL ELEMENTO NO RECONOCIDO POR EL TRY PARA ELIMINARLO
				leido = false;
			}

		} while (leido == false);

		System.out.println(listaDocentes);

		do {
			/**
			 * //@exception InputMismatchException ex, ESTA ES LANZADA POR UN OBJETO
			 * SCANNER, LA CUAL INDICA QUE EL TIPO DE VARIABLE INGRESADO, NO COINCIDE CON EL
			 * ESPERADO
			 */
			try {
				System.out.println("Digite la cantidad de asignaturas a ingresar");// SE PIDE LA CANTIDAD DE ASIGNATURAS
																					// A CREAR
				cantidadAsignaturas = sc.nextInt();

				for (int i = 0; i < cantidadAsignaturas; i++) {// PIDE LA INFORMACION DE CADA ASIGNATURA DEPENDIENDO DE
																// LA CANTIDAD DE ASIGNATURAS
					asignatura = new Asignatura();
					System.out.println("Digite el codigo de la asignatura " + (i + 1));
					int codigoAsignatura = sc.nextInt();
					asignatura.setCodigoAsignatura(codigoAsignatura);
					System.out.println("Digite el nombre de la asignatura" + (i + 1));
					String nombreAsignatura = sc.next();
					asignatura.setNombreAsignatura(nombreAsignatura);
					System.out.println("Digite los materiales de la asignatura " + (i + 1));
					String materiales = sc.next();
					asignatura.setMateriales(materiales);

					listaAsiganturas.add(asignatura);
					leido = true;

				}

			} catch (InputMismatchException ex) {
				System.out.println("Ah introducido un valor erroneo en el codigo de la asignatura");
				sc.next(); // SE LEE EL ELEMENTO NO RECONOCIDO POR EL TRY PARA ELIMINARLO
				leido = false;
			}

		} while (leido == false);

		System.out.println(listaAsiganturas);

		do {
			/**
			 * //@exception InputMismatchException ex, ESTA ES LANZADA POR UN OBJETO
			 * SCANNER, LA CUAL INDICA QUE EL TIPO DE VARIABLE INGRESADO, NO COINCIDE CON EL
			 * ESPERADO
			 */
			try {
				System.out.println("Digite la cantidad de grupos a ingresar");// SE PIDE LA CANTIDAD DE GRUPOS A CREAR
				cantidadGrupos = sc.nextInt();

				for (int i = 0; i < cantidadGrupos; i++) {// PIDE LA INFORMACION DE CADA GRUPO DEPENDIENDO DE LA
															// CANTIDAD DE GRUPOS
					grupo = new Grupo();
					System.out.println("Digite el horario del grupo" + (i + 1));
					String horarioGrupo = sc.next();
					grupo.setHorario(horarioGrupo);

					System.out.println("Digite el nombre del grupo " + (i + 1));
					String nombreGrupo = sc.next();
					grupo.setNombreGrupo(nombreGrupo);

					System.out.println("Digite el codigo del grupo " + (i + 1));
					int codigoGrupo = sc.nextInt();
					grupo.setCodigoGrupo(codigoGrupo);

					listaGrupo.add(grupo);
					leido = true;
				}

			} catch (InputMismatchException ex) {
				System.out.println("Ah introducido un valor erroneo en el codigo del grupo");
				sc.next(); // SE LEE EL ELEMENTO NO RECONOCIDO POR EL TRY PARA ELIMINARLO
				leido = false;
			}

		} while (leido == false);

		System.out.println(listaGrupo);

		do {
			/**
			 * //@exception InputMismatchException ex, ESTA ES LANZADA POR UN OBJETO
			 * SCANNER, LA CUAL INDICA QUE EL TIPO DE VARIABLE INGRESADO, NO COINCIDE CON EL
			 * ESPERADO
			 */
			try {
				System.out.println("Digite la cantidad de alumnos a ingresar");// SE PIDE LA CANTIDAD DE GRUPOS A CREAR
				cantidadAlumnos = sc.nextInt();

				for (int i = 0; i < cantidadAlumnos; i++) {// PIDE LA INFORMACION DE CADA ALUMNO DEPENDIENDO DE LA
															// CANTIDAD DE ALUMNOS

					alumno = new Alumno();
					System.out.println("Digite el nombre del alumno " + (i + 1));
					String nombreAlumno = sc.next();
					alumno.setNombre(nombreAlumno);
					System.out.println("Digite el apellido del alumno" + (i + 1));
					String apellidoAlumno = sc.next();
					alumno.setApellidos(apellidoAlumno);
					System.out.println("Digite el año de nacimiento del alumno " + (i + 1));
					String anioNaAlumno = sc.next();
					alumno.setAnioNacimiento(anioNaAlumno);
					System.out.println("Digite el codigo del alumno " + (i + 1));
					int codigoAlumno = sc.nextInt();
					alumno.setCodigoEstudiantil(codigoAlumno);
					System.out.println("Digite el semestre que cursa el alumno " + (i + 1));
					String semestre = sc.next();
					alumno.setSemestre(semestre);

					listaAlumnos.add(alumno);
					leido = true;

				}

			} catch (InputMismatchException ex) {
				System.out.println("Ah introducido un valor erroneo en el codigo del alumno");
				sc.next(); // SE LEE EL ELEMENTO NO RECONOCIDO POR EL TRY PARA ELIMINARLO
				leido = false;
			}

		} while (leido == false);

		System.out.println(listaAlumnos);
		

		for (Docente docentes : listaDocentes) {
			for (Grupo group : listaGrupo) {
				System.out.println("Desea añadir el docente " + docentes.getNombre() + " al grupo "
						+ group.getNombreGrupo() + " ? s/n");
				String opcionDocente = sc.next();
				if (opcionDocente.equalsIgnoreCase("s")) {
					group.setDocente(docentes);
					break;
				}
				
			}
		}

		for (Grupo group : listaGrupo) {// RECORRERA LA LISTA DE GRUPO
			for (Asignatura asignatur : listaAsiganturas) {// RECORRERA LA LISTA DE ASIGNATURAS
				System.out.println("Desea añadir el grupo " + group.getNombreGrupo() + " a la asigantura "
						+ asignatur.getNombreAsignatura() + "  ?s/n ");
				String opcion = sc.next();
				if (opcion.equalsIgnoreCase("s")) {
					asignatur.agregarGrupo(group);// SE AGREGA EL GRUPO SELECECIONADO A LA ASIGNATURA
					break;// ROMPE EL BUCLE CUANDO A SE AGREGA EL GRUPO, PARA QUE CONTINUE CON EL
							// SIGUIENTE GRUPO
				}
			}
		}

		for (Alumno alum : listaAlumnos) {// RECORRERA LA LISTA DE ALUMNOS
			for (Asignatura asignatur : listaAsiganturas) {// RECORRERA LA LISTA DE ASIGNATURAS
				System.out.println(
						"Desea añadir el" + alum + " a la asignatura " + asignatur.getNombreAsignatura() + "  ? s/n ");
				String opcionGrupo = sc.next();
				if (opcionGrupo.equalsIgnoreCase("s")) {
					for (Grupo group : listaGrupo) {// RECORRERA LA LISTA DE GRUPO
						group=new Grupo();
						System.out.println(
								"Desea añadir el alumno" + alum + " al grupo " + group.getNombreGrupo() + "? s/n ");
						String opcion = sc.next();
						if (opcion.equalsIgnoreCase("s")) {
							group.agregarAlumno(alum);// SE AGREGA EL ALUMNO SELECECIONADO AL GRUPO
							break;
						}

					}
				}
				break;

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

		System.out.println("Desea ver la lista de un grupo? s/n");
		String opcionLista = sc.next();
		if (opcionLista.equalsIgnoreCase("s")) {

			System.out.println("Ingrese el codigo del grupo que desa ver");
			int codigoGrupoLista = sc.nextInt();
			for (Grupo group : listaGrupo) {
				if ((group.getCodigoGrupo()) == codigoGrupoLista) {
					group.listarAlumnos(alumno);
				}

			}

			grupo.listarAlumnos(alumno);

		}
	}
}
