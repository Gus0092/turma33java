/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 * 
 */
package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		// Entradas
		double resultado, numero;
		System.out.println("Digite um numero inteiro positivo");
		numero = leia.nextDouble();
		//processamento
		if (numero < 0) {
			System.out.println("Numero negativo");
		}
		else if (numero == 0) {
			System.out.println("Numero neutro");
		}
		else if (numero % 2 == 0) {
			System.out.println("Numero Par");
			resultado=Math.sqrt(numero);
			System.out.printf("A raiz quadrada do numero é: %.2f",resultado);
		}
		else {
			System.out.println("numero Impar");
			resultado=Math.pow((numero),2);
			System.out.println(numero+" elevado ao quadrado é igual a: "+resultado);
		}
	}
	
	
}
