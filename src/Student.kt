import java.lang.NumberFormatException
/**
 * 1. Define a class student with the following specification
Private members of class student
admno                        integer
sname                        20 character
eng. math, science           float
total                        float
ctotal()                     a function to calculate eng + math + science with float return type.
Public member function of class student
Takedata()                   Function to accept values for admno, sname, eng, science and invoke ctotal() to calculate total.
Showdata()                   Function to display all the data members on the screen.
 */
fun checkCharacterIf(){
//    val scanner = Scanner(System.in)
    print("Enter character: ")
    val text: String = readLine()!!.toString()
    if (text in "a".."z" || text in "A".."Z")
        println("$text this alphabet")
    else if (text in "0".."9")
        println("$text this number")
    else
        println("$text this Special Character")
}

class Student() {
    private var id: Int = 0
    private var sname: String = ""
    private var eng: Float = 0.0f
    private var math: Float = 0.0f
    private var science: Float? = null
    private var total: Float = 0.0f
    val border = Border()

    private fun calcTotal(): Float {
        if (science != null) total = eng + math + science!!
        return total

    }

//    fun takeData(id: Int, sname: String, eng: Float, math: Float, science: Float) {
//        this.id = id
//        if (sname.length < 20) {
//            this.sname = sname
//        } else {
//            border.printBorder()
//            println("User name should not exceed the 20 characters ")
//            border.printBorder()
//            return
//        }
//        this.eng = eng
//        this.math = math
//        this.science = science
//        this.total
//
//        showData()
//    }

    fun takeDataUser() {
        try{
            if (this.id == 0){
                print("Please enter ID: ")
                val id = readLine()!!.toInt()
                this.id = id
            }
            if (this.sname == ""){
                print("Please enter name: ")
                val name = readLine()!!.toString()
                if (name.length < 20) {
                    this.sname = name
                } else {
                    border.printBorderError()
                    print("User name should not exceed the 20 characters ")
                    border.printBorderError()
                    return
                }
            }
            if (this.eng == 0f) {
                print("Please enter your english score: ")
                val english = readLine()!!.toFloat()
                this.eng = english
            }
            if (this.math == 0f) {
                print("Please enter your mathematical score: ")
                val mathematical = readLine()!!.toFloat()
                this.math = mathematical
            }
            if (this.science == null) {
                print("Please enter your science score: ")
                val userScience = readLine()!!.toFloat()
                this.science = userScience
            }
            this.total

            showData()
        }catch (e: Exception){
            if (e is NumberFormatException){
                println("Please provide correct input! ")
                takeDataUser()
            }
        }
    }

    fun showData() {
        border.printBorder()
        println(
            """
            id          = $id
            name        = $sname
            eng         = $eng
            math        = $math
            science     = $science
            ----------------------
            calcTotal   = ${calcTotal()}
        """.trimIndent()
        )
        border.printBorder()
    }
}