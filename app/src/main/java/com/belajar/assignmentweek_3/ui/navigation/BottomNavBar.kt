package com.belajar.assignmentweek_3.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomNavigationBar(
    screens: List<NavigationItem>,
    selectedItemIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    NavigationBar {
        screens.forEachIndexed { index, screen ->
            NavigationBarItem(
                icon = {
                    if (selectedItemIndex == index) {
                        Icon(screen.iconSelected, contentDescription = null)
                    } else {
                        Icon(screen.iconUnselected, contentDescription = null)
                    }
                },
                label = { Text(screen.title) },
                selected = selectedItemIndex == index,
                onClick = { onItemSelected(index) }
            )
        }
    }
}