package Books

open class Animal {
    var image = ""
    var foot = ""
    var habitat = ""
    var hunger = 0

    fun makeNoise(){
        println("What sound does this animal make?")
    }
    fun eat(){
        println("What did this animal eat?")
    }
    fun roam(){
        println("What the animal does when it’s not eating or sleeping.")
    }
    fun sleep(){
        println("Makes the animal take a nap")
    }
}
class Lion():Animal(){

}
class Hippo():Animal(){

}
class Lynx():Animal(){

}
class Fox():Animal(){

}
class Wolf():Animal(){

}
class Cheetah:Animal(){

}
