package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val aUp = a.toUpperCase()
        var matchCount = 0
        val bSize = b.length
        for (i in 0..aUp.lastIndex) {
            if (aUp[i].equals(b[matchCount])) {
                matchCount++
            }
            if (matchCount.equals(bSize))
                return "YES"
        }
        return "NO"
    }
}
