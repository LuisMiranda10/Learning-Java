package models;

public class Gato extends Animal {
	private String pelagem;

	// Construtor que recebe os atributos
	public Gato(String nomeDono, int idadeDono, String nome, String especie, String genero, String raca, 
			int idade,String altura, String pelagem) {
		super(nomeDono, idadeDono, nome, especie, raca, genero, idade, altura);
		this.pelagem = pelagem;
	}

	public Gato() {

	}

	// getters e setters do atributo de Gato
	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String toString() {
		return "Nome Dono: " + getNomeDono() + "\n\nIdade Dono: " + getIdadeDono() + "\n\nNome: " + getNome()
				+ "\n\nEspecie: " + getEspecie() + "\n\nRaca: " + getRaca() + "\n\nGenero: " + getGenero()
				+ "\n\nIdade: " + getIdadePet() + "\n\nPorte: " + getAltura() + "\n\nPelagem: " + getPelagem() + "\n";
	}
}