package com.chinenyeakukalia.mysoothe.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chinenyeakukalia.mysoothe.R
import com.chinenyeakukalia.mysoothe.app.components.HomeSection
import com.chinenyeakukalia.mysoothe.app.components.SearchBar
import com.chinenyeakukalia.mysoothe.app.components.scrolling.AlignYourBodyRow
import com.chinenyeakukalia.mysoothe.app.components.scrolling.FavoriteCollectionGrid
import com.chinenyeakukalia.mysoothe.ui.theme.MySootheTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column (
        modifier.verticalScroll(rememberScrollState())
    ){
        Spacer(Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(
            title = R.string.align_your_body) {
            AlignYourBodyRow()
        }
        HomeSection(
            title = R.string.favorite_collections) {
            FavoriteCollectionGrid()
        }
        Spacer(Modifier.height(16.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE, heightDp = 180)
@Composable
fun ScreenContentPreview(){
    MySootheTheme {
        HomeScreen()
    }
}