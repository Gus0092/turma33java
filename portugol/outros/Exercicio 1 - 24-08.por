programa
{
	
	funcao inicio()
	{
	//Ler número e retornar se é par ou impar
	 inteiro numero
	 
	 escreva("Digite um número inteiro positivo: ")
	 leia(numero)
		se(numero <0){
			escreva("O número é Negativo.")
		}
		senao se (numero ==0){
			escreva("O número é Zero.")
		}
 		senao se(numero % 2 == 1){
 		escreva("O número ", numero, " é Impar.")
		}
		senao{
		escreva("O número ",numero, " é Par.")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */