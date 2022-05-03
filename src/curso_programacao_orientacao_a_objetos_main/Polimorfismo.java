package curso_programacao_orientacao_a_objetos_main;

import curso_programacao_orientacao_a_objetos_entidades.Conta;
import curso_programacao_orientacao_a_objetos_entidades.ContaNegocio;

public class Polimorfismo {
	/*
	 * Em Programa��o Orientada a Objetos, polimorfismo � recurso que
	 * permite que vari�veis de um mesmo tipo mais gen�rico possam
	 * apontar para objetos de tipos espec�ficos diferentes, tendo assim
	 * comportamentos diferentes conforme cada tipo espec�fico.
	 */
	public static void main(String[] args) {
		
		Conta x = new Conta(1020, "Adriano", 1000.0);
		Conta y = new ContaNegocio(1023, "Adriano", 1000.0, 0.01);
		
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println("Saldo do X: " + x.getSaldo());
		System.out.println("Saldo do Y: " + y.getSaldo());
	}

}
