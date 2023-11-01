package ru.plumsoftware.lab1.presentation.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
import ru.plumsoftware.lab1.models.ReviewModel
import ru.plumsoftware.lab1.presentation.description.Description
import ru.plumsoftware.lab1.presentation.buttons.PrimaryButton
import ru.plumsoftware.lab1.presentation.head.Head
import ru.plumsoftware.lab1.presentation.reviews.Reviews
import ru.plumsoftware.lab1.presentation.tags.Tags
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
            Tags(
                list = listOf(
                    stringResource(id = R.string.tag1),
                    stringResource(id = R.string.tag2),
                    stringResource(id = R.string.tag3)
                )
            )
            Description(text = stringResource(id = R.string.description))
            PromoContent(
                promoList = listOf(
                    PromoModel(promoResId = R.drawable.promo1),
                    PromoModel(promoResId = R.drawable.promo2),
                    PromoModel(promoResId = R.drawable.promo3)
                )
            )
            Reviews(
                list = listOf(
                    ReviewModel(
                        reviewIconId = R.drawable.reviewer1,
                        reviewer = stringResource(id = R.string.reviewer1),
                        reviewDate = System.currentTimeMillis(),
                        reviewText = stringResource(
                            id = R.string.reviewText
                        )
                    ),
                    ReviewModel(
                        reviewIconId = R.drawable.reviewer2,
                        reviewer = stringResource(id = R.string.reviewer2),
                        reviewDate = System.currentTimeMillis(),
                        reviewText = stringResource(
                            id = R.string.reviewText
                        )
                    )
                )
            )
            PrimaryButton()
            Spacer(modifier = Modifier.height(height = Units.Spaces.smallPadding))
        }
    }
}