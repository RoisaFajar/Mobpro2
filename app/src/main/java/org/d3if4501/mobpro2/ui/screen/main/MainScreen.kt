package org.d3if4501.mobpro2.ui.screen.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.firebase.auth.FirebaseUser
import org.d3if4501.mobpro2.R
import org.d3if4501.mobpro2s.ui.AppBarWithLogout
import org.d3if4501.mobpro2s.ui.UserProfileCard

@Composable
fun MainScreen(
    user: FirebaseUser
) {

    var showDialog by remember { mutableStateOf(false) }

    Scaffold (
        topBar = { AppBarWithLogout(R.string.app_name) },
        floatingActionButton = {
            FloatingActionButton(onClick = { showDialog = true }) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = stringResource(R.string.tambah_kelas),
                    tint = MaterialTheme.colorScheme.primary
                )
            }

        }
    ) { innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            UserProfileCard(user)
        }

        if (showDialog) {
            KelasDialog(onDismissRequest = { showDialog = false}) {
                showDialog = false
            }
        }
    }
}