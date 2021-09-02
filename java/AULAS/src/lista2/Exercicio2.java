//2- Faça um programa que entre com três números e coloque em ordem crescente.
package lista2;

import java.util.Scanner;

public class Exercicio2 {

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
				if (a < b && a < c) {
					if (b < c) {
						System.out.println("Os numeros em ordem crescente são:"+a+", "+b+", "+c);
					}
					else {
						System.out.println("Os numeros em ordem crescente são:"+a+", "+c+", "+b);
					}
					
				}
				else if (b < c) {
					if (a < c) {
						System.out.println("Os numeros em ordem crescente são:"+b+", "+a+", "+c);
					}
					else {
						System.out.println("Os numeros em ordem crescente são:"+b+", "+c+", "+a);
					}
				}
				else  {
					if (a < b) {
						System.out.println("Os numeros em ordem crescente são:"+c+", "+a+", "+b);
					}
					else {
						System.out.println("Os numeros em ordem crescente são:"+c+", "+b+", "+a);
					}
				}

	}

}
