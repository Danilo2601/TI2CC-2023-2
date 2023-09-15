package model;

public class Jogo {
	private int id;
	private float preco;
	private String nome;
	private String categoria;
	private String publisher;
	
	
	public Jogo() {
		this.id = -1;
		this.preco = -1;
		this.nome = "";
		this.categoria = "";
		this.publisher = "";
	}
	
	public Jogo(int id, float preco, String nome, String categoria, String publisher) {
		this.id = id;
		this.preco = preco;
		this.nome = nome;
		this.categoria = categoria;
		this.publisher = publisher;
	}
	
	public int getID() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Jogo[id = "+id+", nome = "+nome+", preco = "+preco+", categoria = "+categoria+", publisher = "+publisher+" ]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.getID() == ((Jogo) obj).getID());
	}	
	
}
