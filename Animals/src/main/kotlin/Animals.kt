open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The animal is making noise")
    }

    open fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }

}

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}

open class Canine : Animal() {
    override fun roam() {
        println("The canine roams")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Howl! Hoooooooooowl")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (animal in animals) {
        animal.roam()
        animal.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(hippo)
    vet.giveShot(wolf)
}
