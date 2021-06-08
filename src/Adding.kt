fun main() {
/*This program accepts two integer inputs and
find the sum, difference, division, multiplication
and module of the two numbers and also displays
the answers.
 */
    //Variable deceleration
    var Num1: Int = 0
    var Num2: Int = 0
    var Sum: Int
    var DIff:Int
    var Mult:Int
    var Div:Int
    var Modu:Int

    //Input
    println("Enter the value of the First Number")
    Num1 = readLine()!!.toInt()
    println("Enter the value of your Second Number")
    Num2 = readLine()!!.toInt()

    //Processing
    Sum = Num1 + Num2
    Div = Num1 / Num2
    Mult = Num1 * Num2
    DIff = Num1 - Num2
    Modu = Num1 % Num2

    //Output
    println("The Sum of $Num1 and $Num2 is: $Sum")
    println("The DIfferene between $Num1 and $Num2 is: $DIff")
    println("$Num1 Multiplied by $Num2 is: $Mult")
    println("$Num1 Divided by $Num2 is: $Div")
    println("The Remainder when $Num1 is Divided by $Num2 is: $Modu")
}