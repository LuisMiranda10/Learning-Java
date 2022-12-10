package Models;

public class Mamifero extends Animal {
	private boolean castrado;
	
	//Construtor que recebe os atributos
	public Mamifero() {
		super();
		this.castrado = castrado;
	}

	//getters e setters dos atributos de Ave 
	public boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
}
