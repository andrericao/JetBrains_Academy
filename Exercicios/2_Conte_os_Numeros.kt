/* ENUNCIADO!

Escreva um programa que leia a, b e n e gere quantos números no intervalo inclusivo de a a b (a < b) são divisíveis por n .

Nota: você pode escrever este programa de forma mais eficiente, ou seja, sem nenhum loop. Pense nisso depois de escrever a solução com um loop.

Exemplo de Entrada 1:
10
20
10

Saída de Amostra 1:
2

Exemplo de Entrada 2:
-10
10
5

Saída de Amostra 2:
5
*/

fun main() {
  val a = readln().toInt()
  val b = readln().toInt()
  val n = readln().toInt()
  var times = 0
  for (i in a..b) {
    if (i % n == 0) ++times
  }
  print(times)
}
