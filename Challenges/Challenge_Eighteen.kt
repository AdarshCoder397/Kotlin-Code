/**************************************************************************************************************************************
* QUESTION:
* You have a natural number n. Generate a sequence of integers, described in the Collatz conjecture:
* 
* If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1. Repeat this operation until you get 1 as a result.
* 
* For example, if n is 17, then the sequence would look like this: 17 52 26 13 40 20 10 5 16 8 4 2 1
* This sequence should stop at 1 for any primary natural number n.
*
* Output format:
* A sequence of integers in a single line, separated by spaces.
*****************************************************************************************************************************************/

// SOLUTION
fun main() {
    val numbers: MutableList <Int> = mutableListOf()
    var num = readln().toInt()
    print("$num ")
    while (num != 1) {
        if (num % 2 == 0) {
            num = num / 2
            numbers.add(num)
        } else {
            num = num * 3 + 1
            numbers.add(num)
        }        
    }
    println(numbers.joinToString(" "))
}
