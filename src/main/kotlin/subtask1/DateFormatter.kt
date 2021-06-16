package subtask1


import java.lang.Exception
import java.time.LocalDateTime
import java.time.format.TextStyle
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        try {
            val date = LocalDateTime.of(year.toInt(), month.toInt(), day.toInt(), 0, 0)
            val month = date.month.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))
            val day = date.dayOfWeek.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))
            return "${date.dayOfMonth} $month, $day"
        } catch (e: Exception) {
            return "Такого дня не существует"
        }
    }
}
