package solutions

import nl.arnokoel.FileUtils
import nl.arnokoel.solutions.DayFour
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayFourTest {

    @Test
    fun `should score cards and calculate`() {
        val cards = DayFour().getList(FileUtils.getLines("day-four-training-set.txt"))
        assertEquals(13, cards.sumOf { it.score })
    }
}