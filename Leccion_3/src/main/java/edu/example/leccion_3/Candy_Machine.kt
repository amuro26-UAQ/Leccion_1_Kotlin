package edu.example.leccion_3

open class CashRegister(){
    open var cashOnHand:Int = 500
    constructor(cashIn: Int) : this() {
        if(cashIn >= 0) {
            cashOnHand = cashIn
        }
        else {
            cashOnHand = 500
        }

    }

    open fun currentBalance(): Int {

        return cashOnHand

    }
    open  fun acceptAmount(amount: Int){
        cashOnHand += amount
    }
}

open class Dispenser(){
    private var numberOfItems:Int = 50
    private var cost:Int=50

    constructor(setNoOfItems: Int, setCost: Int) : this() {
        if(setNoOfItems >= 0) {
            numberOfItems = setNoOfItems
        }
        else {
            numberOfItems = 50
        }
        if(setCost >= 0) {
            cost = setCost
        }
        else {
            cost = 50
        }
    }

    open fun getCount(): Int{
        return numberOfItems
    }

    open fun getProductCost(): Int{
        return cost
    }

    open fun makeSale(){
        numberOfItems--
    }
}

 fun showSelection(){
    println("***Welcome to Shelly´s Candy Shop***")
     println("To select an item, enter")
     println("1 for Candy")
     println("2 for Chips")
     println("3 for Gum")
     println("4 for Cookies")
     println("9 to exit")
}

fun sellProduct(product: Dispenser, cRegister: CashRegister){
    var price: Int
    var coinsInsterted: Int
    var coinsRequired: Int

    if (product.getCount() > 0){
        price = product.getProductCost()
        coinsRequired = price
        coinsInsterted = 0

        while (coinsRequired>0){
            println("Please deposit ${coinsRequired} cents")1
            coinsInsterted=coinsInsterted + readln().toInt()
            coinsRequired = price - coinsInsterted
        }

        println()
        cRegister.acceptAmount(coinsInsterted)
        product.makeSale()
        println("Collect your item at the bottom and enjoy")
    }
    else
        println("Sorry this item is sold out.\n")
}

fun main(){
    val cashRegister = CashRegister()
    val candy = Dispenser(100, 50)
    val chips = Dispenser(100, 65)
    val gum = Dispenser(75, 45)
    val cookies = Dispenser(100,85)

    var choice: Int

    showSelection()
    choice= readln().toInt()

    while (choice != 9) {
        when(choice){
            1 -> sellProduct(candy, cashRegister)

            2 -> sellProduct(chips, cashRegister)

            3 -> sellProduct(gum, cashRegister)

            4 -> sellProduct(cookies, cashRegister)

            else -> println("Invalid Selection")
        }
    }
}