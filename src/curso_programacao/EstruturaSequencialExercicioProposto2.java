package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioProposto2 {
	/*
	 * Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
	 *casas decimais.
	 *F�rmula da �rea: area = pi . raio ao quadrado
	 *Considere o valor de pi = 3.14159
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double pi   = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * (Math.pow(raio, 2)); //(Math.pow(raio, 2) representa raio ao quadrado.
		
		System.out.println("Entrada:                       Saida:");
		System.out.printf("%.2f", raio);
		System.out.printf("                           %.4f", area);
		
		sc.close();
		
	}

}
