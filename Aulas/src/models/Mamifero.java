package models;

public class Mamifero extends Animal {
    private boolean castrado;

    //Construtor que recebe os atributos
    public Mamifero(int id, String nome, String especie, String genero, String raca, int idade, double peso, double altura, boolean castrado) {
        super(id, nome, especie, raca, genero, idade, peso, altura);
        this.castrado = castrado;
    }
    
    public Mamifero() {
    	
    }

    //getters e setters dos atributos de Ave 
    public boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String toString() {
        return "MAMIFERO\n"
        		+ "Nome: " + getNome() + ", Especie: " + getEspecie() + ", Raca: " + getRaca() + ", Genero: " + getGenero() + ", Idade: " + getIdade() + ", Peso: " + getPeso() + ", Altura: " + getAltura() + ", Castrado: " + getCastrado() + "\n";
    }
    
}