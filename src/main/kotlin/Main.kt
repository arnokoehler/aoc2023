package nl.arnokoel

import nl.arnokoel.solutions.DayFour

fun main() {
    val score = DayFour().getListDayTwo(FileUtils.getLines("day-four-second-set.txt"))
    println("Day four part one: $score")
}