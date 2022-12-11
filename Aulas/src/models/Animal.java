package models;

public abstract class Animal { //Atributos classe Animal
	private int id;
	private String nome;
	private String especie;
	private String raca;
	private String genero;
	private int idade;
	private double peso;
	private double altura;
	
	/**
	 * Construtor Animal.
	 * @param id
	 * @param nome
	 * @param especie
	 * @param raca
	 * @param genero
	 * @param idade
	 * @param peso
	 * @param altura    
	 */
	
	public Animal(int id, String nome, String especie, String raca, String genero, int idade, double peso, double altura) { 
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.raca = raca;
		this.genero = genero;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Animal() {
		
	}
	
	//getters e setters para os atributos da classe Animal
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
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
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/*public String toString() { // toString para imprimir os dados do animal
		return "ANIMAL\n"
				+ "O animal " + nome + " é um(a) " + especie + " de gênero " + genero + ", da raça "+ raca + " com porte de " + altura 
				+ " de altura e peso de " + peso + " com " + idade + " anos de idade."; 
	}*/
	
}
