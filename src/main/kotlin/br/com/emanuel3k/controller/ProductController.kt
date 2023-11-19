package br.com.emanuel3k.controller


import br.com.emanuel3k.model.Product
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam

@Path("/product")
class ProductController {

    private var products: MutableList<Product> = ArrayList()

    @GET
    fun getAllProducts(): MutableList<Product> {
        return products
    }

    @POST
    fun postProduct(product: Product): String {
        products.add(product)
        return "Product registered successfully"
    }

    @PUT
    @Path("/{id}")
    fun putProduct(@PathParam("id") id: Long, product: Product): String {

        products.stream()
            .filter { p ->
                p.id == id
            }.findFirst()
            .ifPresent { p ->
                p.name = product.name
                p.price = product.price
            }

        return "Product updated successfully"
    }

}