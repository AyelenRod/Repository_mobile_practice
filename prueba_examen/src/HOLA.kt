
open class Producto(
    val nombre: String,
    val precio: Double) {

    fun mostrarProducto(): String {
        return "Producto: $nombre con precio $precio"
    }
}


class carritoDeCompras {
    private val productos = mutableListOf<Producto>()

    // --- Añadimos un producto a la lista interna (productos) ---
    fun agregarProducto(producto: Producto){
        productos.add(producto)
    }

    fun eliminarProducto(nombreProducto: String){
        val productoAEliminar = productos.find { it.nombre.equals(nombreProducto, ignoreCase = true) }

        if (productoAEliminar != null)
            productos.remove(productoAEliminar)
        else
            println("No encontre tu producto $nombreProducto papu")
    }

    fun calcularTotal(): Double {
        return productos.sumOf { it.precio}
    }

    fun mostrarCarrito(): String {
        if (productos.isEmpty()) return "El carrito esta vacio papau"

        val resumen = productos.joinToString(separator = "\n") { it.mostrarProducto() }
        val total = calcularTotal()
        return "$resumen\n\nTotal de la compra: $$total"
    }
}

fun main(){
    val despensa = carritoDeCompras()
    val lapto = Producto("LATO GAME", 2000.0)
    val tele = Producto("telecion", 410.0)

    despensa.agregarProducto(lapto)
    despensa.agregarProducto(tele)

    println (despensa.mostrarCarrito())

    despensa.eliminarProducto("LATO GAME")
    println()

    println(despensa.mostrarCarrito())

}