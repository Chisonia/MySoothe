package com.chinenyeakukalia.mysoothe.app.components.scrolling
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chinenyeakukalia.mysoothe.app.components.alignYourBodyData
import com.chinenyeakukalia.mysoothe.app.components.imagecollection.AlignYourBodyElement
import com.chinenyeakukalia.mysoothe.ui.theme.MySootheTheme

@Composable
fun AlignYourBodyRow(modifier: Modifier = Modifier
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ){
        items(alignYourBodyData){ item ->
            AlignYourBodyElement(item.drawable, item.text)
        }
    }
    /*Row (
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
    ){
        AlignYourBodyElement(
            drawable = R.drawable.yoga_1,
            text = R.string.ab1_inversion,
            modifier = Modifier.padding(8.dp))
        AlignYourBodyElement1(
            drawable = R.drawable.yoga3,
            text = R.string.quick_yoga,
            modifier = Modifier.padding(8.dp)
        )
        AlignYourBodyElement2(
            drawable = R.drawable.yoga4,
            text = R.string.stretching,
            modifier = Modifier.padding(8.dp)
        )
        AlignYourBodyElement3(
            drawable = R.drawable.tabata,
            text = R.string.tabata,
            modifier = Modifier.padding(8.dp)
        )
        AlignYourBodyElement4(
            drawable = R.drawable.hiit,
            text = R.string.hiit,
            modifier = Modifier.padding(8.dp)
        )
        AlignYourBodyElement5(
            drawable = R.drawable.pre_natal,
            text = R.string.pre_natal_yoga,
            modifier = Modifier.padding(8.dp)
        )
    }*/
}
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun AlignYourBodyRowPreview(){
    MySootheTheme {
        AlignYourBodyRow()
    }
}