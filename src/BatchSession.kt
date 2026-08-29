class BatchBuilder(private val state: Int = 12) {
    fun collect(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 12) % 997
        }
        return result
    }
}

fun main() {
    println(BatchBuilder().collect(12))
}
