package com.example.hairharmony.activities

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SignUp(context: Context = LocalContext.current, navController: NavHostController) {

}

@Preview
@Composable
fun SignUpPreview() {
    val context = LocalContext.current
    val navController = rememberNavController()
    SignUp(context, navController)
}