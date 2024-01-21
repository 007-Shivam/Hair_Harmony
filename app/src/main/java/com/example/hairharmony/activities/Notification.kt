package com.example.hairharmony.activities

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hairharmony.R

@Composable
fun Notification() {

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
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 30.dp, start = 30.dp, end = 30.dp)
                .fillMaxWidth()
        ) {

            Card(
                modifier = Modifier
                    .background( Color(230, 223, 235, 255))
                    .border(
                        BorderStroke(width = 3.dp, color = Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(24.dp),
                shape = RoundedCornerShape(10.dp),

                ) {
                Text(
                    text = "Thank You for Your Donation :)",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.Black,
                )
                Text(
                    text = "- 02ms ago",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 160.dp)
                )
            }

            Spacer(modifier = Modifier.padding(0.dp, 30.dp))



            Card(
                modifier = Modifier
                    .background(color = Color(230, 223, 235, 255))
                    .border(
                        BorderStroke(width = 3.dp, color = Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(24.dp),
                shape = RoundedCornerShape(10.dp),
            ) {
                Text(
                    text = "Guidelines update!Whats New",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color(0, 0, 0, 255),
                )
                Text(
                    text = "- 02 days ago",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 140.dp)
                )
            }

            Spacer(modifier = Modifier.padding(0.dp, 30.dp))

            Card(
                modifier = Modifier
                    .background(color = Color(230, 223, 235, 255))
                    .border(
                        BorderStroke(width = 3.dp, color = Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(24.dp),
                shape = RoundedCornerShape(10.dp),
            ) {
                Text(
                    text = "Welcome to HairHarmony",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color(0, 0, 0, 255),
                    modifier = Modifier
                )
                Text(
                    text = "- 15 days ago",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 140.dp)
                )
            }
        }

    }
}

@Preview
@Composable
fun NotificationPreview() {
    Notification()
}