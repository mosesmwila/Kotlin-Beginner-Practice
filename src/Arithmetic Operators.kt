/******  fun main(args : Array<String>) {
    val number1 = 12.5
    val number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")
}
*****/


/***** fun main(args : Array<String>){
 /*****   val start = "talk is cheap. "
    val middle ="show me the code. "
    val end = "- Linus Torvalds"

    val result = start + middle + end

    println("$result") **/
 var number = 12

    number *= 6 // number = number*5
    println("number  = $number")
}
*******/

// Comparison and Equality Operators

/**** fun main(args : Array<String>){
   /**** var a = 12
    var b = -12
    // use of greater than operator
    val max = if (a > b) {
        println("a is larger than b.")
        a
    }
    else {
        println("b is larger than a")
        b
    }
    println("max = $max") ****/
    val a = 10
    val b = 9
    val c = -1

    val result : Boolean
    // result is true is a is largest
    result = (a>b) && (a>c)
    println("$result")

}
        ***/
// Example: in Operator

fun main(args : Array<String>){
   /*** val numbers = intArrayOf(1, 4, -40, 5)

    if (4 in numbers){
        println("numbers array contain 4")
    }
   ***/
    var a = intArrayOf(1, 2, 3, 4)
    println(a[1])
    a[1] = 12
    println(a[1])

}