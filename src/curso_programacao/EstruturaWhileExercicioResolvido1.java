package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhileExercicioResolvido1 {
	/*
	 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem
	 * que indique se estes valores foram digitados em ordem crescente ou decrescente.
	 * 
	 * ENTRADA:
	 * A entrada cont�m v�rios casos de teste. Cada caso cont�m dois valores intiros X e Y. A leitura deve ser encerrada
	 * ao ser fornecido valores iguais para X e Y.
	 * 
	 * SA�DA:
	 * Para cada caso de teste imprima "Crescente", caso os valores tenham sido digitados na ordem crescente, caso
	 * contr�rio imprima a mensagem "Decrescente".
	 * 
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != y) {
			System.out.println((x < y) ? "Decrescente" : "Crescente"); // utilizando condicional tern�ria
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
