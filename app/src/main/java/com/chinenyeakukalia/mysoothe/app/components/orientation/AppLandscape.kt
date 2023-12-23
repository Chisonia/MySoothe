package com.chinenyeakukalia.mysoothe.app.components.orientation

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.chinenyeakukalia.mysoothe.screens.HomeScreen
import com.chinenyeakukalia.mysoothe.ui.theme.MySootheTheme

@Composable
fun MySootheAppLandscape(){
    MySootheTheme {
        Surface (color = MaterialTheme.colorScheme.background){
            Row{
                SootheNavigationRail()
                HomeScreen()
            }
        }
    }
}
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun MySootheAppLandscapePreview() {
    MySootheTheme {
        MySootheAppLandscape()
    }
}