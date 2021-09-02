/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;		 ok
 o número de mulheres nervosas;		ok
 o número de homens agressivos;
 o número de outros calmos;    		ok
 o número de pessoas nervosas com mais de 40 anos;		ok
 o número de pessoas calmas com menos de 18 anos. 		ok*/
package lista4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int  x=0, pessoaCalma=0, mulherNervosa=0,  homemAgressivo=0, outroCalmo=0, pessoaNervosa40=0, pessoaCalma18=0, idade=0, sexo=0, temperamento=0;
	
		while ( x<=150) {
			System.out.println("Qual a sua idade?: ");
			idade = leia.nextInt();
			System.out.println("Qual o seu sexo?\n(1-feminino / 2-masculino / 3-Outros)  :");
			sexo = leia.nextInt();
			System.out.println("Qual o seu temperamento?(\n1- calmo\n 2-nervoso \n 3- agressivo\n: )");
			temperamento = leia.nextInt();
			//pessoas calmas
			if (temperamento==1) {
				pessoaCalma++;
				//outros calmas
				if (sexo==3) {
					outroCalmo++;
				}
				if (idade<18) {
					pessoaCalma18++;
				}
			}
				//pessoas nervosa
			if (temperamento==2) {
		
				
				if (sexo==1) {
					mulherNervosa++;
				}
				if (idade>40) {
					pessoaNervosa40++;	
				}
			}
			if (sexo==2 && temperamento==3) {
				homemAgressivo++;
			
							
			}
			x++;
		}
		System.out.printf("\no número de pessoas calmas é:"+pessoaCalma);
		System.out.printf("\no número de mulheres nervosas é:"+mulherNervosa);
		System.out.printf("\no número de homens agressivos:"+homemAgressivo);
		System.out.printf("\no número de outros calmos:"+outroCalmo);
		System.out.printf("\no número de pessoas nervosas com mais de 40 anos é:"+pessoaNervosa40);
		System.out.printf("\no número de pessoas calmas com menos de 18 anos é:"+pessoaCalma18);

	}

}
