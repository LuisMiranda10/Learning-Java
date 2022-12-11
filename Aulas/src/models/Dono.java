package models;

public class Dono {     //Atributos da classe Animal
	private int id;
	private String nome;
	private int idade;
	private String endereco;
	private String telefone;
	private String genero;
	
	 //Construtor
	public Dono (int id, String nome, int idade, String endereco, String telefone, String genero) {  
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.genero =  genero;
	}
	
	public Dono() {
		
	}
	
	//getters e setters dos atributos da classe Dono
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String toString() {
		return "DONO\n"
				+ "Nome: " + nome + ", idade: " + idade + ", endereco: " + endereco + ", telefone: " + telefone 
				+ ", genero: " + genero + "\n";
	}
}
