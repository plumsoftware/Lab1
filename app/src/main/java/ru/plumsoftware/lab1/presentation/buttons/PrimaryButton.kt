package ru.plumsoftware.lab1.presentation.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.plumsoftware.lab1.R
import ru.plumsoftware.lab1.ui.theme.size.Units
import ru.plumsoftware.lab1.utilities.showToast

@Preview(showBackground = true, showSystemUi = true, name = "Night Mode")
@Composable
fun PrimaryButton() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        contentPadding = PaddingValues(all = Units.Spaces.buttonPadding),
        onClick = { showToast("") }
    ) {
        Text(
            text = stringResource(id = R.string.install),
            style = MaterialTheme.typography.titleLarge
        )
    }
}