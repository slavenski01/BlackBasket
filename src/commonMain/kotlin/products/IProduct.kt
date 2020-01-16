package products

/**
 * @author Vyacheslav Kuznetsov
 * An interface that should inherit every object that needs to be put in the basket
 **/
interface IProduct {
    fun getId(): Int
    fun getPrice(): Float
}