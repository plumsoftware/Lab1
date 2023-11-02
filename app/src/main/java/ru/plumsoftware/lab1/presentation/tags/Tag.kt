package ru.plumsoftware.lab1.presentation.tags

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.ui.theme.color.tagColor
import ru.plumsoftware.lab1.ui.theme.color.tagTextColor
import ru.plumsoftware.lab1.ui.theme.size.Units
import ru.plumsoftware.lab1.utilities.showToast

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Tag(item: String) {
    AssistChip(
        onClick = {
            showToast("")
        },
        border = AssistChipDefaults.assistChipBorder(
            borderColor = tagColor
        ),
        label = {
            Text(
                text = item,
                style = MaterialTheme.typography.bodySmall.copy(color = tagTextColor),
                modifier = Modifier.padding(
                    PaddingValues(
                        horizontal = Units.Spaces.extraSmallPadding,
                        vertical = Units.Spaces.headItemSpacer
                    )
                )
            )
        },
        colors = AssistChipDefaults.assistChipColors(
            containerColor = tagColor,
        ),
        shape = MaterialTheme.shapes.extraLarge
    )
}

@Preview(showSystemUi = true, showBackground = true, name = "Tag")
@Composable
private fun Tag() {
    Tag("example text")
}