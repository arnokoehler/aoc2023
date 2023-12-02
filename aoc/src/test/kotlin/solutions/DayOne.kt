package solutions

import nl.arnokoel.solutions.DayOne
import nl.arnokoel.FileUtils.Companion.getLines
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DayOneTest {

    @Test
    fun `Valide test set`() {
        val lines = getLines("day-one-training-set.txt")
        val dayOne = DayOne(lines)

        assertEquals(12, dayOne.calculateCalibrationValue(lines[0]))
        assertEquals(38, dayOne.calculateCalibrationValue(lines[1]))
        assertEquals(15, dayOne.calculateCalibrationValue(lines[2]))
        assertEquals(77, dayOne.calculateCalibrationValue(lines[3]))
        assertEquals(142, dayOne.calculateCalibrationValueForDocument())
    }

    @Test
    fun `Validate part two test set`() {
        val lines = getLines("day-one-second-test-set.txt")
        val dayOne = DayOne(lines)

        assertEquals(29, dayOne.calculateCalibrationValueSecondStyle(lines[0]))
        assertEquals(83, dayOne.calculateCalibrationValueSecondStyle(lines[1]))
        assertEquals(13, dayOne.calculateCalibrationValueSecondStyle(lines[2]))
        assertEquals(24, dayOne.calculateCalibrationValueSecondStyle(lines[3]))
        assertEquals(42, dayOne.calculateCalibrationValueSecondStyle(lines[4]))
        assertEquals(14, dayOne.calculateCalibrationValueSecondStyle(lines[5]))
        assertEquals(76, dayOne.calculateCalibrationValueSecondStyle(lines[6]))
        assertEquals(281, dayOne.calculateCalibrationValueSecondStyleForDocument())
    }
}