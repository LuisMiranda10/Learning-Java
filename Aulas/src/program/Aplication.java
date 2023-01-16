package program;

import models.*;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dono dono = new Dono();
		Cachorro cachorro = new Cachorro();
		Coelho coelho = new Coelho();
		Vacina vacina = new Vacina();
		Gato gato = new Gato();
		Vacina vacina1[] = new Vacina[] {null};
		vacina1[0] = new Vacina(1, "Astrazenica", null, "13/12/2022", null, null , 1); 
		CartaoVacina cartaoVacina = new CartaoVacina(null, null, null, null, 1, vacina1);
		
		System.out.println(dono);
		System.out.println(cachorro);
		System.out.println(gato);
		System.out.println(coelho);
		System.out.println(vacina);
		System.out.println(cartaoVacina);
	
		dono.setNome("Bruno");
		dono.setIdade(20);
		
		cachorro.setNome("Zezin");
		cachorro.setEspecie("Canina");
		cachorro.setIdade(25);
		cachorro.setRaca("Pinscher");
		cachorro.setGenero("Masculino");
		cachorro.setAltura("Alto");
		cachorro.setCastrado(false);
		
		gato.setNome("Miazinha");
		gato.setEspecie("felina");
		gato.setIdade(8);
		gato.setRaca("gato-de-bengala");
		gato.setGenero("Feminino");
		gato.setAltura("Baixo");
		gato.setPelagem("curta");
		
		coelho.setNome("Coelhito");
		coelho.setEspecie("Leoporideos");
		coelho.setIdade(8);
		coelho.setRaca("coelhin-da-Pascóa");
		coelho.setGenero("Feminino");
		coelho.setAltura("Medio");
		coelho.setSituacaoDosDentes("otima");
		
		vacina.setTipoVacina("Astrazenica");
		vacina.setDataVacina("09/12/2022");
		vacina.setDataDose("13/12/2002");
		vacina.setDoses(3);
		vacina.setLocal("Nucleo bandeirante");
		vacina.setLote("3 lote");
		
		cartaoVacina.setNomeDono("Bruno");
		cartaoVacina.setNomeAnimal("Zezin/Avezinha");
		cartaoVacina.setRaca("Pinscher/Calopsita");
		cartaoVacina.setEspecie("Canina/Ave");
		cartaoVacina.setVacina(vacina1);
		
		System.out.println(dono);
		System.out.println(cachorro);
		System.out.println(gato);
		System.out.println(coelho);
		System.out.println(vacina);
		System.out.println(cartaoVacina);

	}
}
