fun main(args: Array<String>) {
    //println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice (options)
    printResult(userChoice, gameChoice)

    //println("Program arguments: ${args.joinToString()}")
}