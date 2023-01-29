package models;

public class Coelho extends Animal {
	private String situacaoDosDentes;

	// Construtor que recebe os atributos
	public Coelho(String nomeDono, int idadeDono, String nome, String especie, String genero, String raca, 
			int idade,String altura, String situacaoDosDentes) {
		super(nomeDono, idadeDono, nome, especie, raca, genero, idade, altura);
		this.situacaoDosDentes = situacaoDosDentes;
	}

	public Coelho() {

	}

	// getters e setters do atributo de Coelho
	public String getSituacaoDosDentes() {
		return situacaoDosDentes;
	}

	public void setSituacaoDosDentes(String situacaoDosDentes) {
		this.situacaoDosDentes = situacaoDosDentes;
	}

	public String toString() {
		return "Nome Dono: " + getNomeDono() + "\n\nIdade Dono: " + getIdadeDono() + "\n\nNome: " + getNome()
				+ "\n\nEspecie: " + getEspecie() + "\n\nRaca: " + getRaca() + "\n\nGenero: " + getGenero()
				+ "\n\nIdade: " + getIdadePet() + "\n\nPorte: " + getAltura() + "\n\nSituacao dos dentes: "
				+ getSituacaoDosDentes() + "\n";
	}
}
