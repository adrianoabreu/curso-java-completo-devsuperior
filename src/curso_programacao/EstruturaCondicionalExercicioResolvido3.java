package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioResolvido3 {
	/*
	 * Fazer um programa para ler tr�s n�meros inteiros. Em seguida, mostrar qual o
	 * menor dentre os tr�s n�meros lidos. Em caso de empate dos tr�s, mostrar apenas uma vez.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("MENOR = " + num1);
		} else if(num2 < num3) {
			System.out.println("MENOR = " + num2);
		} else {
			System.out.println("MENOR = " + num3);
		}
		
		sc.close();
	}

}
