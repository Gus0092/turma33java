/*Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
 * 
 * 
 * 
 */


programa
{
	inclua biblioteca Matematica

    funcao inicio()
    {

        real a, b, c, d, q, f, x, y

        escreva("Insira o valor de 'a': ")
        leia (a)

        escreva("Insira o valor de 'b': ")
        leia (b)

        escreva("Insira o valor de 'c': ")
        leia (c)
       
        escreva("Insira o valor de 'd': ")
        leia (d)

	   escreva("Insira o valor de 'e': ")
        leia (q)

        escreva("Insira o valor de 'f': ")
        leia (f)

	   x=((c*q)-(b*f))/((a*q)-(b*d))

	   y=((a*f)-(c*d))/((a*q)-(b*d))
        
        escreva("O valor de x é: "+ x +"e o valor de 'y' é: "+ y)

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */