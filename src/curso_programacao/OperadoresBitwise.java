package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresBitwise {
	/*
	 * Aplica-se Operadores bitwise em programa��o de baixo n�vel como micro controlador, programa��o de 
	 * interface com redes, ardu�nos, etc.
	 */
	public static void main(String[] args) {
		/*
		* int n1 = 89;
		* int n2 = 60;
		* System.out.println(n1 & n2);
		* System.out.println(n1 | n2);
		* System.out.println(n1 ^ n2);
		*/
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false");
		}
		sc.close();
		
	}

}
