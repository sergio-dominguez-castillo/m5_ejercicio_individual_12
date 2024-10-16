package cl.bootcamp.ejercicioindividual12.model

data class CalculateState(
    val age: String = "",
    val weight: String = "",
    val height: String = "",
    val bmi: String = "0.0",
    val flagAlert: Boolean = false,
    val flagAge: Boolean = false,
    val flagWeight: Boolean = false,
    var flagHeight: Boolean = false,
    val flagGender: Boolean = false
)