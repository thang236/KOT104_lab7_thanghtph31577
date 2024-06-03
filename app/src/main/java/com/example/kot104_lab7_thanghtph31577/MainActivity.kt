package com.example.kot104_lab7_thanghtph31577

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kot104_lab7_thanghtph31577.model.viewModel.MainViewModel
import com.example.kot104_lab7_thanghtph31577.ui.screens.MovieScreen
import com.example.kot104_lab7_thanghtph31577.ui.screens.ScreenNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val mainViewModel: MainViewModel = viewModel()
            val moviesState =
                mainViewModel.movies.observeAsState(initial = emptyList())
//            MovieScreen(moviesState.value)


            ScreenNavigation()

        }
    }
}

