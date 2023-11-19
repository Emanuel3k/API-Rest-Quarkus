package br.com.emanuel3k.controller


import br.com.emanuel3k.model.Product
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path

@Path("/product")
class ProductController {

    private var products: MutableList<Product> = ArrayList()

    @GET
    fun getAllProducts(): MutableList<Product> {
        return  products
    }

    @POST
    fun postProduct(product: Product) : String {
        products.add(product)
        return "Product registered successfully"
    }

}