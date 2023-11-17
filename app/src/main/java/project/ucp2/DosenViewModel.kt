package project.ucp2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import project.ucp2.data.FormUiDosen

class DosenViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(FormUiDosen())
    val stateUI: StateFlow<FormUiDosen> = _stateUI.asStateFlow()


    fun setDosen(dosenPilihan: String) {
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(nama = dosenPilihan) }
    }
}