fun main() {
    var userResponse: Int = 0
    println("Welcome to Riverfront Bakery! Please make your order selection by typing in one of the numbers below.")

    do {

        println("\n1) Bread")
        println("2) Cake")
        println("3) Cookies")
        println("4) Pie")
        println("5) Done")

        print("Enter Number Choice: ")
        try {
            userResponse = readln().toInt()
            if(userResponse <= 0 || userResponse >= 6)
                throw IllegalArgumentException("User response must be a number 1, 2, 3, 4, or 5")
        }
        catch (exception: NumberFormatException) {
            println("User response must be a number!")
        }

        if(userResponse != 5)
        {
            var size: Double = 0.0
            print("Enter the size of your order in inches: ")
            try {
                size = readln().toDouble()
                if (size == 0.0)
                    throw IllegalArgumentException("Size must be greater than 0")
            }
            catch (exception: NumberFormatException) {
                println("Size has to be a number!")
            }

            print("Enter the type of bread you want to order: ")
            var breadType = readln()

            print("Enter the quantity of your order: ")
            var quantity: Int = 0
            try {
                quantity = readln().toInt()
                if (quantity == 0)
                    throw IllegalArgumentException("Quantity must be greater than 0")
            }
            catch (exception: NumberFormatException) {
                println("Quantity has to be a number!")
            }

            print("Is this a preorder? Please type true or false. ")
            var preorder = readln().toBoolean()

            var bread = Bread(size, breadType, quantity, preorder)

            if (userResponse == 2)
            {
                print("Enter a frosting type: ")
                var frosting = readln()

                print("Enter the flavor of your cake: ")
                var flavor = readln()

                bread = Cake(size, breadType, quantity, preorder, frosting, flavor)
            }

            if(userResponse == 3)
            {
                print("Do you want your cookies frosted? Please type true or false. ")
                var frosting = readln().toBoolean()

                print("Enter the flavor of your cookies: ")
                var flavor = readln()

                bread = Cookies(size, breadType, quantity, preorder, frosting, flavor)
            }

            if(userResponse == 4)
            {
                print("Enter the flavor of your pie: ")
                var flavor = readln()

                bread = Pie(size, breadType, quantity, preorder, flavor)
            }

            try {
                println(bread.toString())
                bread.prep()
            }
            catch (exception: NullPointerException) {
                println("Bread object is invalid.")
            }
        }

    } while (userResponse != 5)

    if(userResponse == 5)
        print("Thank you for shopping at Riverfront Bakery!")
}