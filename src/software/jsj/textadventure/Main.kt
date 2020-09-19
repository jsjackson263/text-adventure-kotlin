package software.jsj.textadventure

fun main(args: Array<String>) {
    val locations = readLocationInfo()
    var loc = 64 //current location

    while(true) {
        //val location = locations[loc] // we could do it this way, but better as below
        val location = locations[loc]?: Location(0, "Sorry, something went wrong, so the game will terminate")

        println(location.decsription)

        if (location.locationId == 0) {
            break
        }

        print("Available exits are: ")
        location.exits.keys.forEach {
            print("$it, ")
        }

        val direction = readLine()?.toUpperCase() ?: "Z"   // ?. = protection against null (if null, assign asvalue of "Z")
        if (location.exits.containsKey(direction)) {
            loc = location.exits[direction]!!  //-> don't worry about null here, this is never going to be null
        } else {
            println("You can't go in that direction!")
        }
    }
}