import java.lang.NumberFormatException
/**
 * 3. Define a class TEST in C++ with following description:
Private Members
TestCode of type integer
Description of type string
NoCandidate of type integer
CenterReqd (number of centers required) of type integer
A member function CALCNTR() to calculate and return the number of centers as
(NoCandidates/100+1)
Public Members
-  A function SCHEDULE() to allow user to enter values for TestCode, Description, NoCandidate & call function CALCNTR() to calculate the number of Centres
- A function DISPTEST() to allow user to view the content of all the data members
 */
class Test() {
    private var testCode: Int = 0
    private var description: String = ""
    private var noCandidate: Int = 0
    private var centerReqd: Int = 0
    private val border = Border()

    private fun calcNtr(): Float {
        return noCandidate / 100 + 1f
    }

    fun schedule() {
        try {
            if (this.testCode == 0) {
                print("Please enter your TestCode: ")
                val userTestCode = readLine()!!.toInt()
                this.testCode = userTestCode
            }
            if (this.description == "") {
                print("Please enter your Discriprion: ")
                val userDescription = readLine()!!.toString()
                this.description = userDescription
            }
            if (this.noCandidate == 0) {
                print("Please enter your NoCamdidate: ")
                val userNoCamdidate = readLine()!!.toInt()
                this.noCandidate = userNoCamdidate
            }
            if (this.centerReqd == 0) {
                print("Please enter your CenterRegd: ")
                val userCenterRegd = readLine()!!.toInt()
                this.centerReqd = userCenterRegd
            }
            calcNtr()

            dispTest()
        } catch (e: Exception) {
            if (e is NumberFormatException) {
                println("Please provide correct input! ")
                schedule()
            }
        }
    }

    fun dispTest() {
        border.printBorder()
        println(
            """
            TestCode = $testCode
            Description = $description
            NoCandidate = $noCandidate
            CenterReqd = $centerReqd
            ----------------------
            CALCNTR (NoCandidates/100+1)= ${calcNtr()}
        """.trimIndent()
        )
        border.printBorder()
    }
}