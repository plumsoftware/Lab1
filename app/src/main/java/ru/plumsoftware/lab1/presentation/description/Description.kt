package ru.plumsoftware.lab1.presentation.description

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R

@Composable
fun Description(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun Description() {
    Description(text = stringResource(id = R.string.description))
}