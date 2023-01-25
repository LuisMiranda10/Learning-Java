package models;

public class Coelho extends Animal{
	private String situacaoDosDentes;

    //Construtor que recebe os atributos
    public Coelho(String nome, String especie, String genero, String raca, int idade, String altura, String situacaoDosDentes) {
        super(nome, especie, raca, genero, idade, altura);
        this.situacaoDosDentes = situacaoDosDentes;
    }
    
    public Coelho() {
    	
    }

    //getters e setters do atributo de Coelho
    public String getSituacaoDosDentes() {
        return situacaoDosDentes;
    }

    public void setSituacaoDosDentes(String situacaoDosDentes) {
        this.situacaoDosDentes = situacaoDosDentes;
    }

    public String toString() {
        return "COELHO\n"
        		+ "Nome: " + getNome() + ", Especie: " + getEspecie() + ", Raca: " + getRaca() + ", Genero: " + getGenero() + ", Idade: " + getIdadePet() + ", Porte: " + getAltura() + ", Situacao dos dentes: " + getSituacaoDosDentes() + "\n";
    }
}
