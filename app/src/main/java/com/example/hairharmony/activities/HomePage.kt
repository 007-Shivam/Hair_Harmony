package com.example.hairharmony.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hairharmony.R

@Composable
fun HomePage(navController: NavHostController) {
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.bag),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxHeight()
                .padding(top = 70.dp)
        ) {

            Image(painter = painterResource(id = R.drawable.haircut),
                contentDescription = null,
                modifier = Modifier.clickable { navController.navigate("Donate") }
                    .size(170.dp)
                    )
            Text(
                text = stringResource(id = R.string.Donate),
                style = TextStyle(
                    fontSize = 45.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0, 0, 0, 255),
                )
            )
        }

        Image(painter = painterResource(id = R.drawable.mapo), contentDescription = null,
            modifier = Modifier.clickable {navController.navigate("Track")}
                .size(230.dp)
                .padding(top = 90.dp))

        Text(modifier = Modifier.padding(top = 300.dp),
            text = stringResource(id = R.string.Track),
            style = TextStyle(
                fontSize = 45.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0, 0, 0, 255),                      )
        )
    }
}



@Preview
@Composable
fun HomePagePreview() {
    val navController = rememberNavController()
    HomePage(navController)
}