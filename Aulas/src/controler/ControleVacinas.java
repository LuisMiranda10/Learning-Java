package controler;

import java.util.ArrayList;

import models.Vacina;

public class ControleVacinas {
	private ArrayList<Vacina> vacinas;
	private int qtdVacinas;

	public ControleVacinas(ControleDados dados){
		this.vacinas = dados.getVacinas();
		this.qtdVacinas = dados.getQtdVacinas();
	}

	public ArrayList<String> getTipoVacina() {
		ArrayList<String> tipoVacinas = new ArrayList<String>();
		for(int i = 0; i < vacinas.size(); i++) {
			tipoVacinas.add(vacinas.get(i).getTipoVacina());
		}
		
		return tipoVacinas;
	}
	
	public String getTipoVacina(int i) {
		 return vacinas.get(i).getTipoVacina();
	 }
	
	public String getDataVacina(int i) {
		return vacinas.get(i).getDataVacina();
	}
	
	public String getDataDose(int i) {
		return vacinas.get(i).getDataDose();
	}

	public String getLocal(int i) {
		return vacinas.get(i).getLocal();
	}
	
	public String getLote(int i) {
		return vacinas.get(i).getLote();
	}
	
	public String getDoses(int i) {
		return vacinas.get(i).getDoses();
	}
}


