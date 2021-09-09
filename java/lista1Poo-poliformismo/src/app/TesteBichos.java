package app;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class TesteBichos {

	public static void main(String[] args) {

		Cachorro dogao = new Cachorro("CARAMELO", 5);
		Cavalo pangare = new Cavalo("PÉ-DE-PANO", 8);
		Preguica sono = new Preguica("THE FLASH", 6);
		
		System.out.println(pangare.toString());
		pangare.emitirSom();
		System.out.println(dogao.toString());
		dogao.emitirSom();
		System.out.println(sono.toString());
		sono.emitirSom();



	}

}
