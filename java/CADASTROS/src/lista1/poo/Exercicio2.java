/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
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
