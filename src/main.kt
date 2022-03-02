fun main(args: Array<String>) {
    do {
        println(
            "\nClass and Objects" +
                    "\n1. Task function Student()" +
                    "\n2. Task function Batsman()" +
                    "\n3. Task function Test()" +
                    "\n4. Task function Fuels()" +
                    "\n5. Task function Book()" +
                    "\n6. Task function Report()" +
                    "\n7. Exit"
        )
        print("Enter your choice 1-7: ")
        val userMenuOption = readLine()!!.toInt()
        when (userMenuOption) {
            1 -> {
                val show = Student()
//                show.takeData(31,"Shohruh", 65f, 73f, 87f)
                show.takeDataUser()
            }
            2 -> {
                val taskTwo = Batsman()
                taskTwo.readData()
                taskTwo.displaydata()
            }
            3 -> {
                val taskThree = Test()
                taskThree.schedule()
            }
            4 -> {
                val taskFour = Fuels()
                taskFour.feedInfo()
            }
            5 -> {
                val taskFive = Book()
                taskFive.input()
            }
            6 -> {
                val taskSex = Report()
                taskSex.readInfo()
            }
            7 -> {
                checkCharacterIf()
            }
            else -> {
                println("Wrong Input, please select between 1 to 7!")
            }
        }
    } while (userMenuOption != 8)

}

