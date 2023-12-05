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

    fun getScore(input: List<String>): Int {
        val list = getList(input)
        return list.map { it.getScore() }.sum()
    }

}


class Card(val Name: String, val winningNumbers: List<Int>, val yourNumbers: List<Int>) {
    fun getScore(): Int = getNumberOfMatchingNumbers().toDouble().pow(2).toInt()

    private fun getNumberOfMatchingNumbers() = winningNumbers.intersect(yourNumbers).count()
}

fun String.toNumbers() = this.split(" ").filter{ it.isNotEmpty() }.map { it.toInt() }