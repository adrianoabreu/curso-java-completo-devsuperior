package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioProposto2 {
	/*
	 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero % 2 == 0 || numero == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
