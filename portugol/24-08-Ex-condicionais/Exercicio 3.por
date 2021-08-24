/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 * 
 */
programa
{
	
	funcao inicio()
	{
	real n1, n2, n3, n4, q1, q2, q3, q4
		escreva("Digite o primeiro numero: ")
		leia(n1)
		escreva("Digite o segundo numero: ")
		leia(n2)
		escreva("Digite o terceiro numero: ")
		leia(n3)
		escreva("Digite o quarto numero: ")
		leia(n4)
		
	q1 = n1*n1
	q2 = n2*n2
	q3 = n3*n3
	q4 = n4*n4
	
		se (q3>=1000){
			escreva("O valor do quadrado de ", n3 ," é de: ",q3) 
		}
		senao {
			escreva("O valor do quadrado de ", n1 ," é de: ",q1)
			escreva("\nO valor do quadrado de ", n2 ," é de: ",q2)
			escreva("\nO valor do quadrado de ", n3 ," é de: ",q3)
			escreva("\nO valor do quadrado de ", n4 ," é de: ",q4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 906; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */