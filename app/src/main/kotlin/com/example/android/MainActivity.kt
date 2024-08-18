package com.example.android

import android.app.Notification

import android.os.Bundle
import android.os.Message
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle


import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon

import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.ui.theme.MyApplicationTheme
import java.util.jar.Attributes
import kotlin.math.round
import kotlin.math.tan


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Set the content of the activity using Jetpack Compose
        setContent {
            SkillsScreen()



        }

    }
}
@ExperimentalMaterial3Api
@Preview
@Composable
fun SkillsScreen() {
    Scaffold(
        topBar = { TopAppbarView() }
    )
    { innerPadding ->
        SkillsItem(innerPadding)

    }

}
@ExperimentalMaterial3Api
@Composable
fun TopAppbarView() {
    TopAppBar(colors = topAppBarColors(containerColor = Color(0xFFA598BB)),
        title = {
            Row() {
                Image(painter = painterResource(id = R.drawable.screenshot__66_), contentDescription ="My pic",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(33.dp)
                        .clip(CircleShape))
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Text(text = "Skills", fontWeight = FontWeight.ExtraBold)
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Outlined.AccountCircle, contentDescription = "Account circle")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Outlined.Notifications, contentDescription = "Notification")
            }
        }
    )
}



@Composable
fun SkillsItem(innerPadding: PaddingValues) {
    Column(modifier = Modifier.padding(innerPadding)) {
        Text(
            text = "Experts", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp,
            modifier = Modifier
                .padding(all = 10.dp)
                .fillMaxWidth()
        )

        LazyColumn(
          verticalArrangement = Arrangement.spacedBy(16.dp),

            modifier = Modifier
                .fillMaxWidth()
        ) {
            item {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__109_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Applications", fontWeight = FontWeight.ExtraBold)
                }
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__110_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Graphic Designing", fontWeight = FontWeight.ExtraBold)
                }

                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__111_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Video editing", fontWeight = FontWeight.ExtraBold)
                }
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__109_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Applications", fontWeight = FontWeight.ExtraBold)
                }
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__110_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Applications", fontWeight = FontWeight.ExtraBold)
                }
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__109_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Applications", fontWeight = FontWeight.ExtraBold)
                }
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__110_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Applications", fontWeight = FontWeight.ExtraBold)
                }
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__110_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Applications", fontWeight = FontWeight.ExtraBold)
                }
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.screenshot__110_),
                        contentDescription = "pIc",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(110.dp)
                            .clip(RoundedCornerShape(8.dp))
                    )
                    Spacer(modifier = Modifier.padding(all = 5.dp))
                    Text(text = "Applications", fontWeight = FontWeight.ExtraBold)
                }


            }


        }
    }
}



