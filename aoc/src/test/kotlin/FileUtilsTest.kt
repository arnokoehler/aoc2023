import nl.arnokoel.FileUtils.Companion.getLines
import nl.arnokoel.FileUtils.Companion.getTextFromFile
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FileUtilsTest {

    @Test
    fun `Should read text from file`() {
        val read = getTextFromFile("day-one-training-set.txt")
        assertEquals("1abc2", read.split("\n").first())
    }

    @Test
    fun `Should read text from file with spaces`() {
        val read = getLines("day-one-training-set.txt")
        assertEquals("1abc2", read.first())
    }
}