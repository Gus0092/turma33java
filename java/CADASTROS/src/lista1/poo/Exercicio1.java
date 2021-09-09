/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 * 
 */
package lista1.poo;

import lista1.Classes.Cliente;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente jose = new Cliente();
		
		jose.nome = "Jose da silva santos";
		jose.ativarCliente();
		jose.ativoCliente();
		jose.desativarCliente();
		jose.ativoCliente();

	}

}
