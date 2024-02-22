//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  //Exercise 1
  val currentSalary = 1000.0
  val newSalary: Double = increaseSalary(currentSalary)
  println("The salary has increased from $currentSalary to $newSalary")

  //Exercise 2
  val stepHeight = 0.20
  val targetHeight = 10.0
  val totalSteps = calculateSteps(stepHeight, targetHeight)
  println("For the person to climb $targetHeight meters knowing that the height" +
      "of the step is $stepHeight meters, he needs to climb $totalSteps steps")
}

//Exercício 1
//Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
// calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
fun increaseSalary(salary: Double): Double {
  return salary * 1.25
}

//Exercício 2
//Cada degrau de uma escada tem X de altura.
// Escreva um programa usando Kotlin que receba essa altura e a altura que uma pessoa
// deseja alcançar usando a escada, calcule e mostre quantos degraus ela deverá subir
// para atingir seu objetivo, sem se preocupar com a altura da pessoa. Todas as medidas
// fornecidas devem estar em metros.
fun calculateSteps(stepHeight: Double, targetHeight: Double): Double {
  return targetHeight / stepHeight
}

//Exercício 3
//Escrevas um programa em Kotlin que receba dois números e mostre o maior.


//Exercício 4
//Escrevas um programa em Kotlin que receba três notas de uma pessoa estudante e mostre
// a média aritmética e a mensagem conforme as regras a seguir:
//Média aritmética igual ou maior que 0.0 e menor do que 3.0, exibir a mensagem REPROVADO
//Média aritmética igual ou maior que 3.0 e menor do que 7.0, exibir a mensagem EXAME
//Média aritmética igual ou maior que 7.0 e menor do que 10.0, exibir a mensagem APROVADO

