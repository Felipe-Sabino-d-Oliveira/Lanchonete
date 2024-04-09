package produto;

// Classe produto com os atributos 
public class Produto{
	
	private String nome;
	private double preco;
	private int quantidade;
	private String validade;
	private String fornecedor;

	// Construtor para inicializar os atributos de produto
	public Produto(String nome, double preco, int quantidade, String validade, String fornecedor){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.validade = validade;
		this.fornecedor = fornecedor;
	}
	// Métodos para acessar os atributos de produto
	public String getNome(){
		return nome;
	}
	public double getPreco(){
		return preco;
	}
	public int getQuantidade(){
		return quantidade;
	}
	public String getValidade(){
		return validade;
	}
	public String getFornecedor(){
		return fornecedor;
	}
}