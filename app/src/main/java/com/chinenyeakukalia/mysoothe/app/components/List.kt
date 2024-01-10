package com.chinenyeakukalia.mysoothe.app.components

import android.content.ClipData.Item
import android.graphics.drawable.DrawableContainer
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.graphics.drawable.toDrawable
import com.chinenyeakukalia.mysoothe.R
import com.chinenyeakukalia.mysoothe.app.components.imagecollection.AlignYourBodyElement


 val alignYourBodyData = listOf(
        R.drawable.yoga_1 to R.string.ab1_inversion,
        R.drawable.yoga3 to R.string.quick_yoga,
        R.drawable.yoga4 to R.string.stretching,
        R.drawable.tabata to R.string.tabata,
        R.drawable.hiit to R.string.hiit,
        R.drawable.pre_natal to R.string.pre_natal_yoga).map{ DrawableStringPair(it.first, it.second) }

val favoriteCollectionsData = listOf(
    R.drawable.nature1 to R.string.short_mantras,
    R.drawable.nature to R.string.nature_meditation,
    R.drawable.massage to R.string.self_massage,
    R.drawable.relax to R.string.stress_anxiety,
    R.drawable.cloud to R.string.overwhelmed,
    R.drawable.night to R.string.night_down). map { DrawableStringPair(it.first, it.second)  }

data class DrawableStringPair(
        @DrawableRes val drawable: Int,
        @StringRes val text: Int
)