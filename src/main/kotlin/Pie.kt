class Pie(size: Double,
           breadType: String,
           quantity: Int,
           isPreorder: Boolean,
           var flavor: String
): Bread(size, breadType, quantity, isPreorder) {
    private var prepRate: Int = 90

    init {

    }

    override fun toString(): String {

        return "Bread size: $size \n" +
                "Bread type: $breadType \n" +
                "Quantity: $quantity \n" +
                "Prep rate: $prepRate \n" +
                "Prep time: $prepTime \n" +
                "Is preorder: $isPreorder \n" +
                "Flavor: $flavor"
    }
}