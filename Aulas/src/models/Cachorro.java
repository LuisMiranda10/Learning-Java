package models;

import java.util.ArrayList;

public class Cachorro extends Animal {
	private String situacaoFucinho;

	// Construtor que recebe os atributos
	public Cachorro(String nomeDono, int idadeDono, String nome, String especie, String genero, String raca,
			int idade, String altura, String situacaoFucinho, ArrayList<Vacina> vacinas) {
		super(nomeDono, idadeDono, nome, especie, raca, genero, idade, altura, vacinas);
		this.situacaoFucinho = situacaoFucinho;
	}

	public Cachorro() {

	}

	// getters e setters do atributo de Cachorro
	public String getSituacaoFucinho() {
		return situacaoFucinho;
	}

	public void setSituacaoFucinho(String situacaoFucinho) {
		this.situacaoFucinho = situacaoFucinho;
	}

	public String toString() {
		return "Nome Dono: " + getNomeDono() + "\n\nIdade Dono: " + getIdadeDono() + "\n\nNome: " + getNome()
				+ "\n\nEspecie: " + getEspecie() + "\n\nRaca: " + getRaca() + "\n\nGenero: " + getGenero()
				+ "\n\nIdade: " + getIdadePet() + "\n\nPorte: " + getAltura() + "\n\nSituacao fucinho: "
				+ getSituacaoFucinho() + "\n";
	}
}