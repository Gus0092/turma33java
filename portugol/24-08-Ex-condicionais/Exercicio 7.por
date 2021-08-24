/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 * 
 */

programa
{
	
	funcao inicio()
	{
	real a, b, t
	
		escreva("Digite o valor da altura do traingulo retangulo em centímetros(cm): ")
		leia(a)
		escreva("Digite o valor da base do traingulo retangulo em centímetros(cm): ")
		leia(b)
		se (a>0 e b>0){ 
			t=(a*b)/2
			escreva("o valor da area do traingulo retangulo é de: ", t , "cm²")
		}
		senao
			escreva("Voce inseriu um numero ou caractere inválido")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */