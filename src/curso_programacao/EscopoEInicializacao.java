package curso_programacao;

public class EscopoEInicializacao {
	/*
	 * Vari�veis no Java sempre precisam ser inicializadas de alguma maneira.
	 * O escopo de uma vari�vel � quando se declara uma vari�vel que pode ser usada dentro de uma  condi��o if-else ou fora dela. 
	 */
	public static void main(String[] args) {
		
		double price = 400.00;
		
		double discount; // Vari�vel pode ser inicializada como: double discount = 0; Por�m n�o � necess�rio o else abaixo.
		
		if(price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}
		
		System.out.println(discount);

	}

}
