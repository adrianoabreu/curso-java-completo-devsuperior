package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioProposto8 {
	/*
	 * Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
	 * que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem
	 * qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
	 * Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, calcule e
	 * mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
	 * 
	 * RENDA:                      IMPOSTO DE RENDA:
	 * de 0.00    a 2000.00        Isento
	 * de 2000.01 a 3000.00        8%
	 * de 3000.01 a 4500.00        18%
	 * acima de     4500.00        28%
	 * 
	 * Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa de
	 * sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa �
	 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
	 * duas casas decimais.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		double impostoDeRenda;
		
		if(salario <= 2000.0) {
			impostoDeRenda = 0.0;
			
		}else if(salario <= 3000.0) {
			impostoDeRenda = (salario - 2000.0) * 0.08;
			
		}else if(salario <= 4500.0) {
			impostoDeRenda = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			
		}else {
			impostoDeRenda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			
		}
		
		if(impostoDeRenda == 0.0) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$ %.2f\n", impostoDeRenda);
		}
		
		sc.close();
	}

}
