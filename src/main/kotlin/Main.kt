package nl.arnokoel

import nl.arnokoel.solutions.DayFour

fun main() {
    val cards = DayFour().getList(FileUtils.getLines("day-four-set.txt"))
    val score = cards.sumOf { it.score }
    println("Day four part one: $score")
}