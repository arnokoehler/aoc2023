package nl.arnokoel
class FileUtils {
    companion object {
        fun getLines(s: String): List<String> {
            val textFromFile = this.getTextFromFile(s)
            return textFromFile.split("\n")
        }

        fun getTextFromFile(s: String): String {
            return this::class.java.classLoader.getResource(s)!!.readText()
        }
    }
}