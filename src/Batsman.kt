import java.lang.NumberFormatException

/**
 * 2.  Define a class batsman with the following specifications:
Private members:
bcode                            4 digits code number
bname                           20 characters
innings, notout, runs        integer type
batavg                           it is calculated according to the formula –
batavg =runs/(innings-notout)
calcavg()                        Function to compute batavg
Public members:
readdata()                      Function to accept value from bcode, name, innings, notout and invoke the function calcavg()
displaydata()                   Function to display the data members on the screen. solution
 */
class Batsman() {
    private var bcode: Int? = null
    private var bname: String? = null
    private var innings: Float = 0f
    private var notOut: Float = 0f
    private var runs: Float = 0f
    private var barAvg: Float = 0f
    private val border = Border()

    private fun calcAvg(): Float {
        barAvg = runs / (innings - notOut)
        return barAvg
    }

    fun readData(){
        try {
            if (this.bcode == null) {
                val userCode = (Math.random() * 9999).toInt() + 1000
                if (userCode in 1000..9999) {
                    this.bcode = userCode
                }
            }
            if (this.bname == null) {
                print("Please enter your name (Not to exceed 20 characters): ")
                val userName = readLine()!!.toString()
                if (userName.length < 20) {
                    this.bname = userName
                } else {
                    border.printBorderError()
                    println("User name should not exceed the 20 characters ")
                    border.printBorderError()
                    readData()
                }
            }
            if (this.innings == 0f) {
                print("Please enter your innings: ")
                val userInnings = readLine()!!.toFloat()
                this.innings = userInnings
            }
            if (this.notOut == 0f) {
                print("Please enter your notOut: ")
                val userNotOut = readLine()!!.toFloat()
                this.notOut = userNotOut
            }
            if (this.runs == 0f) {
                print("Please enter your runs: ")
                val userRuns = readLine()!!.toFloat()
                this.runs = userRuns
            }
            this.barAvg

            displaydata()
        } catch (e: Exception) {
            if (e is NumberFormatException) {
                println("Please provide correct input! ")
                readData()
            }
        }
    }

    fun displaydata() {
        border.printBorder()
        println(
            """
            Student's code:         = $bcode
            Student's name:         = $bname
            Student's inside days:  = $innings
            Student's outside days: = $notOut
            Student's run days:     = $runs
            ------------------------------
            Student's average 
            running days:           = ${calcAvg()}
        """.trimIndent()
        )
        border.printBorder()
    }
}