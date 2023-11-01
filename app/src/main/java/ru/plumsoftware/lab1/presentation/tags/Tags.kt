package ru.plumsoftware.lab1.presentation.tags

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.ui.theme.color.tagColor
import ru.plumsoftware.lab1.ui.theme.color.tagTextColor
import ru.plumsoftware.lab1.ui.theme.size.Units
import ru.plumsoftware.lab1.utilities.showToast

@Composable
fun Tags(list: List<String>) {
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(
            space = Units.Spaces.smallPadding,
            alignment = Alignment.Start
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(list) { item ->
            Tag(item = item)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Tags() {
    Tags(
        list = listOf(
            "MOBA",
            "MULTIPLAYER",
            "STRATEGY"
        )
    )
}