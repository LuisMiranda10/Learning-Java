package models;

public class Ave extends Animal {
    private boolean asaCortada;

    //Construtor que recebe os atributos
    public Ave(int id, String nome, String especie, String genero, String raca, int idade, double peso, double altura, boolean asaCortada) {
        super(id, nome, especie, raca, genero, idade, peso, altura);
        this.asaCortada = asaCortada;
    }
    
    public Ave() {
    	
    }

    //getters e setters dos atributos de Ave 
    public boolean getAsaCortada() {
        return asaCortada;
    }

    public void setAsaCortada(boolean asaCortada) {
        this.asaCortada = asaCortada;
    }

    public String toString() {
        return "AVE\n"
        		+ "Nome: " + getNome() + ", Especie: " + getEspecie() + ", Raca: " + getRaca() + ", Genero: " + getGenero() + ", Idade: " + getIdade() + ", Peso: " + getPeso() + ", Altura: " + getAltura() + ", Asa Cortada: " + getAsaCortada() + "\n";
    }
}