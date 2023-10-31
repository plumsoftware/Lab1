package ru.plumsoftware.lab1.presentation.reviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R
import ru.plumsoftware.lab1.models.ReviewModel
import ru.plumsoftware.lab1.ui.theme.color.reviewColor
import ru.plumsoftware.lab1.ui.theme.size.Units
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun ReviewItem(reviewModel: ReviewModel) {
    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = Units.Spaces.reviewItemSpacer,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .wrapContentWidth()
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(
                space = Units.Spaces.reviewItemSpacer,
                alignment = Alignment.CenterHorizontally
            )
        ) {
            Image(
                painter = painterResource(id = reviewModel.reviewIconId),
                contentDescription = stringResource(
                    id = R.string.review
                ),
                modifier = Modifier
                    .size(size = Units.WidgetSize.reviewerSize)
                    .clip(shape = MaterialTheme.shapes.large)
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(
                    space = Units.Spaces.reviewerItemSpacer,
                    alignment = Alignment.CenterVertically
                ),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = reviewModel.reviewer, style = MaterialTheme.typography.titleSmall)
                Text(
                    text = SimpleDateFormat("dd MMMM, yyyy", Locale.getDefault()).format(
                        Date(
                            reviewModel.reviewDate
                        )
                    ), style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
                    )
                )
            }
        }

        Text(
            text = reviewModel.reviewText,
            style = MaterialTheme.typography.bodyMedium.copy(color = reviewColor)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Review item")
@Composable
private fun ReviewItem() {
    ReviewItem(
        reviewModel = ReviewModel(
            reviewIconId = R.drawable.reviewer1,
            reviewer = stringResource(id = R.string.reviewer1),
            reviewDate = System.currentTimeMillis(),
            reviewText = stringResource(id = R.string.reviewText)
        )
    )
}