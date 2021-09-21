package entities;

import java.util.Scanner;

public class ContaEmpresa extends Conta {
	Scanner leia = new Scanner(System.in);
	// attribute
	private double emprestimoEmpresa = 0;

	// constructor
	public ContaEmpresa(int numero, String cpf) {
		super(numero, cpf);

	}

	// encapsulation
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}
	@Override
	public void outraOpcao() {

		pedirEmprestimo();

	}
	// methods

	@Override
	public void debito(double valor) {

		if (valor == 0) {
			System.out.println("Debito vazio, impossivel realizar...");
		} else if (valor < 0) {
			System.out.println("Valor informado negativo, impossivel realizar...");
		} else if (valor > this.saldo) {
			System.out.println("Saldo insulficiente, impossivel realizar...");
			pedirEmprestimo();
		} else {
			saldo -= valor;
		}
	}

	public void pedirEmprestimo() {
		System.out.println("Deseja fazer um empréstimo? S/N");
		char fEmpretimo = leia.next().toUpperCase().charAt(0);
		if (fEmpretimo == 'S') {
			System.out.println("Qual valor?");
			double emprestimo = leia.nextDouble();
			if ((emprestimo + this.emprestimoEmpresa) <= 10000) {
				super.credito(emprestimo);
				this.emprestimoEmpresa += emprestimo;
				System.out.println("Saldo atual emprestimo R$ " + this.emprestimoEmpresa);
				System.out.println("Saldo disponivel para empréstimo R$ " + (10000 - this.emprestimoEmpresa));
			} else {

				System.out.println("Valor não disponivel para emprestimo R$ " + (10000 - this.emprestimoEmpresa));
			}
		}
	}
}
