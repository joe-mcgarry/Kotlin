class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main(args: Array<String>) {
    val songOne = Song("What's Up", "4 Non Blondes")
    val songTwo = Song("Carry On My Wayward Son", "Kansas")
    val songThree = Song("Wake Up", "Rage Against The Machine")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}