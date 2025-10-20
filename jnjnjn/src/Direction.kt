enum class Direction (val value: String){
    NORTH("Vives en el cerro"),
    EAST("Vives en colonia fifi"),
    SOUTH("Te inundas a cada rato"),
    WEST("Ni Dios entra ahi");

    fun getOpposite(): Direction{
        return when (this){
            NORTH -> SOUTH
            SOUTH -> NORTH
            EAST -> WEST
            WEST -> EAST
        }
    }
}

