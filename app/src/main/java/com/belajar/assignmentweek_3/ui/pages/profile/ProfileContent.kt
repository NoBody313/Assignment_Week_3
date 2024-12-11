package com.belajar.assignmentweek_3.ui.pages.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.belajar.assignmentweek_3.ui.theme.plusJakartaSans

@Composable
fun ProfileContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Profile",
            fontFamily = plusJakartaSans,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp
        )
    }
}