package maven.demo;

public class Jogo {
	private int codigo;
	private String nome;
	private String categoria;
	private String publisher;
	
	public Jogo() {
		this.codigo = -1;
		this.nome = "";
		this.categoria = "";
		this.publisher = "";
	}
	
	public Jogo(int codigo, String nome, String categoria, String publisher) {
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.publisher = publisher;
	}
	
	public int getCodigo() {
		return codigo;
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
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	
	@Override
	public String toString() {
		return "Jogo[codigo = "+codigo+", nome = "+nome+", categoria = "+categoria+", publisher = "+publisher+" ]";
	}
}
