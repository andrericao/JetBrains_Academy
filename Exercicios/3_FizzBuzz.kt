/* ENUNCIADO!!

Fizz Buzz é um problema clássico de programação. Aqui está a sua versão ligeiramente modificada.

Escreva um programa que receba a entrada de dois inteiros: o início e o fim do intervalo (ambos os números pertencem ao intervalo).

O programa deve produzir os números desse intervalo, mas se o número for divisível por 3, você deve produzir Fizz em vez dele; se o número for divisível por 5, produza Buzz, e se for divisível por 3 e por 5, produza FizzBuzz.

Emita cada número ou palavra em uma linha separada.

Exemplo de Entrada 1:
8
16

Saída de Amostra 1:
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16*/

fun main() {
  val numInicio = readln().toInt()
  val numFim = readln().toInt()
  for (i in numInicio..numFim) {
    println(
        if (i % 3 == 0 && i % 5 == 0) {
          "FizzBuzz"
          /*OBS1: aqui eu digo que se o número ("i") for divisível por 3 e por 5 no lugar dele deve ser impresso  palavra "FizzBuzz"
          OBS2: coloquei essa condição primeiro, pois, caso contrário o código acabaria com o número ("i") sendo divisível tanto por 3 quanto por 5*/
        } else if (i % 3 == 0) {
          "Fizz"
        } else if (i % 5 == 0) {
          "Buzz"
        } else {
          i
          /*a final da condicional "else" determina que se o número não for divisível por nenhum número que eu determinei ele deve aprensentar o valor do "i" propriamente*/
        }
    )
  }
}
