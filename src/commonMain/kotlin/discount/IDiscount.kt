package discount

/**
 * @author Vyacheslav Kuznetsov
 * The interface that describes the model of the discount element,
 * that is, if the product contains one of these elements,
 * then the discount will apply to this product.
 **/
interface IDiscount {
    /**
     * Method for getting discount item id
     * @return discount id
     **/
    fun getId(): Int?

    /**
     * The list of products that contain this discount element
     * may be empty if the discount is for the whole purchase, and not for the goods
     * @return list products with discounts
     **/
    fun productsIdList(): List<Int>?

    /**
     * Method for getting specific discount amount (cash)
     * @return discount amount
     **/
    fun valueMoney(): Double?

    /**
     * Method for getting amount of discount depending on the price (percent)
     * @return discount amount (percent)
     **/
    fun valuePercent(): Double?

    /**
     * determine sale or discount on the whole purchase
     **/
    fun isAbsoluteDiscount(): Boolean?
}