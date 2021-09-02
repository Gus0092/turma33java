package lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double somatorio=0.0, media, total=0.0, n=0.0;

				while (n>=0){
					System.out.printf("Digite o numero a ser somado:");
					n = leia.nextDouble();
					if (n<0){
						break;
					}
					somatorio=somatorio+n;
					total=total+1;
					
				}
				System.out.printf("A somatória dos numeros digitados é de: "+ somatorio);
				media=somatorio/total;
				System.out.printf("\nA média dos valores digitados é de: %.2f", media);
				System.out.printf("\nO total de numeros digitados é de: "+ total);

	}
	

}
