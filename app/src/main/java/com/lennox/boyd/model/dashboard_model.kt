package com.lennox.boyd.model

import android.graphics.drawable.Icon
import android.icu.text.CaseMap.Title
import android.text.style.LineBackgroundSpan
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue

data class DashboardStat(
    val title: String,
    val value: String,
    val icon: ImageVector,
    val background:Color
)
data class QuickAction(
    val title: String,
    val icon: ImageVector
)