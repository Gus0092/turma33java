/*pedir nome
 * pedir 5 notas
 * calcular média
 * se for acima de 5 é aprovado
 * <5 vai estar em recuperação
 * 
 */

programa
{
	
	funcao inicio()
	{
		cadeia nome, g, g1
		
		real nota, notaTotal = 0.0, media , maiorNota = 0.0 , percNota , notasSuperiores = 0.0
		inteiro x = 1
		const real MEDIA_ESCOLAR=5.0
		
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Qual genero voce se identifica? \nM - Masculino \nF - Feminino\nE - Neutro\n")
		leia(g)
		se (g=="M" ou g=="m"){
			g1="o"
		}
		senao se (g=="f" ou g =="F"){
			g1="a"
		}
		senao {
			g1="u"
		}
		
		para (x; x<=5; x=x+1){
			escreva("Qual sua ",x,"ª nota: ")
			leia (nota)
			notaTotal+= nota
			//verificando maior nota
			se (nota>maiorNota){
				maiorNota=nota
			}
			//contar notas maiores que a média
			se (nota>=MEDIA_ESCOLAR){
				notasSuperiores=notasSuperiores+1
				escreva(notasSuperiores)
			}
			
		}
		percNota= ((notasSuperiores/5)*100.0)
		media = notaTotal / (x-1)
		se (media<MEDIA_ESCOLAR){
			escreva(nome,"\nVoce não foi aprovad",g1,".\n")
			escreva("Faltou ",(MEDIA_ESCOLAR-media)," para voce atingir a média da escola.\n")
			escreva("Voce terá que ter aulas de reforço.\n")
		}
		senao{
			escreva("Voce foi aprovad",g1,".\n")
			escreva("Sua média foi de: ",media," !\n")
			escreva("Parabens ",nome,"!!\n")
		}
			escreva(" --------------------------------------\n")
			escreva("DEMAIS INFORMAÇÕES:\n")
			escreva("Voce teve ",percNota,"% de notas maiores que a média\n")
			escreva("E sua maior nota foi: ",maiorNota)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */