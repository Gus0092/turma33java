/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é:
*/
package lista1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double ponto1X, ponto1Y, ponto2X, ponto2Y, d;
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Insira o valor do Ponto 1 no eixo x: ");
        ponto1X = leia.nextDouble();

        System.out.println("Insira o valor do Ponto 1 no eixo y: ");
        ponto1Y = leia.nextDouble();

        System.out.println("Insira o valor do Ponto 1 no eixo x: ");
        ponto2X = leia.nextDouble();
       
        System.out.println("Insira o valor do Ponto 1 no eixo y: ");
        ponto2Y = leia.nextDouble();
        
        d=Math.sqrt((Math.pow((ponto2X-ponto1X),2))+(Math.pow((ponto2Y-ponto1Y),2)));

        System.out.println("O resultado de D é: "+d);
	}

}
