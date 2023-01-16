package models;

public class Dono {     //Atributos da classe Animal
	private String nome;
	private int idade;
	
	 //Construtor
	public Dono (String nome, int idade) {  
		this.nome = nome;
		this.idade = idade;
	}
	
	public Dono() {
		
	}
	
	//getters e setters dos atributos da classe Dono

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
	
	
	public String toString() {//Imprimir os dados de Vacina
		return "DONO\n"
				+ "Nome: " + nome + ", idade: " + idade + "\n";
	}
}
