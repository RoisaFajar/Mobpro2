package org.d3if4501.mobpro2.navigation

import org.d3if4501.mobpro2.ui.screen.main.MainScreen

sealed class Screen(val route: String) {
    data object Home: Screen ("MainScreen")
}