/*1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 * 
 */

package lista3;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 233;

		do {
			System.out.printf("," + x);
			if (x >= 300 && x <= 400) {
				x = x + 3;
			} else {
				x = x + 5;
			}

		} while (x < 456);
	}

}
