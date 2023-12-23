package com.chinenyeakukalia.mysoothe.app.components.orientation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chinenyeakukalia.mysoothe.screens.HomeScreen
import com.chinenyeakukalia.mysoothe.ui.theme.MySootheTheme

@Composable
fun MySootheAppPortrait(){
    MySootheTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ){ padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun MySootheAppPortraitPreview() {
    MySootheTheme {
        MySootheAppPortrait()
    }
}