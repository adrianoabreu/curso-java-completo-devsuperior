package curso_programacao_orientacao_a_objetos_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import curso_programacao_orientacao_a_objetos_entidades.Produto8;
import curso_programacao_orientacao_a_objetos_entidades.ProdutoImportado;
import curso_programacao_orientacao_a_objetos_entidades.ProdutoUsado;

public class ExercicioFixacao10Polimorfismo {
	/*
	 * Fazer um programa para ler os dados de N
	 * produtos (N fornecido pelo usu�rio). Ao final,
	 * mostrar a etiqueta de pre�o de cada produto na
	 * mesma ordem em que foram digitados.
	 * 
	 * Todo produto possui nome e pre�o. Produtos
	 * importados possuem uma taxa de alf�ndega, e
	 * produtos usados possuem data de fabrica��o.
	 * Estes dados espec�ficos devem ser
	 * acrescentados na etiqueta de pre�o conforme
	 * exemplo (pr�xima p�gina). Para produtos
	 * importados, a taxa e alf�ndega deve ser
	 * acrescentada ao pre�o final do produto.
	 * 
	 * Favor implementar o programa conforme
	 * projeto ao lado.
	 */
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de Produtos: ");
		int n = sc.nextInt();
		
		List<Produto8> lista = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do Produto " + i);
			System.out.print("Comum, usado ou importado (c/u/i) ? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Pre�o: ");
			Double preco = sc.nextDouble();

			if(tipo == 'i') {
				System.out.print("Taxa de alf�ndega: ");
				Double taxaAlfandega = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			}else if(tipo == 'u') {
				System.out.print("Data de Fabrica��o: ");
				Date dataFabricacao = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}else {
				lista.add(new Produto8(nome, preco));
			}
		}
		
		System.out.println();
		System.out.println("PRE�OS: ");
		for(Produto8 p : lista) {
			System.out.println(p.etiquetaDePreco()); // o polimorfismo est� exatamente no m�todo etiquetaDePreco();
		}
		
		sc.close();
		
	}

}
