/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 * 
 */
package lista1.Classes;

public class Cliente {
	
	public String nome;
	public boolean ativo=false;
	
	public void ativarCliente() {
		System.out.println("O cadastro do cliente foi ativado!");
		ativo=true;
	}
	public void desativarCliente() {
		System.out.println("O cadastro do cliente foi desativado!");
		ativo=false;
	}
	public void ativoCliente() {
		if(ativo) {
			System.out.println("Cliente: "+nome+"\nSitua��o: ativo");
		}
		else {
			System.out.println("Cliente: "+nome+"\nSitua��o: desativo");
		}
	}

}
