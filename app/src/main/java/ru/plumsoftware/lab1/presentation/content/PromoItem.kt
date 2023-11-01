package ru.plumsoftware.lab1.presentation.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R
import ru.plumsoftware.lab1.models.PromoModel
import ru.plumsoftware.lab1.presentation.buttons.VideoButton
import ru.plumsoftware.lab1.ui.theme.size.Units

@Composable
fun PromoItem(promoModel: PromoModel) {
    Box(contentAlignment = Alignment.Center) {
        Card(
            modifier = Modifier.wrapContentSize(),
            shape = MaterialTheme.shapes.medium
        ) {
            Image(
                painter = painterResource(id = promoModel.promoResId),
                contentDescription = stringResource(
                    id = R.string.promo
                ),
                modifier = Modifier
                    .size(size = Units.WidgetSize.promoSize),
                contentScale = ContentScale.FillBounds
            )
        }
        if(promoModel.promoResId == R.drawable.promo1)
            VideoButton()
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun PromoItem() {
    PromoItem(promoModel = PromoModel(promoResId = R.drawable.promo1))
}