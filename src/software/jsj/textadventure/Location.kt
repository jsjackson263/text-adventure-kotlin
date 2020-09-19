package software.jsj.textadventure

data class Location(val locationId: Int, val decsription: String) {

    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExit(direction: String, destinationId: Int) {
        exits[direction] = destinationId
    }

}