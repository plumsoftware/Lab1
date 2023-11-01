package ru.plumsoftware.lab1.presentation.tags

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.ui.theme.color.tagColor
import ru.plumsoftware.lab1.ui.theme.color.tagTextColor
import ru.plumsoftware.lab1.ui.theme.size.Units
import ru.plumsoftware.lab1.utilities.showToast

@Composable
fun Tag(item: String) {
    Button(
        onClick = { showToast("") },
        colors = ButtonDefaults.buttonColors(
            containerColor = tagColor,
            contentColor = tagTextColor
        ),
        shape = MaterialTheme.shapes.extraLarge,
        contentPadding = PaddingValues(
            horizontal = Units.Spaces.extraSmallPadding,
            vertical = Units.Spaces.headItemSpacer
        )
    ) {
        Text(text = item, style = MaterialTheme.typography.bodySmall)
    }
}

@Preview(showSystemUi = true, showBackground = true, name = "Tag")
@Composable
private fun Tag() {
    Tag("example text")
}