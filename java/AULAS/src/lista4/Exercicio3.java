/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
package lista4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int mais50 = 0, menos21=0, idade = 0;

		while (idade != (-99)) {
			do {
				System.out.printf("\nDigite a sua idade ou -99 para finalizar:");
				idade = leia.nextInt();
				if (idade<0 && idade != (-99)) {
					System.out.printf("\nDigite Um numero inteiro positivo, ou -99 para finalizar");
				}
			} while (idade <= 0 && idade != (-99));

			
			if (idade < 21 && idade != (-99)) {
				menos21++;
			}
			else if (idade > 50) {
				mais50++;
			}
		}
		System.out.printf("\nTotal de pessoas com mais de 50 anos é de: " + mais50);
		System.out.printf("\nTotal de pessoas com menos de 21 anos é de: "+ menos21);

	}

}
