fun main(args: Array<String>) {

    print("Введите первое значение: ")
    var firstNumber = readLine()!!.toInt()

    print("Введите второе значение: ")
    var secondNumber = readLine()!!.toInt()

    print("Введите операцию: ")
    var operation = readLine()

    print("Результат: ")

    when(operation){
        "+" -> print(firstNumber + secondNumber)
        "-" -> print(firstNumber - secondNumber)
        "*" -> print(firstNumber * secondNumber)
        "/" -> print(firstNumber / secondNumber)
    }
}