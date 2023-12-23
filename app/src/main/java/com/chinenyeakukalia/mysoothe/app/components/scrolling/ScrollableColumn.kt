package com.chinenyeakukalia.mysoothe.app.components.scrolling

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chinenyeakukalia.mysoothe.R
import com.chinenyeakukalia.mysoothe.app.components.imagecardcollection.FavoriteCollectionCard
import com.chinenyeakukalia.mysoothe.app.components.imagecardcollection.FavoriteCollectionCard1
import com.chinenyeakukalia.mysoothe.app.components.imagecardcollection.FavoriteCollectionCard2
import com.chinenyeakukalia.mysoothe.app.components.imagecardcollection.FavoriteCollectionCard3
import com.chinenyeakukalia.mysoothe.app.components.imagecardcollection.FavoriteCollectionCard4
import com.chinenyeakukalia.mysoothe.app.components.imagecardcollection.FavoriteCollectionCard5
import com.chinenyeakukalia.mysoothe.ui.theme.MySootheTheme

@Composable
fun FavoriteCollectionGrid() {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
        ){
            FavoriteCollectionCard1(
                text = R.string.short_mantras,
                drawable = R.drawable.nature1,
                modifier = Modifier.padding(8.dp)
            )
            FavoriteCollectionCard(
                text = R.string.nature_meditation,
                drawable = R.drawable.nature,
                modifier = Modifier.padding(8.dp)
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
        ){
            FavoriteCollectionCard2(
                text = R.string.self_massage,
                drawable = R.drawable.massage,
                modifier = Modifier.padding(8.dp)
            )
            FavoriteCollectionCard3(
                text = R.string.stress_anxiety,
                drawable = R.drawable.relax,
                modifier = Modifier.padding(8.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            FavoriteCollectionCard4(
                text = R.string.overwhelmed,
                drawable = R.drawable.cloud,
                modifier = Modifier.padding(8.dp)
            )
            FavoriteCollectionCard5(
                text = R.string.night_down,
                drawable = R.drawable.night,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCollectionGridPreview(){
    MySootheTheme {
        FavoriteCollectionGrid()
    }
}