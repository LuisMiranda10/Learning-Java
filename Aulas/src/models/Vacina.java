package models;

public class Vacina { //Atributos classe Vacina
	private String tipoVacina;
	private String dataVacina;
	private String dataDose;
	private String local;
	private String lote;
	private String doses;

	//Construtor
 public Vacina (String tipoVacina, String dataVacina, String dataDose, String local, String lote, String doses) {
	this.tipoVacina = tipoVacina ;
	this.dataVacina = dataVacina ;
	this.dataDose = dataDose;
	this.local = local;
	this.lote = lote;
	this.doses = doses;
 }
 
 public Vacina() {
	 
 }
 
 //getters e setters dos atributos da classe Vacina
 public String getTipoVacina() {
	 return tipoVacina;
 }

public void setTipoVacina(String tipoVacina) {
	 this.tipoVacina = tipoVacina;
 }
 
 public String getDataVacina() {
	 return dataVacina;
 }
 
 public void setDataVacina(String dataVacina) {
	 this.dataVacina = dataVacina;
 }
 
 public String getDataDose() {
	 return dataDose;
 }
 
 public void setDataDose(String dataDose) {
	 this.dataDose = dataDose;
 }
 
 public String getLocal() {
	return local;
}

public void setLocal(String local) {
	this.local = local;
}

public String getLote() {
	 return lote;
 }
 
 public void setLote(String lote) {
	 this.lote = lote;
 }
 
 public String getDoses() {
	 return doses;
 }
 
 public void setDoses(String doses) {
	 this.doses = doses;
 }
 
 @Override
 
 public String toString() { // toString para imprimir os dados da vacina
	 return "VACINA\n"
	 		+ "Tipo da vacina: " + tipoVacina + ", data de fabricacao da vacina: " + dataVacina + ", data da dose: " + dataDose + 
			 ", local: " + local + ", lote da vacina: " + lote + ", numero de doses: " + doses + "\n";
 }
}
