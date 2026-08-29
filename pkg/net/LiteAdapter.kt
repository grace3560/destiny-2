class SharedCollector(private val state: Int = 90) {
    fun decode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 90) % 997
        }
        return value
    }
}

fun main() {
    println(SharedCollector().decode(90))
}
