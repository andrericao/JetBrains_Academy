/* ENUNCIADO!
Você tem uma sequência de números naturais que não excede 30.000. Encontre o elemento máximo na sequência divisível por 4. Como entrada, o programa primeiro obtém o número de elementos na sequência e depois os próprios elementos. Uma sequência sempre tem um elemento divisível por 4. O número de elementos não excede 1000. O programa deve imprimir um único número — o elemento de sequência máximo (número) divisível por 4. 

Exemplo de Entrada:

6 
24 
12 
47 
36 
16 
46

Exemplo de Saída:

36*/

const val FOUR = 4
/*declarei o numero "4" como contante para que, por motivo de boa prática, 
não seja considerado um número mágico.*/
fun main() {
    val n = readln().toInt()
    /*"n" é a quantidade de vezes que será inserido um número
    no bloco de código "repeat", logo abaixo, através da variável "number"*/
    var div = 0
    /*"div" é a variável que armazenará o maior número diviśivel por 4.
    *ficou fora do bloco repeat para que pudesse ser impresso pelo "print", UMA VEZ, no final deste código*/    
    repeat(n) {
        val number = readln().toInt()
        /*"number é a varial no qual será receberá o input dadas as vezes
         determinada na variavel "n"*/
        if (number % FOUR == 0 && number > div) {
            div = number
            /*a condição "if" determina que se o número "inputado"(number) tiver o módulo/resto = 0(zero)
             e se o mesmo (número inputado "number") for maior que a variável "div" "div" atribuirá valor
              igual a "number".
             
             *Assim este valor ficar "armazenado" em "div" 
             até que "number" receba um novo input para que seja analisado pela condição "if" */
        }
    }
    print(div)
    /*"print" ficou fora do bloco "repeat" para que gerasse apenas um output*/
}