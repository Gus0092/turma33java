programa
{
	inclua biblioteca Matematica

    funcao inicio()
    {

        real ponto1X, ponto1Y, ponto2X, ponto2Y, d

        escreva("Insira o valor do Ponto 1 no eixo x: ")
        leia (ponto1X)

        escreva("Insira o valor do Ponto 1 no eixo y: ")
        leia (ponto1Y)

        escreva("Insira o valor do Ponto 1 no eixo x: ")
        leia (ponto2X)
       
        escreva("Insira o valor do Ponto 1 no eixo y: ")
        leia (ponto2Y)
        
        d=Matematica.raiz((Matematica.potencia((ponto2X-ponto1X),2))+(Matematica.potencia((ponto2Y-ponto1Y),2)),2)

        escreva("O resultado de D é: "+d)

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