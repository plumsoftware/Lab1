package ru.plumsoftware.lab1.ui.theme.shape

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import ru.plumsoftware.lab1.ui.theme.size.Units

val Shapes = Shapes(
//    extraLarge = RoundedCornerShape(size = 32.dp),
//    large = RoundedCornerShape(size = 24.dp),
    medium = RoundedCornerShape(size = Units.WidgetSize.promoRadius), //Promo
    small = RoundedCornerShape(size = Units.WidgetSize.buttonRadius), //Button
//    extraSmall = RoundedCornerShape(size = 4.dp)
)