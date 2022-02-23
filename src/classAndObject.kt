class Border() {
    fun printBorder() {
        repeat(18) {
            print("=")
        }
        println()
    }

    fun printBorderError() {
        repeat(18) {
            print("?")
        }
        println()
    }
}

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

    fun takeData(id: Int, sname: String, eng: Float, math: Float, science: Float) {
        this.id = id
        if (sname.length < 20) {
            this.sname = sname
        } else {

            border.printBorder()
            println("User name should not exceed the 20 characters ")
            border.printBorder()
            return
        }
        this.eng = eng
        this.math = math
        this.science = science
        calcTotal()
    }

    fun takeDataUser() {
        print("Please enter ID: ")
        val id = readLine()!!.toInt()
        this.id = id

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
        print("Please enter your english score: ")
        val english = readLine()!!.toFloat()
        this.eng = english

        print("Please enter your mathematical score: ")
        val mathematical = readLine()!!.toFloat()
        this.math = mathematical

        print("Please enter your science score: ")
        val userScience = readLine()!!.toFloat()
        this.science = userScience

        calcTotal()
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

    fun readData() {
        val userCode = (Math.random() * 9999).toInt() + 1000
        if (userCode in 1000..9999) {
            this.bcode = userCode
        } else {
            border.printBorderError()
            println("Invalid code. You must enter 4 digit numbers!")
            border.printBorderError()
        }

        print("Please enter your name (Not to exceed 20 characters): ")
        val userName = readLine()!!.toString()
        if (userName.length < 20) {
            this.bname = userName
        } else {
            border.printBorderError()
            print("User name should not exceed the 20 characters ")
            border.printBorderError()
            return
        }

        print("Please enter your innings: ")
        val userInnings = readLine()!!.toFloat()
        this.innings = userInnings

        print("Please enter your notOut: ")
        val userNotOut = readLine()!!.toFloat()
        this.notOut = userNotOut

        print("Please enter your runs: ")
        val userRuns = readLine()!!.toFloat()
        this.runs = userRuns

        this.calcAvg()
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
        print("Please enter your TestCode: ")
        val userTestCode = readLine()!!.toInt()
        this.testCode = userTestCode

        print("Please enter your Discriprion: ")
        val userDescription = readLine()!!.toString()
        this.description = userDescription

        print("Please enter your NoCamdidate: ")
        val userNoCamdidate = readLine()!!.toInt()
        this.noCandidate = userNoCamdidate

        print("Please enter your CenterRegd: ")
        val userCenterRegd = readLine()!!.toInt()
        this.centerReqd = userCenterRegd

        calcNtr()
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

/**
 * 4.  Define a class in C++ with following description:
Private Members
A data member Flight number of type integer
A data member Destination of type string
A data member Distance of type float
A data member Fuel of type float
A member function CALFUEL() to calculate the value of Fuel as per the following criteria
Distance                                                          Fuel
<=1000                                                           500
more than 1000  and <=2000                          1100
more than 2000                                              2200
Public Members
A function FEEDINFO() to allow user to enter values for Flight Number, Destination, Distance & call function CALFUEL() to calculate the quantity of Fuel
A function SHOWINFO() to allow user to view the content of all the data members
 */

class Fuels() {
    private var flight: Int? = null
    private var destination: String? = null
    private var distance: Float? = null
    private var fuel: Float? = null
    private val border = Border()
    private fun calcFuel() {
        if (distance!! <= 1000) {
            fuel = 500f
        } else if (distance!! <= 2000) {
            fuel = 1100f
        } else {
            fuel = 2200f
        }
    }

    fun feedInfo() {
        print("Enter Flight number: ")
        val userFlight = readLine()!!.toInt()
        this.flight = userFlight

        print("Enter Destination: ")
        val userDestination = readLine()!!.toString()
        this.destination = userDestination

        print("Enter Distance: ")
        val userDistance = readLine()!!.toFloat()
        this.distance = userDistance

        calcFuel()
    }

    fun showInfo() {
        border.printBorder()
        println(
            """
            Flight number:  = $flight
            Destination:    = $destination
            Distance:       = $distance
            ------------------------
            Fuel :          = $fuel
        """.trimIndent()
        )
        border.printBorder()
    }
}

/**
 * 5. Define a class BOOK with the following specifications :
Private members of the class BOOK are
BOOK NO                integer type
BOOKTITLE             20 characters
PRICE                     float (price per copy)
TOTAL_COST()        A function to calculate the total cost for N number of copies where N is passed to the function as argument.
Public members of the class BOOK are
INPUT()                   function to read BOOK_NO. BOOKTITLE, PRICE
PURCHASE()            function to ask the user to input the number of copies to be purchased. It invokes TOTAL_COST() and prints the total cost to be paid by the user.
Note : You are also required to give detailed function definitions.
 */
class Book() {
    private var bookNo: Int? = null
    private var bookTitle: String = ""
    private var price: Float? = null
    private var border = Border()

    private fun totalCost(n: Int): Float {
        var tcost: Float = 0f
        tcost = price!! * n
        return tcost
    }

    fun input() {
        print("Enter Book Number: ")
        val userBookNo = readLine()!!.toInt()
        this.bookNo = userBookNo

        print("Enter Book Number (Not to exceed 20 characters): ")
        val userBookTitle = readLine()!!.toString()
        if (bookTitle.length < 20) {
            this.bookTitle = userBookTitle
        } else {
            border.printBorderError()
            print("User name should not exceed the 20 characters ")
            border.printBorderError()
        }

        print("Enter price per copy: ")
        val userPrice = readLine()!!.toFloat()
        this.price = userPrice
    }

    fun purChase() {
        print("Enter number of copies to purchase ")
        val n = readLine()!!.toInt()
        this.totalCost(n)
        println(
            """
            Book Number:        = $bookNo
            Book Title:         = $bookTitle
            price per copy:     = $price
            copies to purchase: = ${totalCost(n)}$
        """.trimIndent()
        )
    }
}

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
    val userMarks =IntArray(marks)

    private fun getAvg():Int {
        average = userMarks.average().toInt()
        return average
    }

    fun readInfo() {
        print("Enter 4 digit admission number: ")
        val userAdno = readLine()!!.toInt()
        if (userAdno in 1000..9999) {
            this.adno = userAdno
        } else {
            border.printBorder()
            println("Invalid code. You must enter 4 digit numbers!")
            border.printBorder()
        }

        print("Enter name (Not to exceed 20 characters): ")
        val userName = readLine()!!.toString()
        if (name!!.length < 20) {
            this.name = userName
        } else {
            border.printBorder()
            println("User name should not exceed the 20 characters ")
            border.printBorder()
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
    }

    fun disPlayInfo() {
        border.printBorder()
        println("""
            Admisson number:    = $adno
            Name:               = $name
            Marks obtained:     = $marks
            Average marks       = ${getAvg()}
            
        """.trimIndent())
        border.printBorder()
    }
}