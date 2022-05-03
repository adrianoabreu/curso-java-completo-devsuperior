package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioProposto4 {
	/*
	 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
	 * hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
	 * decimais.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int    numeroFuncionario = sc.nextInt();
		int    horasTrabalhadas  = sc.nextInt();
		double valorPorHora      = sc.nextDouble();
		
		double salario           = horasTrabalhadas * valorPorHora;
		
		System.out.println("Entrada:                        Saida:");
		System.out.println(numeroFuncionario + "                               NUMBER: " + numeroFuncionario);
		System.out.print(horasTrabalhadas + "             ");
		System.out.printf("                SALARY: %.2f\n" , salario);
		System.out.printf("%.2f", valorPorHora);
		
		
		sc.close();
		
	}

}
