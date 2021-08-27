programa
{
	
	funcao inicio()
	{
		inteiro pontos[4]
		cadeia times[4] , resultado=""
		escreva ("Começando o Paulistinha!!!\n")

		times[0]="São Paulo"
		times[1]="Santos"
		times[2]="Palmeiras"
		times[3]="Corinthians"

		para (inteiro y=1;y<4;y++){
			escreva("\nRodada de numero ",y,"\n")
			para (inteiro x=0;x<4;x++){
				escreva("\nQual resultado da partida do ", times[x] ,"\nG - Ganhou \nP - Perdeu \nE - Empatou\n: ")
				leia(resultado)
					se (resultado=="G" ou resultado=="g"){
						pontos[x]=pontos[x]+3
					}
					senao se (resultado=="E" ou resultado=="e"){
						pontos[x]=pontos[x]+1
					}
					senao se (resultado=="P" ou resultado=="p"){
						pontos[x]=pontos[x]+0
					}
					senao{
						escreva("Voce digitou errado")
					}
			}	
		}
		
		para (inteiro x=0;x<4;x++){
			escreva("\n", times[x], " : " , pontos[x])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 783; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */