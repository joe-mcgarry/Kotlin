abstract class Animal {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

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

abstract class Canine : Animal() {
    override fun roam() {
        println("The canine roams")
    }
}

abstract class Feline : Animal() {
    override fun roam() {
        println("The feline roams")
    }
}

class Lion : Feline() {
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "desert"

    override fun makeNoise() {
        println("ROAR!")
    }

    override fun eat() {
        println("The lion eats $food")
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
