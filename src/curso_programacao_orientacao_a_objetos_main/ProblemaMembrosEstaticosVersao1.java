package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMembrosEstaticosVersao1 {
	/*
	 * Fazer um programa para ler um valor num�rico qualquer, e da� mostrar
	 * quanto seria o valor de uma circunfer�ncia e do volume de uma esfera
	 * para um raio daquele valor. Informar tamb�m o valor de PI com duas
	 * casas decimais.
	 * 
	 * � Vers�o 1: m�todos na pr�pria classe do programa
	 * 		� Nota: dentro de um m�todo est�tico voc� n�o pode chamar membros de
	 * 		  inst�ncia da mesma classe.
	 */
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
