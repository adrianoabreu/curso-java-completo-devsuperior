package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioResolvido2 {
	/*
	 * Leia 3 valores de ponto flutunte e efetue o calculo das raizes da equa��o de bhaskara. Se n�o for poss�vel
	 * calcular as ra�zes, mostre a mensagem correspondente "Imposs�vel calcular", caso haja uma divis�o por 0 ou raiz
	 * de numero negativo.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4 * a * c;
		
		if(a == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		}else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
		
		sc.close();
		
	}

}
