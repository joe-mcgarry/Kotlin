data class Recipe(val title: String,
                  val mainIngredient: String,
                  val isVegetarian: Boolean,
                  val difficulty: String = "Easy"){
}

class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
        //Code to run when secondary constructor called
    }
}

fun main() {
    val r1 = Recipe("Thai Curry", false)
    val r2 = Recipe("Thai Curry", false)
    val r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2?: ${r1 == r2}")
    println("r1 === r2?: ${r1 === r2}")
    println("r1 == r3?: ${r1 == r3}")
    val (title, vegetarian) = r1
    println("title is $title and vegetarian is $vegetarian")
}