programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		cadeia nome
		real temperaturaCelsius
		real temperaturaFarenheit

		escreva("Escreva seu nome: ")
		leia (nome)
		escreva("Escreva a Temperatura em fahrenheit: ")
		leia (temperaturaFarenheit)
		temperaturaCelsius=(((temperaturaFarenheit-32)*5)/9)
		escreva ("BOM DIA "+ nome+", a temperatura em Celsius é"+temperaturaCelsius)

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */