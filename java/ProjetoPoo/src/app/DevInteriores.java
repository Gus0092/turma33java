package app;

import entities.Produto;

public class DevInteriores {

	public static void main(String[] args) {


		Produto cadeiraGamer = new Produto("G5-1","Cadeira Gamer", 100.5);
		
		System.out.println(cadeiraGamer.toString());
		cadeiraGamer.acrescentaCarrinho(2);
		cadeiraGamer.tiraEstoque(5);
		System.out.println(cadeiraGamer.toString());
		
		System.out.println(cadeiraGamer.retornaCarrinho());
		
		
		
		
		
	}

}
