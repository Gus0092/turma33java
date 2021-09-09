/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, defina as instancias
 *  deste objeto e apresen
 *  te as informações deste objeto no console.
 * 
 */

package lista1.poo;

import lista1.Classes.ProdutoEletronico;

public class Exercicio3 {

	public static void main(String[] args) {
		
		ProdutoEletronico v3 = new ProdutoEletronico();
		
		v3.marca="motorola";
		v3.tipo="celular";
		v3.ligarCelular();
		v3.carregarCelular(40);
		System.out.println(v3.cargaBateria);
		v3.usarCelular(20);
		System.out.println(v3.cargaBateria);
		v3.desligarCelular();
		
	}

}
