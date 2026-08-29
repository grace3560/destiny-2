class SmartProvider(private val state: Int = 53) {
    fun encode(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 53) % 997
        }
        return count
    }
}

fun main() {
    println(SmartProvider().encode(53))
}
