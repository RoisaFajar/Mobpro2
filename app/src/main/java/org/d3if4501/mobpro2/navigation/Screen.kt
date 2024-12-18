package org.d3if4501.mobpro2.navigation

import org.d3if4501.mobpro2.ui.screen.detail.KEY_ID_KELAS
import org.d3if4501.mobpro2.ui.screen.detail.KEY_NAMA_KELAS
import org.d3if4501.mobpro2.ui.screen.main.MainScreen

sealed class Screen(val route: String) {
    data object Home: Screen ("MainScreen")

    data object Detail : Screen(
        "detailScreen/{$KEY_ID_KELAS}/{$KEY_NAMA_KELAS}"
    ) {
        fun withData(id : String, nama : String) = "detailScreen/$id/$nama"
    }
}