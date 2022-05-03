package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Aluguel;

public class ExercicioFixacao6Vetores {
	/*
	 * A dona de um pensionato possui dez quartos para alugar para estudantes,
	 * sendo esses quartos identificados pelos n�meros 0 a 9.
	 * 
	 * Fazer um programa que inicie com todos os dez quartos vazios, e depois
	 * leia uma quantidade N representando o n�mero de estudantes que v�o
	 * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
	 * N estudantes. Para cada registro de aluguel, informar o nome e email do
	 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
	 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
	 * um relat�rio de todas ocupa��es do pensionato, por ordem de quarto,
	 * conforme exemplo.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos para alugar? ");
		int n = sc.nextInt();
		
		Aluguel[] vetor = new Aluguel[10];
		
		
		
		for(int i = 0; i <= n; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome,email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		sc.close();

	}

}
