package models;

public class Cachorro extends Animal {
    private String situacaoFucinho;

    //Construtor que recebe os atributos
    public Cachorro(String nome, String especie, String genero, String raca, int idade, String altura, String situacaoFucinho) {
        super(nome, especie, raca, genero, idade, altura);
        this.situacaoFucinho = situacaoFucinho;
    }
    
    public Cachorro() {
    	
    }

    //getters e setters do atributo de Cachorro 
    public String getSituacaoFucinho() {
        return situacaoFucinho;
    }

    public void setSituacaoFucinho(String situacaoFucinho) {
        this.situacaoFucinho = situacaoFucinho;
    }

    public String toString() {
        return "CACHORRO\n"
        		+ "Nome: " + getNome() + ", Especie: " + getEspecie() + ", Raca: " + getRaca() + ", Genero: " + getGenero() + ", Idade: " + getIdadePet() + ", Porte: " + getAltura() + ", Situacao fucinho: " + getSituacaoFucinho() + "\n";
    }
    
}