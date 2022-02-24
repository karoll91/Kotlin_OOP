import java.lang.NumberFormatException

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
    private var bookTitle: String? = null
    private var price: Float? = null
    private var border = Border()

    private fun totalCost(n: Int): Float {
        var tcost: Float = 0f
        tcost = price!! * n
        return tcost
    }

    fun input() {
        try {
            if (this.bookNo == null) {
                print("Enter Book Number: ")
                val userBookNo = readLine()!!.toInt()
                this.bookNo = userBookNo
            }
            if (this.bookTitle == ""){
                print("Enter Book Number (Not to exceed 20 characters): ")
                val userBookTitle = readLine()!!.toString()
                if (bookTitle!!.length < 20) {
                    this.bookTitle = userBookTitle
                } else {
                    border.printBorderError()
                    print("User name should not exceed the 20 characters ")
                    border.printBorderError()
                    input()
                }
            }
            if (this.price == null) {
                print("Enter price per copy: ")
                val userPrice = readLine()!!.toFloat()
                this.price = userPrice
            }
            purChase()
        }catch (e: Exception){
            if (e is NumberFormatException){
                println("Please provide correct input! ")
                input()
            }
        }
    }

    fun purChase() {
        print("Enter number of copies to purchase ")
        val n = readLine()!!.toInt()
        this.totalCost(n)
        border.printBorder()
        println(
            """
            Book Number:        = $bookNo
            Book Title:         = $bookTitle
            price per copy:     = $price
            --------------------------
            copies to purchase: = ${totalCost(n)}$
        """.trimIndent()
        )
        border.printBorder()
    }
}