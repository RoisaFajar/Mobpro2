package org.d3if4501.mobpro2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.firebase.auth.FirebaseUser
import org.d3if4501.mobpro2.ui.screen.detail.DetailScreen
import org.d3if4501.mobpro2.ui.screen.detail.KEY_ID_KELAS
import org.d3if4501.mobpro2.ui.screen.detail.KEY_NAMA_KELAS
import org.d3if4501.mobpro2.ui.screen.main.MainScreen

@Composable
fun SetupNavGraph(
    user : FirebaseUser,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route){
            MainScreen(navController, user)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(KEY_ID_KELAS) { type = NavType.StringType},
                navArgument(KEY_NAMA_KELAS) { type = NavType.StringType}
            )
        ) { NavBackStackEntry ->
            val args = NavBackStackEntry.arguments
            val id = args?.getString(KEY_ID_KELAS) ?: ""
            val nama = args?.getString(KEY_NAMA_KELAS) ?: ""
            DetailScreen(navController, id, nama)
        }
    }
}
