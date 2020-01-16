package price

import products.IProduct

/**
 * @author Vyacheslav Kuznetsov
 **/
open class PriceService {
    /**
     * Method for obtaining the total price of all goods excluding discounts
     * @param listIProducts - list of products (the product must implement the ProductManager interface)
     * @return returns the total price of all products
     * */
    fun countPriceNotDiscount(listIProducts: List<IProduct>): Double {
        var price = 0.0
        listIProducts.forEach {
            price += it.getPrice()
        }
        return price
    }

    fun countPriceWithDiscount(listIProducts: List<IProduct>): Double {
        var price = 0.0
        listIProducts.forEach {

        }
        return price
    }
}