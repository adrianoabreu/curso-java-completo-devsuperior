package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Triangulo;

public class ProblemaComOrientacaoAObjetos {
	/*
	 * Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas
	 * v�lidas). Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos
	 * possui a maior �rea.
	 * A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b e c � a
	 * seguinte (f�rmula de Heron):
	 * 
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//double p = (x.a + x.b + x.c) / 2.0;
		//double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		//p = (y.a + y.b + y.c) / 2.0;
		//double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
