package com.example.hairharmony.activities

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomePage(context: Context = LocalContext.current, navController: NavHostController) {

}

@Preview
@Composable
fun HomePagePreview() {
    val context = LocalContext.current
    val navController = rememberNavController()
    HomePage(context, navController)
}