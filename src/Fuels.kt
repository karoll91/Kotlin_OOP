import java.lang.NumberFormatException

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
        try {
            if (this.flight == null) {
                print("Enter Flight number: ")
                val userFlight = readLine()!!.toInt()
                this.flight = userFlight
            }
            if (this.destination == null) {
                print("Enter Destination: ")
                val userDestination = readLine()!!.toString()
                this.destination = userDestination
            }
            if (this.distance == null) {
                print("Enter Distance: ")
                val userDistance = readLine()!!.toFloat()
                this.distance = userDistance
            }
            calcFuel()

            showInfo()
        }catch (e: Exception){
            if (e is NumberFormatException){
                println("Please provide correct input! ")
                feedInfo()
            }
        }
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