package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhileExercicioResolvido2 {
	/*
	 * Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um, a 
	 * idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m um valor
	 * de idade negativa. Calcular e imprimir a idade m�dia deste grupo de indiv�duos. Se for
	 * entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int idade           = sc.nextInt();
		double media        = 0.0;
		int quantidadeLidos = 0;
		int idadeSomada     = 0;

		while(idade >= 0) {
			quantidadeLidos += 1;
			idadeSomada     += idade;
			idade           = sc.nextInt();			
		}
		
		if(quantidadeLidos > 0) {
			media = (double) idadeSomada / quantidadeLidos;
			System.out.printf("Idade Media = %.2f", media);
		}else {
			System.out.println("impossivel calcular");
		}

		sc.close();
	}

}
