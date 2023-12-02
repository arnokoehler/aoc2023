package solutions

import nl.arnokoel.FileUtils
import nl.arnokoel.solutions.DayTwo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DayTwoTest {

    @Test
    fun `should read color and counts`() {
        val actual = DayTwo().calculateWhatGamesArePossible(FileUtils.getLines("day-two-training-set.txt"))
        assertNotNull(actual)
    }
}