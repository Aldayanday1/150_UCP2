package project.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import project.ucp2.data.FormUiState

@Composable
fun HalamanDua(
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair(stringResource(R.string.dospemsatu), FormUiState.),

        )
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        )
        {
            Column {
                Text(text = stringResource (id = R.string.nama), fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
                Text(text = formUiState.nama)
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
                Divider(thickness = dimensionResource(R.dimen.thickness_divider))
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))

                Text(text = stringResource(id = R.string.konsentrasi),fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
                Text(text = formUiState.tlp)
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
                Divider(thickness = dimensionResource(R.dimen.thickness_divider))
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))

                Text(text = stringResource(id = R.string.judul), fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
                Text(text = formUiState.alamat)
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
                Divider(thickness = dimensionResource(R.dimen.thickness_divider))
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
            }
        }
    }
}

