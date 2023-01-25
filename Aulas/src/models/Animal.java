package models;

public abstract class Animal { //Atributos classe Animal
	private String nome;
	private String especie;
	private String raca;
	private String genero;
	private int idade;
	private String altura;
	
	/**
	 * Construtor Animal.
	 * @param nome
	 * @param especie
	 * @param raca
	 * @param genero
	 * @param idade
	 * @param peso
	 * @param altura    
	 */
	
	public Animal(String nome, String especie, String raca, String genero, int idade, String altura) { 
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
	}
	
	public Animal() {
		
	}
	
	//getters e setters para os atributos da classe Animal
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
	        return especie;
	    }
	
	public void setEspecie(String especie) {
        this.especie = especie;
    }
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getIdadePet() {
		return idade;
	}
	
	public void setIdadePet(int idade) {
		this.idade = idade;
	}
	
	public String getAltura() {
		return altura;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	/*public String toString() { // toString para imprimir os dados do animal
		return "ANIMAL\n"
				+ "O animal " + nome + " é um(a) " + especie + " de gênero " + genero + ", da raça "+ raca + " com porte de " + altura 
				+ " de altura e" + " com " + idade + " anos de idade."; 
	}*/
	
}
