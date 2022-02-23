fun main (args: Array<String>) {
    do {
        println(
            "\nClass and Objects" +
                    "\n1. Task" +
                    "\n2. Task" +
                    "\n3. Task" +
                    "\n4. Task" +
                    "\n5. Task" +
                    "\n6. Task" +
                    "\n7. Exit"
        )
        print("Enter your choice 1-7: ")
        val userMenuOption = readLine()!!.toInt()

        when (userMenuOption) {
            1 -> {
                val show = Student()
                show.takeData(31,"Shohruh", 65f, 73f, 87f)
                show.showData()
                show.takeDataUser()
                show.showData()
            }
            2 -> {
                val taskTwo = Batsman()
                taskTwo.readData()
                taskTwo.displaydata()
            }
            3 -> {
                val taskThree = Test()
                taskThree.schedule()
                taskThree.dispTest()
            }
            4 -> {
                val taskFour = Fuels()
                taskFour.feedInfo()
                taskFour.showInfo()
            }
            5 -> {
                val taskFive = Book()
                taskFive.input()
                taskFive.purChase()
            }
            6 -> {
                val taskSex = Report()
                taskSex.readInfo()
                taskSex.disPlayInfo()
            }
            else -> {
                println("Wrong Input, please select between 1 to 7!")
            }
        }
    } while (userMenuOption != 7)
}

