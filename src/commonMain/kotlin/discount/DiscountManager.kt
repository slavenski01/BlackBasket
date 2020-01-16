package discount

/**
 * @author Vyacheslav Kuznetsov
 **/
open class DiscountManager {

    //discount items for which a full discount on a purchase is calculated
    private val listDiscountItems = mutableListOf<IDiscount>()

    /***
     * Method for getting all discount items
     **/
    open fun getAllDiscountItem() = listDiscountItems

    /**
     * Method for adding a discount item
     * @param discountItem - discount item for adding
     **/
    open fun addDiscountItem(discountItem: IDiscount) {
        listDiscountItems.add(discountItem)
    }

    /**
     * Method to remove ID discount item
     * @param discountItemId - discount id
     **/
    open fun removeDiscountItemOnId(discountItemId: Int) {
        listDiscountItems.firstOrNull { it.getId() == discountItemId }.let { listDiscountItems.remove(it) }
    }

    /**
     * Method for updating a specific discount item
     **/
    open fun updateItem(discountItem: IDiscount) {
        listDiscountItems.firstOrNull { discountItem.getId() == it.getId() }.let {
            listDiscountItems.remove(it)
            listDiscountItems.add(discountItem)
        }
    }
}