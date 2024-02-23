import java.text.DecimalFormat

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  // Exercise 1
  increaseSalary(1000.0)

  // Exercise 2
  calculateSteps(0.20, 10.0)

  // Exercise 3
  biggestNumber(5, 10)
  biggestNumber(10, 5)

  // Exercise 4
  evaluateGrades(1.1, 2.2, 3.3)
  evaluateGrades(5.2, 6.3, 7.4)
  evaluateGrades(6.5, 7.6, 8.7)
}

//Exercício 1
//Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
// calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
fun increaseSalary(salary: Double): Double {
  val newSalary: Double = salary * 1.25

  println("The salary has increased from $salary to $newSalary.")

  return newSalary
}

//Exercício 2
//Cada degrau de uma escada tem X de altura.
// Escreva um programa usando Kotlin que receba essa altura e a altura que uma pessoa
// deseja alcançar usando a escada, calcule e mostre quantos degraus ela deverá subir
// para atingir seu objetivo, sem se preocupar com a altura da pessoa. Todas as medidas
// fornecidas devem estar em metros.
fun calculateSteps(stepHeight: Double, targetHeight: Double): Double {
  val totalSteps: Double = targetHeight / stepHeight

  println("For the person to climb $targetHeight meters knowing that the height" +
      "of the step is $stepHeight meters, he needs to climb $totalSteps" +
      "steps.")

  return totalSteps
}

//Exercício 3
//Escrevas um programa em Kotlin que receba dois números e mostre o maior.
fun biggestNumber(num1: Int, num2: Int): Int {
  val biggest: Int = if (num1 > num2) num1 else num2

  println("The biggest number between $num1 and $num2 is $biggest.")

  return biggest
}

//Exercício 4
//Escrevas um programa em Kotlin que receba três notas de uma pessoa estudante e mostre
// a média aritmética e a mensagem conforme as regras a seguir:
//Média aritmética igual ou maior que 0.0 e menor do que 3.0, exibir a mensagem REPROVADO
//Média aritmética igual ou maior que 3.0 e menor do que 7.0, exibir a mensagem EXAME
//Média aritmética igual ou maior que 7.0 e menor do que 10.0, exibir a mensagem APROVADO
fun evaluateGrades(grade1: Double, grade2: Double, grade3: Double): String {
  val average: Double = (grade1 + grade2 + grade3) / 3
  val df = DecimalFormat("#.##")

  if (average < 3) {
    println("The average grade is ${df.format(average)}. REPROVADO.")
    return "REPROVADO"
  } else if (average >= 3 && average < 7) {
    println("The average grade is ${df.format(average)}. EXAME.")
    return "EXAME"
  } else {
    println("The average grade is ${df.format(average)}. APROVADO.")
    return "APROVADO"
  }
}