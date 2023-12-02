package nl.arnokoel.solutions

class DayOne(val lines: List<String>) {

    fun calculateCalibrationValueForDocument(): Int {
        return lines.map { calculateCalibrationValue(it) }.sum()
    }

    fun calculateCalibrationValue(input: String): Int {
        val numbersOnly = input.filter { it.isDigit() }
        val firstDigit = numbersOnly[0].toString().toInt()
        val lastDigit = numbersOnly[numbersOnly.length - 1].toString().toInt()
        return "$firstDigit$lastDigit".toInt()
    }

    fun calculateCalibrationValueSecondStyleForDocument(): Int {
        return lines.map { calculateCalibrationValueSecondStyle(it) }.sum()
    }

    fun calculateCalibrationValueSecondStyle(input: String): Int {
        val numbersOnly = input.replaceWordsWithNumber().filter { it.isDigit() }
        val firstDigit = numbersOnly[0].toString().toInt()
        val lastDigit = numbersOnly[numbersOnly.length - 1].toString().toInt()
        return "$firstDigit$lastDigit".toInt()
    }

}

fun String.replaceWordsWithNumber() =
    this.replace("one", "on1e")
        .replace("two", "t2wo")
        .replace("three", "th3ree")
        .replace("four", "fo4ur")
        .replace("five", "fi5ve")
        .replace("six", "s6ix")
        .replace("seven", "s7even")
        .replace("eight", "ei8ght")
        .replace("nine", "ni9ne")
        .replace("zero", "z0ero")
