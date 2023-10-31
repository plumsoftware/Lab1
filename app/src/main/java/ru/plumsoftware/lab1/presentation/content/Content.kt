package ru.plumsoftware.lab1.presentation.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R
import ru.plumsoftware.lab1.models.PromoModel
import ru.plumsoftware.lab1.presentation.description.Description
import ru.plumsoftware.lab1.presentation.buttons.PrimaryButton
import ru.plumsoftware.lab1.presentation.head.Head
import ru.plumsoftware.lab1.ui.theme.size.Units

@Preview(showBackground = true, showSystemUi = true, name = "Main content")
@Composable
fun Content() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Head()
        Column(
            verticalArrangement = Arrangement.spacedBy(
                space = Units.Spaces.contentSpacer,
                alignment = Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = Units.Spaces.defaultPadding)
        ) {
            Description(text = stringResource(id = R.string.description))
            PromoContent(
                promoList = listOf(
                    PromoModel(promoResId = R.drawable.promo1),
                    PromoModel(promoResId = R.drawable.promo2),
                    PromoModel(promoResId = R.drawable.promo3)
                )
            )
            PrimaryButton()
        }
    }
}