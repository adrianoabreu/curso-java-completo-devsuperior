package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Funcionario;

public class ExercicioFixacao2 {
	/*
	 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
	 * seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
	 * sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
	 * afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe
	 * projetada abaixo.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionario: " + funcionario);
		
		System.out.print("Digite a porcentagem de aumento de sal�rio: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println("Dados Atualziados: " + funcionario);
		
		sc.close();
	}

}
