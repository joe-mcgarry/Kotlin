fun main(args: Array<String>) {

}

fun fizzBuzz(num: Int) : String {
    return if (num % 3 == 0) {
        "Fizz"
    }
    else if (num % 5 == 0) {
        return "Buzz"
    }
    else {
        return num.toString()
    }

}