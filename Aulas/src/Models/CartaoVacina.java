package Models;

public class CartaoVacina {
	private String nomeDono;
	private String nomeAnimal;
	private String especie;
	private String raca; 
	private int animalId;
	private Vacina[] vacina; 
	
	public CartaoVacina(String nomeDono, String nomeAnimal, Vacina[] vacina) {
		this.vacina = vacina;
	}
	
	/*public String toString() {
	 * return
	}*/

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
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

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public Vacina[] getVacina() {
		return vacina;
	}

	public void setVacina(Vacina[] vacina) {
		this.vacina = vacina;
	}
	
}
