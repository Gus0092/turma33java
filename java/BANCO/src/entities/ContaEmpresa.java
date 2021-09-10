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
	
	public void outraOpcao() {
		
		char resposta =' ';
		double valor;
		System.out.println("Voce deseja pedir um emprestimo empresarial? S/N?");
		resposta = leia.next().toUpperCase().charAt(0);
		if (resposta=='S') {
			System.out.println("Qual valor?");
			valor = leia.nextDouble();
			pedirEmprestimo(valor);
		}
		
	}
	// methods
	public void pedirEmprestimo(double emprestimo) {
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
