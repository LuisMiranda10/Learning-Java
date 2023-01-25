package models;

public class Gato extends Animal {
    private String pelagem;

    //Construtor que recebe os atributos
    public Gato(String nome, String especie, String genero, String raca, int idade, String altura, String pelagem) {
        super(nome, especie, raca, genero, idade, altura);
        this.pelagem = pelagem;
    }
    
    public Gato() {
    	
    }

    //getters e setters do atributo de Gato
    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String toString() {
        return "GATO\n"
        		+ "Nome: " + getNome() + ", Especie: " + getEspecie() + ", Raca: " + getRaca() + ", Genero: " + getGenero() + ", Idade: " + getIdadePet() + ", Porte: " + getAltura() + ", Pelagem: " + getPelagem() + "\n";
    }
}