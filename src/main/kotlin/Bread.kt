open class Bread(var size: Double,
            var breadType: String,
            var quantity: Int,
            var isPreorder: Boolean
) {
    private var prepRate: Int = 120
    open var prepTime: Double = prepRate.toDouble() * quantity.toDouble() * (size/15)

    init {

    }

    override fun toString(): String {

        return "Bread size: $size \n" +
                "Bread type: $breadType \n" +
                "Quantity: $quantity \n" +
                "Prep rate: $prepRate \n" +
                "Prep time: $prepTime \n" +
                "Is preorder: $isPreorder"
    }

    fun prep() {
        println("Putting $breadType in the oven... will be ready in $prepTime minutes.")
        if(isPreorder)
            println("Your $breadType was made $prepTime minutes ago and is now ready for pickup!")
    }

}