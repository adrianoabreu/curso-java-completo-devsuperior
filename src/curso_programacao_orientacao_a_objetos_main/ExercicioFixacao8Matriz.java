package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao8Matriz {
	/*
	 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
	 * uma matriz de M linhas por N colunas contendo n�meros inteiros,
	 * podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
	 * pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
	 * esquerda, acima, � direita e abaixo de X, quando houver, conforme
	 * exemplo.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//Digitar valor que far� parte da busca.
		int x = sc.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Posicao " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Baixo: " + matriz[i+1][j]);
					}
				}				
			}
		}
		
		
		sc.close();
		
	}

}
