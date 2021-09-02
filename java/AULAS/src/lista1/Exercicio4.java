/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:
d=(r*s)/2
r=(a+b)²
s=(b+c)²
 * 
 */
package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c ,r , s , d;
		Scanner leia = new Scanner (System.in);
		System.out.println("Escreva um numero A inteiro positivo: ");
		a = leia.nextInt();
		System.out.println("Escreva um numero B inteiro positivo: ");
		b = leia.nextInt();
		System.out.println("Escreva um numero C inteiro positivo: ");
		c = leia.nextInt();		
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d=((r+s)/2);
		System.out.println("D=" + d);
	}

}
