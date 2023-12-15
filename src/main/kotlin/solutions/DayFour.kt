package nl.arnokoel.solutions

import java.util.*
import kotlin.math.pow

class DayFour {

    fun getList(input: List<String>): List<Card> {
        return getCards(input)
    }

    fun getListDayTwo(input: List<String>): Int {
        val queue: Queue<Card> = LinkedList()
        val cards = getCards(input)

        cards.map { queue.add(it) }

        return processQueue(cards, queue)
    }

    private fun processQueue(originalCards: List<Card>, queue: Queue<Card>): Int {
        var counter = 0
        while (queue.isNotEmpty()) {
            val peek = queue.poll()
            println("card: $peek counter $counter")
            val currentIndex = originalCards.indexOf(peek)
            val nextIndex = currentIndex + 1
            val fromIndex = if (nextIndex > originalCards.size) originalCards.size else nextIndex
            val scorePlusCurrentIndex = nextIndex + peek.score
            val correctedNextIndex = if (scorePlusCurrentIndex > originalCards.size) originalCards.size else scorePlusCurrentIndex
            val elements = originalCards.subList(fromIndex, correctedNextIndex)
            println("adding ${elements.size} cards to the queue ${queue.size}")
            queue.addAll(elements)
            if (queue.isNotEmpty()) {
                counter++
            }
        }
        println("counter $counter")
        return counter
    }


    private fun getCards(input: List<String>): List<Card> {
        return input.map { name ->
            val split = name.split(":")
            assert(split.size == 2)

            val numbers = split[1].split("|")
            assert(numbers.size == 2)

            Card(split[0], numbers[0].toNumbers(), numbers[1].toNumbers())
        }
    }

}


class Card(private val name: String, private val winningNumbers: List<Int>, private val yourNumbers: List<Int>) {

    val score: Int
        get() = calculateScore(getNumberOfMatchingNumbers())

    private fun getNumberOfMatchingNumbers() = winningNumbers.intersect(yourNumbers).count()

    private fun calculateScore(i: Int): Int = when (i) {
        0 -> 0
        1 -> 1
        else -> 2.0.pow(i - 1).toInt()
    }

    override fun toString(): String {
        return "$name - $winningNumbers - $yourNumbers"
    }
}

fun String.toNumbers() = this.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }