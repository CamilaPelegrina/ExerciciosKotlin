package br.digital.com.aulakotlinsemobj

fun main(){
    println("Hello World!")
    println(meuNome("Nome", "Sobrenome"))
    println(maiorDeTres(2,8,7))
    println(ehDiferente("cidade", "estado"))
    println(ehPar(7))
    println(impares())
    println(positivos())
}

//Exemplo Função
fun meuNome(nome: String, sobrenome: String) :String{
    return nome + " " + sobrenome
}

//Questão 1
fun maiorDeTres(num1: Int, num2: Int, num3: Int) :Int{
    return maxOf(num1, num2, num3)
}

//Questão 2
fun ehDiferente(texto1: String, texto2: String) :Boolean{
    return texto1 != texto2
}

//Questão 3
fun ehPar(num: Int) :Boolean{
    return num % 2 == 0
}

//Questão 4
fun impares() {
    for (x in 1..100 step 2) {
        print("$x, ")
    }
}

//Questão 5


//Questão 6
fun positivos() {
    for (x in 1..100) {
        print("$x, ")
    }
}
