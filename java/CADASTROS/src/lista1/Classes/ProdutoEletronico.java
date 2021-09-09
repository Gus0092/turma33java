package lista1.Classes;

public class ProdutoEletronico {
	
	public String tipo, marca;
	public double cor, cargaBateria;
	public boolean ligado;
	
	public void ligarCelular() {
		System.out.println("O Aparelho foi ligado!");
		ligado = true;
	}

	public void desligarCelular() {		
		System.out.println("O Aparelho foi desligado!");
		ligado = false;
			
	}

	public void carregarCelular(double x) {
		System.out.println("O Celular carregou " + x*2 + " %");
		this.cargaBateria += (x*2);
	}

	public void usarCelular(double x) {
		if ((cargaBateria-x) > 0) {
			System.out.println("O Celular descarregou " + x + " metros");
			this.cargaBateria -= (x/2);
		}
		else {
			System.out.println("Celular sem bateria");
		}
	}


	

	
	

}
