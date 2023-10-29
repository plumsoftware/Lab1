package ru.plumsoftware.lab1.ui.theme.size

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object Units {

    object TextSize {
        val _10sp = 10.sp
        val _12sp = 12.sp
        val _16sp = 16.sp
        val _20sp = 20.sp
        val _48sp = 28.sp
    }

    object TextWeight {
        val _400 = FontWeight(400)
        val _500 = FontWeight(500)
        val _700 = FontWeight(700)
    }

    object LetterSpacing {
        val defaultLetterSpacing = 0.5.sp
        val mediumLetterSpacing = 0.6.sp
    }

    object LineHeight {
        val bodySmall = 12.19.sp
        val bodyMedium = 20.sp
        val labelLarge = 57.6.sp
        val titleSmall = 19.2.sp
        val titleMedium = 19.2.sp
        val titleLarge = 24.sp
    }

    object WidgetSize {
        val buttonRadius = 12.dp
        val promoRadius = 14.dp
    }
}