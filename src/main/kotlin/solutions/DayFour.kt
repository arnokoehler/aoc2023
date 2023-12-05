package nl.arnokoel.solutions

import kotlin.math.pow

class DayFour {

    fun getList(input: List<String>): List<Card> {
        return input.map {
            val split = it.split(":")
            assert(split.size == 2)

            val numbers = split[1].split("|")
            assert(numbers.size == 2)

            Card(split[0], numbers[0].toNumbers(), numbers[1].toNumbers())
        }
    }

}


class Card(val Name: String, val winningNumbers: List<Int>, val yourNumbers: List<Int>) {

    val score: Int
        get() = calculateScore(getNumberOfMatchingNumbers())

    private fun getNumberOfMatchingNumbers() = winningNumbers.intersect(yourNumbers).count()

    private fun calculateScore(i: Int): Int = when (i) {
        0 -> 0
        1 -> 1
        else -> 2.0.pow(i - 1).toInt()
    }
}

class DayTwoCard(val Name: String, val winningNumbers: List<Int>, val yourNumbers: List<Int>) {
    val matches: Int get() = winningNumbers.intersect(yourNumbers.toSet()).count()

}

fun String.toNumbers() = this.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }