package curso_programacao_orientacao_a_objetos_main;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Produto5;

public class ModificadoresDeAcesso {
	/*
	 * Fazer um programa para ler os dados de um produto em estoque (nome, pre�o e
	 * quantidade no estoque). Em seguida:
	 * � Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no
	 *   estoque)
	 * � Realizar uma entrada no estoque e mostrar novamente os dados do produto
	 * � Realizar uma sa�da no estoque e mostrar novamente os dados do produto
	 * 
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entre com os dados do Produto");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Pre�o: ");
		double preco = sc.nextDouble();
		Produto5 produto = new Produto5(nome, preco);
		
		//usando o Encapsulamento trocando o nome do produto digitado.
		produto.setNome("Computador");
		System.out.println("Nome atualizado: " + produto.getNome());
		
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		sc.close();
	}

}
