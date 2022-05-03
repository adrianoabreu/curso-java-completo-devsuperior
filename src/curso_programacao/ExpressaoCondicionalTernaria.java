package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
	/*
	 * Express�o condicional tern�ria possui a mesma fun��o do if-else.
	 *    vari�vel = (condi��o) ? verdadeiro : falso
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Desconto: " + desconto);
		
		sc.close();
	}

}
