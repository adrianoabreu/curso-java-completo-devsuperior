package curso_programacao_orientacao_a_objetos_entidades;

public class Produto5 {
	
	//Modificador de acesso private   - atributos s�o acessados diretamente somente dentro da pr�pria classe.
	//Modificador de acesso public    - atributos s�o acessados diretamente por todas classes (ao menos que ele resida em um m�dulo diferente que n�o exporte o pacote onde ele est�)
	//Modificador de acesso protected - atributos s�o acessados diretamente no mesmo pacote, bem como em subclasses de pacotes diferentes.
	//Modificador de acesso (nada)    - atributos s�o acessados diretamente nas classes do mesmo pacote.
	String nome;
	private double preco;
	private int    quantidade;
	
	//Contrutor Padr�o
	public Produto5(){
		
	}
	
	public Produto5(String nome, double preco, int quantidade){
		this.nome       = nome;
		this.preco      = preco;
		this.quantidade = quantidade;
	}
	
	//Quando h� mais de um contrutor na classe, significa que a classe possui Sobrecarga.
	public Produto5(String nome, double preco){
		this.nome       = nome;
		this.preco      = preco;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ " + String.format("%.2f",valorTotalEmEstoque());
	}
}
