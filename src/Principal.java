import java.util.Scanner;



public class Principal {
	
	static double [][] matriz1= null;
	static Scanner scanner= new Scanner(System.in);
	static int incognitas;

	
	public static void main(String[] args) {
		
	 {
			System.out.println("Ingrese el numero de icognitas");
			incognitas = scanner.nextInt();
			
		
		} while(incognitas <=1) ;
		
			matriz1 = new double[incognitas][incognitas + 1];

			System.out.println("Filas: "+matriz1.length);
			System.out.println("Colomnuas: "+matriz1[0].length);
			
			System.out.println();
			
			Matriz.llenarMatriz(matriz1);
			Matriz.imprimirMatriz(matriz1);
			Matriz.operarMatriz(incognitas, matriz1);
			System.out.println("La matriz identidad y los resultados son:");
			Matriz.imprimirMatriz(matriz1);
		
		
			
		
		

		
		
		
	}

	}

