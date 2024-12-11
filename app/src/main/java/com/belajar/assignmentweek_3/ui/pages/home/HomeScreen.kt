package com.belajar.assignmentweek_3.ui.pages.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.belajar.assignmentweek_3.ui.navigation.BottomNavigationBar
import com.belajar.assignmentweek_3.ui.navigation.NavigationItem
import com.belajar.assignmentweek_3.ui.pages.profile.ProfileContent
import com.belajar.assignmentweek_3.ui.pages.settings.SettingsContent

@Composable
fun HomeScreen() {
    val screens = listOf(
        NavigationItem("Home", Icons.Filled.Home, Icons.Outlined.Home),
        NavigationItem("Profile", Icons.Filled.Person, Icons.Outlined.Person),
        NavigationItem("Settings", Icons.Filled.Settings, Icons.Outlined.Settings)
    )

    var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                screens = screens,
                selectedItemIndex = selectedItemIndex,
                onItemSelected = { selectedItemIndex = it }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .padding(16.dp)
            ) {
                when (selectedItemIndex) {
                    0 -> HomeContent()
                    1 -> ProfileContent()
                    2 -> SettingsContent()
                }
            }
        }
    )
}