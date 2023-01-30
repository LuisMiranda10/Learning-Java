package controler;

import java.util.ArrayList;

import models.*;
import view.TelaListaAnimais;

public class ControleDados {
	private Dados dados = new Dados();

    public ControleDados() {
        dados.EncherDados();
    }

    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }
    
    public ArrayList<Animal> getAnimais() {
		return dados.getAnimais();
	}
    
    public int getQtdAnimais() {
	    return dados.getQtdAnimais();
    }
	
	public ArrayList<Vacina> getVacinas() {
		return dados.getVacinas();
	}  
	
	public int getQtdVacinas() {
	    return dados.getQtdVacinas();
    }
	
	public String[] getNomeVacinas() {
        String[] nomeVacinas = new String[getQtdVacinas()];
        for (int i = 0; i < getQtdVacinas(); i++) {
            nomeVacinas[i] = dados.getVacinas().get(i).getTipoVacina();
        }
        return nomeVacinas;
    }
	
	public int buscarAnimal(String nomePet) {
        for(int i = 0; i < dados.getQtdAnimais(); i++) {
            if(dados.getAnimais().get(i).getNome().equals(nomePet)) {
                return i;
            }
        }

        return -1;
    }
	
	public int buscarVacina(String tipoVacina, String dataVacina) {
        for(int i = 0; i < dados.getQtdVacinas(); i++) {
            if(dados.getVacinas().get(i).getTipoVacina().equals(tipoVacina) && dados.getVacinas().get(i).getDataVacina().equals(dataVacina)) {
                return i;
            }
        }

        return -1;
    }
	
	/*
	 *CRUD DE ANIMAL 
	 */
	
	public boolean adicionarAnimal(String nomeDono, int idadeDono, String nomePet,String especie, String generos, String raca, int idadePet, String porte, String caracteristicaAnimal) {
        int count = 0;
        
        for(int i = 0; i < dados.getQtdAnimais(); i++) {
            boolean verif = dados.getAnimais().get(i).getNome().equals(nomePet);

            if(verif) {
                count++;
            }
        }
        
        if(count >= 1) {
            System.out.println("Animal já cadastrado!");
            return false;
        } else {
        	if(especie == "canina") {
        		System.out.println("Animal cadastrado com sucesso!");
                Cachorro c = new Cachorro(nomeDono, idadeDono, nomePet, especie, generos, raca, idadePet, porte, caracteristicaAnimal, null);
                dados.adicionarAnimal(c, null, null);
                return true;
        	}else if(especie == "roedor") {
        		System.out.println("Animal cadastrado com sucesso!");
                Coelho co = new Coelho(nomeDono, idadeDono, nomePet, especie, generos, raca, idadePet, porte, caracteristicaAnimal, null);
                dados.adicionarAnimal(null, co, null);
                return true;
        	}else if(especie == "felina") {
        		System.out.println("Animal cadastrado com sucesso!");
                Gato g = new Gato(nomeDono, idadeDono, nomePet, especie, generos, raca, idadePet, porte, caracteristicaAnimal, null);
                dados.adicionarAnimal(null, null, g);
                return true;
        	}
        }
       return false;
    }
        
     public Boolean editarAnimal(int idx, String nomeDonoNovo, int idadeDonoNovo, String nomePetNovo,String novaEspecie,String novoGenero, String novaRaca, int novaIdadePet, String novoPorte, String novaCaracteristica ){
                String nomeAntigo = dados.getAnimais().get(idx).getNome();

                for(int i = 0; i < dados.getQtdAnimais(); i++) {
                    if(dados.getAnimais().get(i).getNome().equals(nomeAntigo)) {
               
                    	dados.getAnimais().get(i).setNomeDono(nomeDonoNovo);
                    	dados.getAnimais().get(i).setIdadeDono(idadeDonoNovo);
                        dados.getAnimais().get(i).setNome(nomePetNovo);
                        dados.getAnimais().get(i).setGenero(novoGenero);
                        dados.getAnimais().get(i).setEspecie(novaEspecie);
                        dados.getAnimais().get(i).setRaca(novaRaca);
                        dados.getAnimais().get(i).setAltura(novoPorte);
                        dados.getAnimais().get(i).setIdadePet(novaIdadePet);
   
                        return true;
                    }
                }
     return false;
     }    
     
     public Boolean removerAnimal(int idx) {
         String nome = dados.getAnimais().get(idx).getNome();

         for(int i = 0; i < dados.getQtdAnimais(); i++) {
             if(dados.getAnimais().get(i).getNome().equals(nome)) {
                 dados.getAnimais().remove(i);
                 dados.setQtdAnimais(dados.getQtdAnimais() - 1);
                 return true;
             }
         }

         return false;
     }
     
     
     /*
      * CRUD DE VACINA 
      */
     
     public boolean adicionarVacina(String tipoVacina, String dataVacina, String dataDose, String local, String lote, String doses) {
         int count = 0;

         for(int i = 0; i < dados.getQtdVacinas(); i++) {
             boolean verif = dados.getVacinas().get(i).getTipoVacina().equals(tipoVacina);

             if(verif) {
                 count++;
             }
         }

         if(count >= 1) {
             System.out.println("Vacina já cadastrada!");
             return false;
         } else {
             System.out.println("Vacina cadastrado com sucesso!");
             Vacina v = new Vacina(tipoVacina, dataVacina, dataDose, local, lote, doses);
             dados.adicionarVacina(v);
             return true;
         }
     }
         
      public Boolean editarVacina(int idx, String tipoVacinaNova, String novaDataVacina, String novaDataDose, String novoLocal, String novoLote, String novaDose) {
             String tipoVacinaAntiga = dados.getVacinas().get(idx).getTipoVacina();
             String dataDoseAntiga = dados.getVacinas().get(idx).getDataDose();

             for(int i = 0; i < dados.getQtdVacinas(); i++) {
                 if(dados.getVacinas().get(i).getTipoVacina().equals(tipoVacinaAntiga) && dados.getVacinas().get(i).getDataDose().equals(dataDoseAntiga)) {

                     dados.getVacinas().get(i).setTipoVacina(tipoVacinaNova);
                     dados.getVacinas().get(i).setDataVacina(novaDataVacina);
                     dados.getVacinas().get(i).setDataDose(novaDataDose);
                     dados.getVacinas().get(i).setLocal(novoLocal);
                     dados.getVacinas().get(i).setLote(novoLote);
                     dados.getVacinas().get(i).setDoses(novaDose);
                     
                     return true;
                 }
             }

             return false;
     }
     
     public Boolean removerVacina(int idx) {
          String nome = dados.getVacinas().get(idx).getTipoVacina();

          for(int i = 0; i < dados.getQtdVacinas(); i++) {
              if(dados.getVacinas().get(i).getTipoVacina().equals(nome)) {
                  dados.getVacinas().remove(i);
                  dados.setQtdVacinas(dados.getQtdVacinas() - 1);
                  return true;
              }
          }

          return false;
      }
     
     /*
      * Teste CRUD Animal/Vacina                                     
      */
     
     
     public static void main(String[] args) {	
 	     ControleDados teste = new ControleDados();  	 
 	     teste.removerVacina(2);
 	     System.out.println(teste.dados.getVacinas()); 	     
 	    // teste.editarVacina(2, "Coronovac", "12/10/2003", "12/10/2024", "New York", "1 lote", 1);
 	     //System.out.println(teste.dados.getVacinas());	
 	}
}
