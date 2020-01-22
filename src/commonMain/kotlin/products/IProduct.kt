package products

/**
 * @author Vyacheslav Kuznetsov
 * An interface that should inherit every object that needs to be put in the basket
 **/
interface IProduct {
    /**
     * Method for getting discount item id
     * @return product id
     **/
    fun getId(): Int

    /**
     * Method for getting price specific product
     * @return product price
     **/
    fun getPrice(): Float
}