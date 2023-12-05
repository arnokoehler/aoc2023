package nl.arnokoel.solutions

class DayTwo {

    fun calculateWhatGamesArePossible(games: List<String>): Any = games.map { line ->
        val parts = line.split(":")
        val gameNumber = parts[0].trim()

        val sets = getSets(parts)
        val cubes = getCubesFromSet(sets)
        val pairs = cubes.map { it.map { pair(it) } }

        // todo flatmap to number of same color per gameNumber


        return pairs
    }

    private fun getCubesFromSet(sets: List<String>): List<List<String>> {
        return sets.map { it.split(",") }
    }

    private fun getSets(parts: List<String>) = parts[1].split(";").map { it.trim() }

    private fun pair(it: String): Pair<String, String> {
        val cube = it.split(" ")
        if (cube.size != 2) {
            return Pair(cube[1], cube[2])
        }
        return Pair(cube[0], cube[1])
    }
}