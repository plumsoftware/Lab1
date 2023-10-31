package ru.plumsoftware.lab1.presentation.reviews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R
import ru.plumsoftware.lab1.models.ReviewModel
import ru.plumsoftware.lab1.ui.theme.color.dividerColor
import ru.plumsoftware.lab1.ui.theme.size.Units

@Composable
fun Reviews(list: List<ReviewModel>) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.reviewTitle),
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Start,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(height = Units.Spaces.defaultPadding))
        for (index in list.indices) {
            if (index != 0)
                Spacer(modifier = Modifier.height(height = Units.Spaces.defaultPadding))
            ReviewItem(reviewModel = list[index])
            Spacer(modifier = Modifier.height(height = Units.Spaces.defaultPadding))
            Divider(
                modifier = Modifier
                    .height(height = Units.Spaces.dividerHeight)
                    .background(color = dividerColor)
                    .fillMaxWidth(fraction = 0.7f)
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true, name = "Reviews")
@Composable
private fun Reviews() {
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
}