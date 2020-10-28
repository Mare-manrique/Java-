import java.util.Scanner;

public class Matriz {
	static Scanner scanner = new Scanner(System.in);
	

	public static void llenarMatriz(double[][] matriz) {
		System.out.println("Ingrese valores de la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("X" + i + "[" + i + "][" + j + "]= ");
				matriz[i][j] = scanner.nextDouble();
			}
		}
	}

	public static void imprimirMatriz(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "|\t ");
			}
			System.out.println();

		}

	}

	public static double[][] operarMatriz(int incognitas, double[][] matriz) {

		for (int i = 0; i < incognitas; i++) {
			double d;
			double c = 0;

			d = matriz[i][i];
			
			if(d==0) {
				
				System.out.println("D es igual a 0 por lo tanto: \n");
			
			}else{
				System.out.print((1 / d) + "*fila" + (i + 1) + "\n");
				for (int j = 0; j < incognitas+1; j++) {
					matriz[i][j] = ((matriz[i][j]) / d);
				}

				for (int j = 0; j < incognitas; j++) {
					for (int k = 0; k < incognitas+1; k++) {
						
						System.out.print(matriz[j][k] + "\t");
					}
					System.out.print("\n");
				}

				System.out.print("\n\n");

				for (int x = 0; x < incognitas; x++) {
					if (i != x) {
						c = matriz[x][i];
	  					System.out.print("-" + c + "*fila" + (i + 1) + "+ fila" + (x + 1) + "\n");
						for (int y = 0; y < incognitas+1; y++) {
							matriz[x][y] = matriz[x][y] - c * matriz[i][y];
						}
						

						for (int j = 0; j < incognitas; j++) {
							for (int k = 0; k < incognitas+1; k++) {
								System.out.print(matriz[j][k] + "\t");
							}
							System.out.print("\n");
						}
						System.out.print("\n\n");
					}
				}
			
			}
			
			
		
	}
		return matriz;
	
	}
	
}
