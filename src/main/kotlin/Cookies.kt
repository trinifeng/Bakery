class Cookies(size: Double,
           breadType: String,
           quantity: Int,
           isPreorder: Boolean,
           var isFrosting: Boolean,
           var flavor: String,
): Bread(size, breadType, quantity, isPreorder) {
    private var prepRate: Int = 15
    override var prepTime: Double = prepRate.toDouble() * quantity.toDouble() * (size/15)

    init {

    }

    override fun toString(): String {

        return "Bread size: $size \n" +
                "Bread type: $breadType \n" +
                "Quantity: $quantity \n" +
                "Prep rate: $prepRate \n" +
                "Prep time: $prepTime \n" +
                "Is preorder: $isPreorder \n" +
                "Is frosting: $isFrosting \n" +
                "Flavor: $flavor"
    }
}