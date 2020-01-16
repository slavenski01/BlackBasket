package basket

import discount.DiscountManager
import price.PriceManager
import products.IProduct
import products.ProductManager

/**
 * @author Vyacheslav Kuznetsov
 * The basket service class, all the main interactions occur in it
 **/
open class BlackBasketService(private val config: Builder) {

    companion object Builder {
        protected var discountManager: DiscountManager? = null
        protected var priceManager: PriceManager? = null
        protected var productManager: ProductManager? = null

        fun discountManager(value: DiscountManager) = apply { discountManager = value }
        fun priceManager(value: PriceManager) = apply { priceManager = value }
        fun productManager(value: ProductManager) = apply { productManager }

        fun build(): BlackBasketService {
            return BlackBasketService(this)
        }
    }

    private val listProducts = HashMap<IProduct, Int>()

    /**
     * Method for receiving purchase price without discount
     * @return price
     **/
    open fun getPriceNotDiscount(): Float? {
        var price = 0.0f
        listProducts.forEach {
            price += it.value * it.key.getPrice()
        }
        return price
    }

    open fun getPriceWithDiscount(): Float? {
        var price = 0.0f

        listProducts.forEach { product ->
            discountManager?.getAllDiscountItem()
                ?.filter { discount ->
                    discount.getProductsIdList()?.contains(product.key.getId()) ?: false
                            && discount.isAbsoluteDiscount() == false
                }
                ?.forEach { 
                    price -= (it.getValueMoney() ?: 0.0f) * product.value
                }
        }

        return price
    }
}