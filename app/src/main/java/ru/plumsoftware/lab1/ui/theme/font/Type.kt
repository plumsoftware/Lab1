package ru.plumsoftware.lab1.ui.theme.font

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import ru.plumsoftware.lab1.ui.theme.size.Units

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = getRegularFont(),
        fontWeight = Units.TextWeight._700,
        fontSize = Units.TextSize._20sp,
        lineHeight = Units.LineHeight.titleLarge,
        letterSpacing = Units.LetterSpacing.mediumLetterSpacing
    ), //Install, DoTA 2
    titleMedium = TextStyle(
        fontFamily = getRegularFont(),
        fontWeight = Units.TextWeight._700,
        fontSize = Units.TextSize._16sp,
        lineHeight = Units.LineHeight.titleMedium,
        letterSpacing = Units.LetterSpacing.mediumLetterSpacing
    ), //Review & Ratings
    titleSmall = TextStyle(
        fontFamily = getRegularFont(),
        fontWeight = Units.TextWeight._400,
        fontSize = Units.TextSize._16sp,
        lineHeight = Units.LineHeight.titleSmall,
        letterSpacing = Units.LetterSpacing.defaultLetterSpacing
    ), //Auguste Conte
    labelLarge = TextStyle(
        fontFamily = getRegularFont(),
        fontWeight = Units.TextWeight._700,
        fontSize = Units.TextSize._48sp,
        lineHeight = Units.LineHeight.labelLarge,
        letterSpacing = Units.LetterSpacing.defaultLetterSpacing
    ), //4.9
    bodyMedium = TextStyle(
        fontFamily = getRegularFont(),
        fontWeight = Units.TextWeight._400,
        fontSize = Units.TextSize._12sp,
        lineHeight = Units.LineHeight.bodyMedium,
        letterSpacing = Units.LetterSpacing.defaultLetterSpacing
    ), //Almost whole text on page
    bodySmall = TextStyle(
        fontFamily = getRegularFont(),
        fontWeight = Units.TextWeight._500,
        fontSize = Units.TextSize._10sp,
        lineHeight = Units.LineHeight.bodySmall,
        letterSpacing = Units.LetterSpacing.defaultLetterSpacing
    )
)