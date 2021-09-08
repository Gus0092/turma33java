package lista5;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int m1[][] = new int[3][3], total = 0, diagonal = 0;
		
		Random aleatorio = new Random();
		
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print("\nDigite o valor da matriz M1 na linha " + x + " e na coluna " + y + "  ");
				int valor = aleatorio.nextInt(9);
				m1[x][y] = valor;
				System.out.print(valor);
				total = total + m1[x][y];
				if (x == y) {				
				
					diagonal = diagonal + m1[x][y];
				}
			}
		}
		System.out.print("\nA somatória total é: "+ total);
		System.out.print("\nA somatória da diagonal principal é de: "+ diagonal);

	}

}
