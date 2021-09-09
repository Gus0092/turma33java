package app;

import entities.Conta;
import entities.ContaEmpresa;

public class TesteConta {

	public static void main(String[] args) {
		
	
		
		ContaEmpresa cemp1 = new ContaEmpresa(14,"123.456.789-55",1000.10);
		
		
		/*
		ContaPoupanca cp1 = new ContaPoupanca();
		ContaCorrente cc1
		ContaEspecial cesp1 
		ContaEmpresa  cemp1
		
		
		*/
		
		
		
		cemp1.credito(50.25);
		System.out.println(cemp1.toString());
		cemp1.debito(-1);
		System.out.println(cemp1.toString());
		
		
		
		
		
		

	}

}