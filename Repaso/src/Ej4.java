
import java.util.Scanner;

import com.davidecasas2.matrices.Matrices;
/**
 * 
 */

/**
 * @author David
 *
 */
public class Ej4 {

	public static int ganadora [] = {8, 11, 21, 32, 37, 44}; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		

		System.out.println("EScribe tu apuesta para compribarla");
		int apuesta []= new int[6];
		Vectores.pedir_vector(apuesta);;
		
		System.out.println("Tu apuesta es ");
		Vectores.mostrar_vector(apuesta);
		
		int aciertos = Vectores.num_aciertos(ganadora, apuesta);
		
		System.out.printf("Has acertado %d números ", aciertos);
		
		
		
	}

}
