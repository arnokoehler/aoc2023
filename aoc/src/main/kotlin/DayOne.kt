package nl.arnokoel

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
}
