
import java.util.Scanner;

import com.davidecasas2.matrices.Matrices;
/**
 * 
 */

/**
 * @author David
 *
 */
public class Ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas filas quieres?:");
		int filas = entrada.nextInt();
		System.out.println("¿Cuantas columnas quieres?:");
		int columnas = entrada.nextInt();
		
		
		int matriz [][]= new int[filas][columnas];
		Matrices.pedir_matriz(matriz);
		
		System.out.println("Tu matriz es ");
		Matrices.mostrar_matriz(matriz);
		
		double medias [] = new double[filas];
		Matrices.media_filas(matriz, medias);
		
		System.out.println("El vector de medias es ");
		Vectores.mostrar_vector(medias);
		
		
	}

}
