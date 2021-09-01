package lista2;
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		// Entradas
		int a, b, c;
		
		System.out.println("Digite um numero inteiro positivo");
		a = leia.nextInt();
		
		System.out.println("Digite outro numero inteiro positivo");
		b = leia.nextInt();
		
		System.out.println("Digite outro numero inteiro positivo");
		c = leia.nextInt();
		
		//processamento
		if (a > b && a > c) {
			System.out.println("O Maior é o numero:"+a);
		}
		else if (b > c) {
			System.out.println("O Maior é o numero:"+b);
		}
		else  {
			System.out.println("O Maior é o numero:"+c);
		}

		//saida
	}

}
