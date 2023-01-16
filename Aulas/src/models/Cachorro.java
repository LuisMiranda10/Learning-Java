package models;

public class Cachorro extends Animal {
    private boolean castrado;

    //Construtor que recebe os atributos
    public Cachorro(String nome, String especie, String genero, String raca, int idade, String altura, boolean castrado) {
        super(nome, especie, raca, genero, idade, altura);
        this.castrado = castrado;
    }
    
    public Cachorro() {
    	
    }

    //getters e setters do atributo de Cachorro 
    public boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String toString() {
        return "CACHORRO\n"
        		+ "Nome: " + getNome() + ", Especie: " + getEspecie() + ", Raca: " + getRaca() + ", Genero: " + getGenero() + ", Idade: " + getIdade() + ", Porte: " + getAltura() + ", Castrado: " + getCastrado() + "\n";
    }
    
}