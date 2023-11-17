package project.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    pilihanForm: List<String>,
    onSelectionChanged: (String) -> Unit,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
) {
    var namaTxt by remember {
        mutableStateOf("")
    }
    var nimTxt by remember {
        mutableStateOf("")
    }
    var konsentrasiTxt by remember {
        mutableStateOf("")
    }
    var judulskripsi by remember {
        mutableStateOf("")
    }
    var dospemsatu by remember {
        mutableStateOf("")
    }
    var dospemdua by remember {
        mutableStateOf("")
    }
    var listData: MutableList<String> =
        mutableListOf(namaTxt, nimTxt, konsentrasiTxt, judulskripsi, dospemsatu, dospemdua)
    var pilihandosen by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {

        Spacer(modifier = Modifier.height(125.dp))

        Text(text = "Data Pelanggan", modifier = Modifier.padding(bottom = 25.dp))

        OutlinedTextField(
            value = namaTxt,
            onValueChange = { namaTxt = it },
            label = { Text(text = stringResource(id = R.string.nama)) },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)

        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = nimTxt,
            onValueChange = { nimTxt = it },
            label = { Text(text = stringResource(id = R.string.nim)) },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = konsentrasiTxt,
            onValueChange = { konsentrasiTxt = it },
            label = { Text(text = stringResource(id = R.string.konsentrasi)) },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = judulskripsi,
            onValueChange = { judulskripsi = it },
            label = { Text(text = stringResource(id = R.string.judul)) },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = dospemsatu,
            onValueChange = { dospemsatu = it },
            label = { Text(text = stringResource(id = R.string.dospemsatu)) },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = dospemdua,
            onValueChange = { dospemsatu = it },
            label = { Text(text = stringResource(id = R.string.dosmpemdua)) },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier =
                Modifier.padding(dimensionResource(id = R.dimen.padding_medium))
            ) {
                pilihanForm.forEach { item ->
                    Row(modifier = Modifier.selectable(
                        selected = pilihandosen == item,
                        onClick = {
                            pilihandosen = item
                            onSelectionChanged(item)
                        }
                    ),
                        verticalAlignment = Alignment.CenterVertically) {

                        RadioButton(selected = pilihandosen == item,
                            onClick = {
                                pilihandosen = item
                                onSelectionChanged(item)
                            }
                        )
                        Text(item)
                    }
                }

                Button(onClick = { onSubmitButtonClicked(listData) }) {
                    Text(text = stringResource(id = R.string.btn_submit))
                }

            }
        }
    }
}