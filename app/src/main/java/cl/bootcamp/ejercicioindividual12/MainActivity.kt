package cl.bootcamp.ejercicioindividual12

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.bootcamp.ejercicioindividual12.ui.theme.EjercicioIndividual12Theme
import cl.bootcamp.ejercicioindividual12.view.HomeView
import cl.bootcamp.ejercicioindividual12.viewModel.CalculateViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel: CalculateViewModel by viewModels()
        setContent {
            EjercicioIndividual12Theme {
                HomeView(viewModel)
            }
        }
    }
}

