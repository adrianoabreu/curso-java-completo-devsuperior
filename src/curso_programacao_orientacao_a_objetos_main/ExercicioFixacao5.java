package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.ContaBancaria;

public class ExercicioFixacao5 {
	/*
	 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
		titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito
		inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua
		conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.
		
		Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J�
		o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por
		exemplo).
		
		Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger
		isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque
		realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for
		suficiente para realizar o saque e/ou pagar a taxa.
		
		Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o
		informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre
		mostrando os dados da conta ap�s cada opera��o.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Informe o nome do titular da conta: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Deseja fazer um deposito inicial? (s/n):  ");
		char opcao = sc.next().charAt(0);
		
		double deposito  = 0.0;
		ContaBancaria cb = null;
		
		if(opcao == 's') {
			System.out.print("Informe o valor do Deposito Inicial: ");
			deposito = sc.nextDouble();
		    cb = new ContaBancaria(numeroConta, nomeTitular, deposito);
		}else {
			cb = new ContaBancaria(numeroConta, nomeTitular);
		}		
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(cb);
		
		System.out.println();
		System.out.println("Fa�a um deposito: ");
		deposito = sc.nextDouble();
		cb.depositar(deposito);
		
		System.out.println();
		System.out.println("Dados da conta atualizados:");
		System.out.println(cb);
		
		System.out.println();
		System.out.println("Fa�a um saque: ");
		double saque = sc.nextDouble();
		cb.sacar(saque);
		
		System.out.println();
		System.out.println("Dados da conta atualizados:");
		System.out.println(cb);
		
		sc.close();
	}

}
