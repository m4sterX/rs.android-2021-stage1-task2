package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {


    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        when (blockB) {
                Int::class -> {
                    var sum = 0
                    for (i in 0..blockA.lastIndex) {
                        if (blockA[i] is Int) {
                            sum += blockA[i] as Int
                        }
                    }
                    return sum
                }
                String::class -> {
                    var concat = ""
                    for (i in 0..blockA.lastIndex) {
                        if (blockA[i] is String) {
                            concat += blockA[i] as String
                        }
                    }
                    return concat
                }
                LocalDate::class -> {
                    val format = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                    return blockA.filterIsInstance<LocalDate>().max()!!.format(format)
                }
            else -> return "No data found"
            }
        }
}