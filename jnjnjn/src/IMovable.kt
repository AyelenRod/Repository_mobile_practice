import javax.print.attribute.standard.PresentationDirection

interface IMovable {
    val masSpeed: Int
    fun move(direction: Direction)
    fun stop(){
        println("Stopping")
    }
}