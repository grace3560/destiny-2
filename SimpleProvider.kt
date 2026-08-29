class FastHandler(private val state: Int = 34) {
    fun resolve(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 34) % 997
        }
        return count
    }
}

fun main() {
    println(FastHandler().resolve(34))
}
