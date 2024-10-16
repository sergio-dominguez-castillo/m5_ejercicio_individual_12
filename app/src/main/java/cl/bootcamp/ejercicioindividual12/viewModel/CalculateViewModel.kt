package cl.bootcamp.ejercicioindividual12.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import cl.bootcamp.ejercicioindividual12.model.CalculateState

class CalculateViewModel: ViewModel() {

    // genero variable contenedora de data model
    var state by mutableStateOf(CalculateState())
    private set
    // cargo las variables desde data model
    fun onValue(value: String, text: String) {
        when (text) {
            "age" -> state = state.copy(age = value)
            "weight" -> state = state.copy(weight = value)
            "height" -> state = state.copy(height = value)
            "bmi" -> state = state.copy(bmi = value)
        }
    }

    fun calculate() {


        if (state.height != "" && state.weight != "") {
            state = state.copy(
                bmi= calculateBMI(state.weight.toDouble(), state.height.toDouble()).toString()
            )
        } else {
            state = state.copy(flagAlert = true)
        }

        /*if (state.height != "") {
            state = state.copy(flagHeight = true)
        }
        if (state.weight != "") {
            state = state.copy(flagWeight = true)
        }*/
    }

    // funcion que calcula el bmi
    fun calculateBMI(weightKG: Double, heightCM: Double): Double {
        val heightM = heightCM/100  // transformo de cm a mt
        val result = weightKG / (heightM * heightM)
        return kotlin.math.round(result * 100) / 100.0
    }

    fun closeAlert() {
        state = state.copy(flagAlert = false)
    }
}