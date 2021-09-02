/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 * 
 */
package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas, minutos, segundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva qual tempo de evento da fabrica em segundos: ");
		segundos =leia.nextInt();
		horas=segundos/3600;
		minutos=(segundos%3600)/60;
		segundos=((segundos%3600)%60);
		
		System.out.println("O tempo de duração do evento da fabrica foi de :"+ horas +" horas, " +minutos+ " minutos e " + segundos + " segundos!"); 
		

	}

}
