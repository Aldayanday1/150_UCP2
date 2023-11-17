package project.ucp2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import project.ucp2.data.FormUiDosen
import project.ucp2.data.FormUiState

class FormViewModel {
    class ContactViewModel : ViewModel() {
        private val _stateUIForm = MutableStateFlow(FormUiState())
        val stateUIForm: StateFlow<FormUiState> = _stateUIForm.asStateFlow()

        fun setContact(list: MutableList<String>) {
            _stateUIForm.update { stateSaatIni ->
                stateSaatIni.copy(
                    nama = list[0],
                    nim = list[1],
                    konsentrasi = list[2],
                    judulskripsi = list[3],
                )
            }
        }
    }
}