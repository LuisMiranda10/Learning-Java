package program;

import models.*;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dono dono = new Dono();
		Mamifero mamifero = new Mamifero();
		Vacina vacina = new Vacina();
		Ave ave = new Ave();
		Vacina vacina1[] = new Vacina[] {null};
		vacina1[0] = new Vacina(1, "Astrazenica", null, "13/12/2022", null, null , 1); 
		CartaoVacina cartaoVacina = new CartaoVacina(null, null, null, null, 1, vacina1);
		
		System.out.println(dono);
		System.out.println(mamifero);
		System.out.println(ave);
		System.out.println(vacina);
		System.out.println(cartaoVacina);
	
		dono.setNome("Bruno");
		dono.setIdade(20);
		dono.setGenero("masculino");
		dono.setEndereco("Terceira avenida, Nucleo Bandeirante, casa F");
		dono.setTelefone("(61) 99976-4960");
		
		mamifero.setNome("Zezin");
		mamifero.setEspecie("Canina");
		mamifero.setIdade(25);
		mamifero.setRaca("Pinscher");
		mamifero.setPeso(6.5);
		mamifero.setGenero("Masculino");
		mamifero.setAltura(20.6);
		mamifero.setCastrado(false);
		
		ave.setNome("Avezinha");
		ave.setEspecie("ave");
		ave.setIdade(8);
		ave.setRaca("calopsita");
		ave.setPeso(7);
		ave.setGenero("Feminino");
		ave.setAltura(30);
		ave.setAsaCortada(false);
		
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
		System.out.println(mamifero);
		System.out.println(ave);
		System.out.println(vacina);
		System.out.println(cartaoVacina);

	}
}
