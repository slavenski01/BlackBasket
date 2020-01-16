package discount

/**
 * @author Vyacheslav Kuznetsov
 **/
open class DiscountService {

    //discount items for which a full discount on a purchase is calculated
    private val listDiscountItems = arrayListOf<DiscountItem>()

    /**
     * Method for adding a discount item
     * @param discountItem - discount item for adding
     **/
    open fun addDiscountItem(discountItem: DiscountItem) {
        listDiscountItems.add(discountItem)
    }

    /**
     * Method to remove ID discount item
     * @param discountItemId - discount id
     **/
    open fun removeDiscountItemOnId(discountItemId: Int) {
        listDiscountItems.firstOrNull { it.id == discountItemId }.let { listDiscountItems.remove(it) }
    }
}