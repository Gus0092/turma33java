// Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
// e mostre-a expressa apenas em dias.

package lista1;
import java.util.Scanner;

public class Exercicio1 {
		// Variáveis
	 	static int years = 0;
	 	static int months = 0;
	 	static int days = 0;
	 	static int meses = 0;

	public static void main(String[] args) {
		//Inicializadores
    	getYears();
    	getMonth();
    	getDays();
    	toGreat();
	}
		//Entrada de dados
		
	    public static void getYears() {
	    	System.out.println("Escreva sua idade em anos: ");
	    	Scanner mySc = new Scanner(System.in);
	    	years = mySc.nextInt();
	    }
	    public static void getMonth() {
	    	System.out.println("Escreva os meses: ");
	    	Scanner mySc = new Scanner(System.in);
	    	months = mySc.nextInt();
	    }
	    
	    public static void getDays() {
	    	System.out.println("Escreva em dias: ");
	    	Scanner mySc = new Scanner(System.in);
	    	days = mySc.nextInt();
	    }
	    
    public static void toGreat() {
    	days = (days+(years*365)+(months*30));
    	System.out.println(String.format("Sua idade em dias é "+days));
    }

	

}
