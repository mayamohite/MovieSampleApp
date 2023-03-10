package com.example.moviesampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.moviesampleapp.home.HomeScreen
import com.example.moviesampleapp.home.HomeScreenViewModel
import com.example.moviesampleapp.ui.theme.MovieSampleAppTheme
import com.google.accompanist.insets.ProvideWindowInsets
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MovieSampleAppTheme {
                ProvideWindowInsets {
                    Surface(
                        color = MaterialTheme.colors.background
                    ) {
                        val homeScreenViewModel = hiltViewModel<HomeScreenViewModel>()
                        HomeScreen(
                            homeScreenViewModel
                        )
                    }
                }
            }
        }
    }
}
