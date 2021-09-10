package app;

import java.util.Scanner;

import entities.Conta;
import entities.ContaEmpresa;

public class TesteConta {

	public static void main(String[] args) {
		int tipoConta = 4;
		String nome, cpf="";
		
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Qual tipo de conta voce vai criar?:");

		System.out.print("1 - CONTA POUPANÇA\r\n" + "2 - CONTA CORRENTE\r\n" + "3 - CONTA ESPECIAL\r\n"
				+ "4 - CONTA EMPRESA\r\n" + "5 - CONTA ESTUDANTIL\r\n" + "6 - SAIR:");

		tipoConta = leia.next().toUpperCase().charAt(0);
		System.out.print("Qual seu nome");
		nome = leia.next();
		System.out.print("Qual seu cpf");
		cpf = leia.next();
		//
		Conta c1 = new Conta(123, "asdasd");
		//ContaEstudantil cest1 = new ContaEstudantil(123, cpf, 1000);
		//ContaPoupanca cp1 = new ContaPoupanca(123, cpf, 5);
		//ContaCorrente cc1 = new ContaCorrente(123, cpf, 3);
		// cesp1 = new ContaEspecial(123, cpf, 3, 1000);
		ContaEmpresa cemp1 = new ContaEmpresa(123,cpf);

		char tipo;
		double valor = 0.00;
		char op;
		int dia;
		for (int x = 1; x <= 10; x++) {
			System.out.println("MOVIMENTO " + x);
			System.out.println("SALDO ATUAL R$ :" + c1.getSaldo());
			System.out.print("Movimento D-débito , C-crédito ou X-Outra opção? :");
			tipo = leia.next().toUpperCase().charAt(0);
			if (tipo == 'X') {
				if (tipoConta == '1') {
					cemp1.outraOpcao();
				} else if (tipoConta == '2') {
					cemp1.outraOpcao();
				} else if (tipoConta == '3') {
					cemp1.outraOpcao();
				} else if (tipoConta == '4') {
					cemp1.outraOpcao();
				}
			} else {
				System.out.print("Digite o valor :");
				valor = leia.nextDouble();
				if (tipo == 'D') {
					c1.debito(valor);
				} else if (tipo == 'C') {
					c1.credito(valor);
				} else {

					System.out.println("Não foi informado um tipo correto...");
				}
			}
			System.out.println("Continua S/N : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'N') {

				break;
			}

		}
		System.out.println("SALDO ATUALIZADO R$ " + c1.getSaldo());
		// System.out.println("Informe o dia de hoje :");
		// dia = leia.nextInt();
		// c1.correcao(dia);
		System.out.println("SALDO FINAL R$ " + c1.getSaldo());

	}

}