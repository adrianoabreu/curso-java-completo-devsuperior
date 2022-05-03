package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhileExercicioProposto3 {
	/*
	 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
	 * um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
	 * 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
	 * que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
	 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
	 * exemplo.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		int quantidadeAlcool   = 0;
		int quantidadeGasolina = 0;
		int quantidadeDiesel   = 0;
		
		while(combustivel != 4) {
			if(combustivel == 1) {
				quantidadeAlcool     += 1;
			}else if(combustivel == 2){
				quantidadeGasolina   += 1;
			}else if(combustivel == 3) {
				quantidadeDiesel     += 1;
			}
			combustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool:   " + quantidadeAlcool);
		System.out.println("Gasolina: " + quantidadeGasolina);
		System.out.println("Diesel:   " + quantidadeDiesel);
		
		sc.close();		
		

	}

}
