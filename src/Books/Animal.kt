package Books

open class Animal {
    open val image = ""
    open val foot = ""
    open val habitat = ""
    open val hunger = 0

    open fun makeNoise() {
        println("The animal is making a noise")
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

open class Feline() : Animal() {
    var roam = roam()
}

open class Canine() : Animal() {
    var roam = roam()
}

class Lion() : Feline() {

}

class Hippo() : Animal() {
    override var image = "hippo.jpg"
    override var foot: String = "grass"
    override var habitat: String = "Watter"
}

class Lynx() : Feline() {

}

class Fox() : Canine() {

}

class Wolf() : Canine() {

}

class Cheetah : Feline() {

}
