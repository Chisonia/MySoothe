package com.chinenyeakukalia.mysoothe

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import com.chinenyeakukalia.mysoothe.app.components.orientation.MySootheAppLandscape
import com.chinenyeakukalia.mysoothe.app.components.orientation.MySootheAppPortrait

@Composable
fun MySootheApp(windowSize: WindowSizeClass){
    when(windowSize.widthSizeClass){
        WindowWidthSizeClass.Compact -> {
            MySootheAppPortrait()
        }
        WindowWidthSizeClass.Expanded -> {
            MySootheAppLandscape()
        }
    }
}