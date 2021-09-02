/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
package lista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = 0, pares = 0, impares = 0;

		for (int x = 0; x < 10; x++) {
			do {
				System.out.printf("Digite o %dº numero inteiro positivo a ser Verificado:", (x + 1));
				n = leia.nextInt();
				if (n<=0) {
					System.out.printf("Numero invalido\n1");
				}
			}while(n<=0);
			if (n % 2 == 0) {
				pares++;
			}
			else  {
				impares++;
			}
		}
		System.out.printf("Voce digitou %d numeros pares e %d numeros impares. ", pares, impares);
	}

}
