import java.util.Scanner
fun main() {
    val s = Scanner(System.`in`)
    var waterInMachine = 400
    var milkInMachine = 540
    var beansInMachine = 120
    var cupsInMachine = 9
    var priceInMachine = 550

    while (true) {
        print("Write action (buy, fill, take, remaining, exit): ")
        val selectAction = s.next()

        if (selectAction == "buy") {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
            val selectCoffee = s.next()

            if (selectCoffee == "back") {
                continue
            } else if (selectCoffee.toInt() == 1) { // ESPRESSO
                if (waterInMachine >= 250 && beansInMachine >= 16 && cupsInMachine >= 1){
                    waterInMachine -= 250
                    beansInMachine -= 16
                    cupsInMachine -= 1
                    priceInMachine += 4
                    println("I have enough resources, making you a coffee!")
                    continue
                }
                when(waterInMachine < 250 || beansInMachine < 16 || cupsInMachine == 0){
                    (waterInMachine < 250) -> println("Sorry, not enough water!")
                    (beansInMachine < 16) -> println("Sorry, not enough beans!")
                    (cupsInMachine == 0) -> println("Sorry, not enough cups!")
                    else -> println("Sorry, not enough water, milk, beans and cups!")
                }
            } else if (selectCoffee.toInt() == 2) { // LATTE
                if (waterInMachine >= 350 && milkInMachine >= 75 && beansInMachine >= 20 && cupsInMachine >= 1){
                    waterInMachine -= 350
                    milkInMachine -= 75
                    beansInMachine -= 20
                    cupsInMachine -= 1
                    priceInMachine += 7
                    println("I have enough resources, making you a coffee!")
                    continue
                }
                when(waterInMachine < 350 || milkInMachine < 75 || beansInMachine < 20 || cupsInMachine == 0){
                    (waterInMachine < 350) -> println("Sorry, not enough water!")
                    (milkInMachine < 75) -> println("Sorry, not enough milk!")
                    (beansInMachine < 20) -> println("Sorry, not enough beans!")
                    (cupsInMachine == 0) -> println("Sorry, not enough cups!")
                    else -> println("Sorry, not enough water, milk, beans and cups!")
                }

            } else if (selectCoffee.toInt() == 3) { // CAPPUCCINO
                if (waterInMachine >= 200 && milkInMachine >= 100 && beansInMachine >= 12 && cupsInMachine >= 1){
                    waterInMachine -= 200
                    milkInMachine -= 100
                    beansInMachine -= 12
                    cupsInMachine -= 1
                    priceInMachine += 6
                    println("I have enough resources, making you a coffee!")
                    continue
                }
                when(waterInMachine < 200 || milkInMachine < 100 || beansInMachine < 12 || cupsInMachine == 0){
                    (waterInMachine < 200) -> println("Sorry, not enough water!")
                    (milkInMachine < 100) -> println("Sorry, not enough milk!")
                    (beansInMachine < 12) -> println("Sorry, not enough beans!")
                    (cupsInMachine == 0) -> println("Sorry, not enough cups!")
                    else -> println("Sorry, not enough water, milk, beans and cups!")
                }

            }

        } else if (selectAction == "fill"){
            print("Write how many ml of water do you want to add: ")
            val fillWater = s.nextInt()
            waterInMachine += fillWater
            print("Write how many ml of milk do you want to add: ")
            val fillMilk = s.nextInt()
            milkInMachine += fillMilk
            print("Write how many grams of coffee beans do you want to add: ")
            val fillBeans = s.nextInt()
            beansInMachine += fillBeans
            print("Write how many disposable cups of coffee do you want to add: ")
            val fillCups = s.nextInt()
            cupsInMachine += fillCups
        } else if (selectAction == "take") {

            println("I gave you $priceInMachine")
            priceInMachine = 0
            continue

        } else if (selectAction == "remaining") {

            println("The coffee machine has:")
            println("$waterInMachine ml of water")
            println("$milkInMachine ml of milk")
            println("$beansInMachine g of coffee beans")
            println("$cupsInMachine disposable cups")
            println("$$priceInMachine of money")
            continue

        } else if (selectAction == "exit") break

    }

}