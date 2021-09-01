package lista1;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		String nome;
		
		System.out.println("Nome do usuario :");
		nome = leia.next();
		System.out.print("Leia o valor de a ");
		a = leia.nextDouble();
		System.out.print("Leia o valor de b ");
		b = leia.nextDouble();
		System.out.print("Leia o valor de c ");
		c = leia.nextDouble();
		System.out.print("Leia o valor de d ");
		d = leia.nextDouble(); 
		System.out.print("Leia o valor de e ");
		e = leia.nextDouble();
		System.out.print("Leia o valor de f ");
		f = leia.nextDouble();
		x = ((c*e)-(b*f)) / ((a*e) - (b*d));
		y = ((a*f)-(c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de x="+x+" e o de y="+y);
		System.out.printf("\n%s valor de x=%.2f e o de y=%.3f",nome,x,y);

	}

}
		/*Scanner leia = new Scanner(System.in)
		//%s - String - texto
		// %d - int - numero inteiro
		// %f [%.2f] - double - numero real
		//caractere = %c char
		//logico = boolean %b
		 */


