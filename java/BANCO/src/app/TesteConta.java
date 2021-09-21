package app;

import java.util.Scanner;

import entities.Conta;
import entities.ContaEmpresa;

public class TesteConta {

	public static void main(String[] args) {
		int tipoConta = 4;
		String nome, cpf="";
		
		
		Scanner leia = new Scanner(System.in);

		System.out.print("Qual seu nome");
		nome = leia.next();
		System.out.print("Qual seu cpf");
		cpf = leia.next();
		//
		
		//ContaEstudantil cest1 = new ContaEstudantil(123, cpf, 1000);
		//ContaPoupanca cp1 = new ContaPoupanca(123, cpf, 5);
		//ContaCorrente cc1 = new ContaCorrente(123, cpf, 3);
		// cesp1 = new ContaEspecial(123, cpf, 3, 1000);
		ContaEmpresa cemp1 = new ContaEmpresa(123,cpf);
		cemp1.credito(100);
		System.out.println(cemp1.getSaldo());
		cemp1.debito(200);
		System.out.println(cemp1.getSaldo());


	}

}