class Electrodomestico(
    val PrecioBase: Int = 100,
    val Peso: Int = 5,
    val Color: String = "Blanco",
    val ConsumoEnergetico: Char = 'F'
) {
    constructor() : this(PrecioBase, Peso, Color, ConsumoEnergetico)

    constructor(PrecioBase: Int, Peso: Int) : this(PrecioBase, Peso, "Blanco", 'F')
    constructor() : this(100, 5, "Blanco", 'F')

    fun getPrecioBase(){
        return PrecioBase
    }

    fun getPeso(){
        return Peso
    }

    fun getColor(){
        return
    }

    fun get
}

