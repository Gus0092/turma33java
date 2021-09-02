/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 * 
 */
package lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double custo, preco, imposto, distribuidor;
		
		Scanner leia = new Scanner (System.in);
		

		imposto = 0.45;
		distribuidor = 0.28;
		System.out.println("Qual o preço do carro:");
		custo = leia.nextDouble();

		preco = custo * (1 + imposto + distribuidor);
		System.out.println("O preço do carro sera de: " + preco);	
	}

}
