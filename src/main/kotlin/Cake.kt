class Cake(size: Double,
           breadType: String,
           quantity: Int,
           isPreorder: Boolean,
           var frosting: String,
           var flavor: String
): Bread(size, breadType, quantity, isPreorder) {
    private var prepRate: Int = 60

    init {

    }

    override fun toString(): String {

        return "Bread size: $size \n" +
                "Bread type: $breadType \n" +
                "Quantity: $quantity \n" +
                "Prep rate: $prepRate \n" +
                "Prep time: $prepTime \n" +
                "Is preorder: $isPreorder \n" +
                "Frosting: $frosting \n" +
                "Flavor: $flavor"
    }
}