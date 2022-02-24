import java.lang.NumberFormatException
/**
 * 6. Define a class REPORT with the following specification:
Private members :
adno                         4 digit admission number
name                        20 characters
marks                       an array of 5 floating point values
average                    average marks obtained
GETAVG()                 a function to compute the average obtained in five subject
Public members:
READINFO()              function to accept values for adno, name, marks. Invoke the function GETAVG()
DISPLAYINFO()          function to display all data members of report on the screen.
You should give function definitions.
 */
class Report() {
    private var adno: Int? = null
    private var name: String = ""
    private var marks: Int = 5
    private var average: Int = 0
    private var border = Border()
    val userMarks = IntArray(marks)

    private fun getAvg(): Int {
        average = userMarks.average().toInt()
        return average
    }

    fun readInfo() {
        try {
            if (this.adno == null) {
                print("Enter 4 digit admission number: ")
                val userAdno = readLine()!!.toInt()
                if (userAdno in 1000..9999) {
                    this.adno = userAdno
                } else {
                    border.printBorderError()
                    println("Invalid code. You must enter 4 digit numbers!")
                    border.printBorderError()
                    readInfo()
                }
            }
            if (this.name == "") {
                print("Enter name (Not to exceed 20 characters): ")
                val userName = readLine()!!.toString()
                if (name.length < 20) {
                    this.name = userName
                } else {
                    border.printBorderError()
                    println("User name should not exceed the 20 characters ")
                    border.printBorderError()
                    readInfo()
                }
            }
            println("Enter marks: ")
            for (index in 0 until userMarks.size) {
                print("Mark [$index]: ")
                val inputOfEachElement = readLine()!!.toInt()
                userMarks[index] = inputOfEachElement
            }
            println("Elements of the marks: ")
            for (index in 0 until userMarks.size) {
                print("${userMarks[index]}\t")
            }
            println()

            disPlayInfo()
        } catch (e: Exception) {
            if (e is NumberFormatException) {
                println("Please provide correct input! ")
                readInfo()
            }
        }
    }

    fun disPlayInfo() {
        border.printBorder()
        println(
            """
            Admisson number:    = $adno
            Name:               = $name
            Marks obtained:     = $marks
            ----------------------------
            Average marks       = ${getAvg()}
            
        """.trimIndent()
        )
        border.printBorder()
    }
}