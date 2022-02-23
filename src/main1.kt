import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

//class FootballTeam {
//    var name: String = ""
//    fun printClubName() {
//        println("Club name: $name")
//    }
//}

//fun main(args: Array<String>) {
////    val realMadrid = FootballTeam()
////    realMadrid.name = "RealM"
////
////    realMadrid.printClubName()
////
////    val barsa = FootballTeam()
////    barsa.name = "Barsa"
////
////    barsa.printClubName()
//    printBorder()
//    println("Happy Birthday, Jhansi!")
//    printBorder()
//
//
//    val person1 = Person("Shohruh", 31)
//    printBorder()
//    println("first name: ${person1.firstname}")
//    println("first name: ${person1.age}")
//    printBorder()
//}
//fun printBorder() {
//    repeat(23) {
//        print("=")
//    }
//    println()
//}
//class Person (val firstname: String, val age: Int){
//}
class MusicPlayer {
    private var songs: Array<String> = arrayOf()
    //your code goes here
    fun add(track:String): Array<String>{
        songs = songs + track
        return songs
    }
    fun show(){
        for(track in songs){
            println(track)
        }
    }
    fun play(){
        println("Playing" + songs[0])
    }

}
fun main(args: Array<String>) {
    val m = MusicPlayer()

    while(true) {
        var input = readLine()!!
        if(input == "stop") {
            break
        }
        m.add(input)
    }
    m.show()
    m.play()
}