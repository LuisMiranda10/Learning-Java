package models;

import java.lang.StringBuilder;

public class CartaoVacina {
	private String nomeDono;
	private String nomeAnimal;
	private String especie;
	private String raca; 
	private int animalId;
	private Vacina[] vacina; 
	
	public CartaoVacina(String nomeDono, String nomeAnimal, String especie, String raca, int animalId, 
	Vacina[] vacina) {
		this.nomeDono = nomeDono;
		this.nomeAnimal = nomeAnimal;
		this.especie = especie;
		this.raca = raca;
		this.animalId = animalId;
		this.vacina = vacina;
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CARTAO DE VACINACAO\n");
        sb.append("Nome do Dono: " + getNomeDono() + "\n");
        sb.append("Nome do Animal: " + getNomeAnimal() + "\n");
        sb.append("Especie: " + getEspecie() + "\tRaca:"+ getRaca() +"\n");
        for (int i = 0; i < vacina.length; i++) {
            sb.append("Vacina: " + vacina[i].getTipoVacina() + "\tData: " + vacina[i].getDataDose() + "\n");
        }
        return sb.toString();
    }


	public CartaoVacina () {
		
	}

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
