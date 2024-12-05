package org.d3if4501.mobpro2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.d3if4501.mobpro2.ui.screen.app.DosenApp
import org.d3if4501.mobpro2.ui.theme.Mobpro2Theme
import org.d3if4501.mobpro2.ui.theme.Mobpro2Theme
import org.d3if4501.mobpro2s.ui.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        DosenApp()

        }
    }
}



@Preview(showBackground = true)
@Composable
fun DosenAppPreview() {
    Mobpro2Theme {
        WelcomeScreen(
            appLogo = R.mipmap.ic_launcher,
            appName = R.string.app_name
        )
    }
}