programa
{
	
	funcao inicio()
	{
		inteiro ve
		cadeia nome, genero
		
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Qual genero voce se identifica? digite m para masculino e f para feminino.")
		leia(genero)

		ve=600
		se (genero== "f" ou genero=="F"){
			escreva(nome," seu auxilio emergencia sera de: ", (ve*2), " pois voce é a chefa de familia")
		}
		senao se (genero=="m" ou genero=="M"){
			escreva(nome," seu auxilio emergencia sera de: ", ve)
		}
		senao 
			escreva(nome," digite apenas m ou f!")
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */