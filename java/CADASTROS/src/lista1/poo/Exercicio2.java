/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 * 
 */
package lista1.poo;

import lista1.Classes.Aviao;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Aviao dodo = new Aviao();
		dodo.modelo="Asalonga";
		dodo.ligarAviao();
		dodo.subir(10);
		dodo.estadoAviao();
		dodo.descer(5);
		dodo.descer(5);
		dodo.desligarAviao();
		dodo.estadoAviao();
		

	}

}
