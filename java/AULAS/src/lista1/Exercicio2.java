//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.
package lista1;
import java.util.Scanner;


public class Exercicio2 {
	

 	
	public static void main(String[] args) {
		
	 	int anos = 0;
	    int meses = 0;
	 	int dias = 0;
	 	int diasIdade = 0;
		System.out.println("Escreva sua idade em dias: ");
    	Scanner mySc = new Scanner(System.in);
    	diasIdade = mySc.nextInt();
		
		anos = diasIdade/365;
		meses=((diasIdade-(anos*365))/30);				
		dias=((diasIdade%365)%30);
		
		
		System.out.println("Então voce tem "+ anos +" anos, " +meses+ " meses e " + dias + " dias de idade!");


	}
		

}
