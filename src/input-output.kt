/* fun main(args : Array<String>) {
 /*   println("1. println ");
    println("2. println ");

    print("1. Moses ");
    print("2. Mwila");
    */

    print("Enter your name: ")

    val stringInput = readLine()
    println("Your entered $stringInput")
}

*/
import java.util.Scanner

fun main(args: Array<String>) {

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")
}


