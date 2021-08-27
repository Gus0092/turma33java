/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 * 
 */
programa
{
	
	funcao inicio()
	{	
		
		real pontos[5], maior=0.0
		escreva("-Verificando a maior nota-")
		para ( inteiro x=0; x<5; x++){
			escreva("\nDigite o valor da ",(x+1),"ª nota: ")
			leia (pontos[x])
		}
		escreva("\nPontuação é: ")
		para ( inteiro x=0; x<5; x++){
			escreva(" ",pontos[x],",")
		}
		para ( inteiro x=0; x<5; x++){
			se (maior<pontos[x]){
				maior=pontos[x]
			}			
		}
		escreva("\nA maior nota é :",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 501; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 11, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */