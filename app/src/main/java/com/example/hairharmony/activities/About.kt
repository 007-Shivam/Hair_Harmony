package com.example.hairharmony.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hairharmony.R

@Composable
fun About(navController: NavHostController) {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.bag),
            contentDescription = "background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .matchParentSize()
        )

        LazyColumn(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        ) {
            item {
                Text(
                    text = stringResource(id = R.string.aboutus),
                    style = TextStyle(
                        fontSize = 40.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color(0, 0, 0, 255),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)
                        .border(
                            width = 0.dp,
                            brush = Brush.radialGradient(listOf(Color.Black, Color.Transparent)),
                            shape = RoundedCornerShape(50.dp)
                        ),
                    textAlign = TextAlign.Center
                )
            }

            item {
                Text(text = stringResource(id = R.string.about_us),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, start = 30.dp, end = 30.dp),
                    style = TextStyle(
                        fontSize = 23.sp,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Normal,
                        color = Color(0, 0, 0, 255),
                    ),
                )
            }
        }
    }
}


@Preview
@Composable
fun AboutPreview() {
    val navController = rememberNavController()
    About(navController)
}