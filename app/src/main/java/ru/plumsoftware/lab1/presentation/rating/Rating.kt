package ru.plumsoftware.lab1.presentation.rating

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R
import ru.plumsoftware.lab1.ui.theme.size.Units

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Rating() {
    Image(
        painter = painterResource(id = R.drawable.stars),
        contentDescription = stringResource(
            id = R.string.dota_stars
        ),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(size = Units.WidgetSize.starsSize)
    )
}