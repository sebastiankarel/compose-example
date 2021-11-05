package de.freenet.composeexample

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")

    fun withArgs(map: Map<String, String>): String {
        return buildString {
            append(route)
            map.forEach { entry ->
                append("?${entry.key}=${entry.value}")
            }
        }
    }
}
