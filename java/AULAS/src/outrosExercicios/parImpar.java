package outrosExercicios;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		// Entradas
		int numero;
		
		System.out.println("Digite um numero inteiro positivo");
		numero = leia.nextInt();
		//processamento
		if (numero < 0) {
			System.out.println("Numero negativo");
		}
		else if (numero == 0) {
			System.out.println("Numero neutro");
		}
		else if (numero % 2 == 0) {
			System.out.println("Numero Par");
		}
		else {
			System.out.println("numero Impar");
		}
		//saida

	}

}
