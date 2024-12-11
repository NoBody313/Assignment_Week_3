package com.belajar.assignmentweek_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.belajar.assignmentweek_3.ui.pages.home.HomeScreen
import com.belajar.assignmentweek_3.ui.theme.AssignmentWeek3Theme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AssignmentWeek3Theme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = HomeScreen
                ){
                    composable<HomeScreen> {
                        HomeScreen()
                    }
                }
            }
        }
    }
}

@Serializable
object HomeScreen