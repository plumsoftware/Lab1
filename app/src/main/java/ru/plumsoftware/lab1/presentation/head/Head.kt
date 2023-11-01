package ru.plumsoftware.lab1.presentation.head

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R
import ru.plumsoftware.lab1.presentation.rating.Rating
import ru.plumsoftware.lab1.ui.theme.size.Units

@Preview(showBackground = true, showSystemUi = true, name = "Head")
@Composable
fun Head() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = Units.Spaces.defaultPadding)
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
            horizontalArrangement = Arrangement.spacedBy(
                space = Units.Spaces.headLogoItemSpacer,
                alignment = Alignment.Start
            ),
            modifier = Modifier
                .wrapContentHeight()
                .align(alignment = Alignment.BottomStart)
        ) {
            Spacer(modifier = Modifier.width(width = Units.Spaces.smallPadding))
            Card(
                modifier = Modifier
                    .wrapContentSize(),
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
                        .size(size = Units.WidgetSize.logoSize)
                        .padding(all = Units.Spaces.imagePadding),
                    painter = painterResource(id = R.drawable.dota2_logo),
                    contentDescription = stringResource(
                        id = R.string.dota_logo
                    )
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(
                    space = Units.Spaces.headItemSpacer,
                    alignment = Alignment.CenterVertically
                ), horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = R.string.dota_name),
                    style = MaterialTheme.typography.titleLarge
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(
                        space = Units.Spaces.headRatingItemSpacer,
                        alignment = Alignment.Start
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Rating()
                    Text(
                        text = stringResource(id = R.string._70m),
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(width = Units.Spaces.smallPadding))

        }
    }
}