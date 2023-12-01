import nl.arnokoel.DayOne
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

}