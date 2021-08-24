/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 */
programa
{
	
	funcao inicio()
	{
	 inteiro numero
	 
	 escreva("Digite um número inteiro: ")
	 leia(numero)
		se(numero <0){
			se(numero % 2 == (-1)){
 			escreva("O número ", numero, " é Impar e Negativo")
			}
			senao{
			escreva("O número ",numero, " é Par e Negativo")
			}
		}
		senao se (numero ==0){
			escreva("O número é Zero.")
		}
		senao {
			se(numero % 2 == 1){
 			escreva("O número ", numero, " é impar e Positivo")
			}
			senao{
			escreva("O número ",numero, " é Par e Positivo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */