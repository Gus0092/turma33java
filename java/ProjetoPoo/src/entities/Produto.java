package entities;

public class Produto {
	private String codigo;
	private String nome;
	private double preco;
	private int estoque=10;
	private int carrinho=0;
	
	public Produto(String codigo, String nome, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", estoque=" + estoque;
	}
	public String retornaCarrinho() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", carrinho=" + carrinho + "]";
	}
	public int getEstoque() {
		return estoque;
	}

	public void tiraEstoque(int estoque) {
		this.estoque -= estoque;
	}

	public int Carrinho() {
		return carrinho;
	}

	public void acrescentaCarrinho(int carrinho) {
		this.carrinho += carrinho;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	
}
