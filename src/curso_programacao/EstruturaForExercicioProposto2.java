package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaForExercicioProposto2 {
	/*
	 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
	 * Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
	 * essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in  = 0;
		int out = 0;
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.println(in  + " in");
		System.out.println(out + " out");
		
		sc.close();
		

	}

}
