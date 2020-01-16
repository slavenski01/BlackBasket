package discount

/**
 * @author Vyacheslav Kuznetsov
 * The class that describes the model of the discount element,
 * that is, if the product contains one of these elements,
 * then the discount will apply to this product.
 * @param id - discount item id
 * @param productsIdList - the list of products that contain this discount element
                           may be empty if the discount is for the whole purchase, and not for the goods
 * @param valueMoney - specific discount amount (cash)
 * @param valuePercent - amount of discount depending on the price (percent)
 * @param isAbsoluteDiscount - determine sale or discount on the whole purchase
 **/
data class DiscountItem(
    val id: Int?,
    val productsIdList: List<Int>? = null,
    val valueMoney: Double? = null,
    val valuePercent: Double? = null,
    val isAbsoluteDiscount: Boolean? = false
)