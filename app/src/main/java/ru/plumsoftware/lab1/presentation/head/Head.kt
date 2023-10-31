package ru.plumsoftware.lab1.presentation.head

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R
import ru.plumsoftware.lab1.ui.theme.size.Units

@Preview(showBackground = true, showSystemUi = true, name = "Head")
@Composable
fun Head() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = Units.Spaces.headSpacer)
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota2_banner),
            contentDescription = stringResource(
                id = R.string.dota_banner
            ),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(height = Units.WidgetSize.bannerSize)
                .padding(bottom = Units.Spaces.headSpacer)
        )

        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(alignment = Alignment.BottomStart)
        ) {
            Card(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(all = Units.Spaces.imagePadding),
                border = BorderStroke(
                    width = Units.Spaces.borderWidth,
                    color = MaterialTheme.colorScheme.surfaceVariant
                ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                shape = MaterialTheme.shapes.medium
            ) {
                Image(
                    modifier = Modifier
                        .size(size = Units.WidgetSize.logoSize),
                    painter = painterResource(id = R.drawable.dota2_logo),
                    contentDescription = stringResource(
                        id = R.string.dota_logo
                    )
                )
            }
        }
    }
}