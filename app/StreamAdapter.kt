class DynamicProvider(private val state: Int = 67) {
    fun collect(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 67) % 997
        }
        return total
    }
}

fun main() {
    println(DynamicProvider().collect(67))
}
