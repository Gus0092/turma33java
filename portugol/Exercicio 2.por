programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias

		escreva("Escreva quantos dias de idade voce tem: ")
		leia (dias)
		anos=dias/365
		meses=(dias%365)/30
		dias=((dias%365)%30)
		
		escreva ("Então voce tem "+ anos +" anos, " +meses+ " meses e " + dias + " dias de idade!")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */