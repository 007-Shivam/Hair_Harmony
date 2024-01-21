package com.example.hairharmony

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hairharmony.activities.About
import com.example.hairharmony.activities.AppLayout
import com.example.hairharmony.activities.Certificate
import com.example.hairharmony.activities.ChatBot
import com.example.hairharmony.activities.Contact
import com.example.hairharmony.activities.Donate
import com.example.hairharmony.activities.Guideline
import com.example.hairharmony.activities.HomePage
import com.example.hairharmony.activities.LogIn
import com.example.hairharmony.activities.Notification
import com.example.hairharmony.activities.Profile
import com.example.hairharmony.activities.SignUp
import com.example.hairharmony.activities.Track

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNavigation()
        }
    }
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Login") {
        composable("HomePage") {
            AppLayout(navController = navController) { currentNavController ->
                HomePage(navController = currentNavController)
            }
        }
        composable("SignUp") {
            SignUp(navController = navController)
        }
        composable("LogIn") {
            LogIn(navController = navController)
        }
        composable("About") {
            AppLayout(navController = navController) { currentNavController ->
                About(navController = currentNavController)
            }
        }
        composable("Contact") {
            AppLayout(navController = navController) {
                Contact()
            }
        }
        composable("Profile") {
            AppLayout(navController = navController) {
                Profile()
            }
        }
        composable("Certificate") {
            AppLayout(navController = navController) {
                Certificate()
            }
        }
        composable("ChatBot") {
            AppLayout(navController = navController) {
                ChatBot()
            }
        }
        composable("Donate") {
            AppLayout(navController = navController) { currentNavController ->
                Donate(navController = currentNavController)
            }
        }
        composable("Guideline") {
            AppLayout(navController = navController) {
                Guideline()
            }
        }
        composable("Notification") {
            AppLayout(navController = navController) {
                Notification()
            }
        }
        composable("Track") {
            AppLayout(navController = navController) {
                Track()
            }
        }
    }
}