package com.example.android

import android.annotation.SuppressLint
import android.app.Notification
import android.graphics.drawable.Icon

import android.os.Bundle
import android.os.Message
import android.text.Layout
import android.text.TextPaint
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon

import androidx.compose.material3.IconButton
import androidx.compose.material3.Label
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Action
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
            MainFunction()

        }

    }
}
@ExperimentalMaterial3Api
@Composable
@Preview(
    showSystemUi = true ,
    showBackground = true
)
fun MainFunction() {
    Scaffold (
        bottomBar = { BottomAppBarExample()}
    ){
        innerpadding -> MainScreen(innerpadding)

    }
}
@ExperimentalMaterial3Api
@Composable
fun MainScreen(Innerpadding : PaddingValues) {



            Column(modifier = Modifier.padding(Innerpadding)) {

                Box(
                    modifier = Modifier
                        .height(250.dp)
                        .background(Color(0xFFEDE9F3))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(18.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.screenshot__66_),
                            contentDescription = "Pic",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(65.dp)
                                .clip(CircleShape)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 18.dp, top = 18.dp)
                    ) {
                        Row {
                            Text(
                                text = "New York",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 18.sp

                            )
                            Icon(
                                Icons.Default.ArrowDropDown,
                                contentDescription = "Icon"

                            )
                        }
                        Text(
                            text = "with in 20 miles",
                            fontSize = 18.sp
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Hello, Simone",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 30.sp
                        )

                        Text(
                            text = "There are 25 new \n Events in your area.",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 30.sp,
                            color = Color(0xFFBA66C9)

                        )



                        Spacer(modifier = Modifier.height(16.dp))

                        TextField(value = "Search for an event",
                            onValueChange = {},

                            shape = RoundedCornerShape(8.dp),

                            colors = TextFieldDefaults.textFieldColors(
                                containerColor = Color(0xFFFEFEFF),
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent

                            ),

                            modifier = Modifier.size(width = 350.dp, height = 50.dp),

                            leadingIcon = {
                                Icon(
                                    Icons.Default.Search,

                                    contentDescription = "Search"
                                )

                            }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "You might like",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp, modifier = Modifier.padding(top = 12.dp)
                    )
                    Spacer(modifier = Modifier.width(170.dp))

                    TextButton(
                        onClick = { /*TODO*/ },
                   colors = ButtonDefaults.textButtonColors(
                      contentColor = Color.Gray)
                    )
                    {
                       Text(
                           text = "See All",
                           fontWeight = FontWeight.Bold,
                           style = TextStyle(
                               textDecoration = TextDecoration
                                   .Underline
                           )
                       )
                    }
                }
                Column {

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        item {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Box {

                                    Image(
                                    painter = painterResource(id = R.drawable.pic),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(200.dp)
                                        .size(110.dp)
                                        .clip(RoundedCornerShape(8.dp))

                                )
                                    Column (
                                        modifier = Modifier.align(Alignment.TopStart)
                                    ){
                                        Box (
                                            modifier = Modifier
                                                .padding(8.dp)
                                                .background(Color.White)
                                                .shadow(10.dp)
                                                .width(35.dp)
                                                .height(35.dp)
                                                .clip(RoundedCornerShape(10.dp))

                                        ) {
                                            Column(modifier = Modifier.padding(start = 7.dp))
                                                {

                                                Text(
                                                    text = "Nov",
                                                    fontSize = 12.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Text(
                                                    text = "20",
                                                    fontSize = 12.sp,
                                                    fontWeight = FontWeight.ExtraBold
                                                )
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(30.dp))
                                        Box(
                                            modifier = Modifier
                                            .padding(8.dp)
                                            .background(Color.White)
                                            .shadow(10.dp)
                                            .width(60.dp)
                                            .height(15.dp)
                                            .clip(RoundedCornerShape(10.dp))

                                        ) {
                                            Row(modifier = Modifier.padding(start = 7.dp)) {
                                            Text(text = "Widgets",
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Bold)
                                        }
                                            }
                                    }

                                }

                                Spacer(modifier = Modifier.height(7.dp))

                            Text(
                                text = "Application",
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(7.dp))

                            Row {

                                Icon(
                                    Icons.Outlined.CheckCircle,
                                    contentDescription = "Icon",
                                    modifier = Modifier
                                        .size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))

                                Text(text = "10:00  19:30")
                            }

                        }
                        Column(
                            modifier = Modifier.padding(8.dp)) {

                            Box {
                                Image(
                                painter = painterResource(id = R.drawable.screenshot__111_),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(200.dp)
                                    .size(110.dp)
                                    .clip(RoundedCornerShape(8.dp))
                            )
                                Column (
                                    modifier = Modifier.align(Alignment.TopStart)
                                ){
                                    Box (
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .background(Color.White)
                                            .shadow(10.dp)
                                            .width(35.dp)
                                            .height(35.dp)
                                            .clip(RoundedCornerShape(10.dp))

                                    ) {
                                        Column (modifier = Modifier.padding(start = 7.dp))
                                        {
                                            Spacer(modifier = Modifier.padding(start = 16.dp))


                                            Text(
                                                text = "Nov",
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                            Text(
                                                text = "20",
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.ExtraBold
                                            )
                                        }
                                    }
                                }

                            }

                            Spacer(modifier = Modifier.height(7.dp))

                            Text(
                                text = "Design",
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(7.dp))

                            Row {

                                Icon(
                                    Icons.Outlined.CheckCircle,
                                    contentDescription = "Icon",
                                    modifier = Modifier
                                        .size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))

                                Text(text = "10:00  16:30")
                            }
                        }
                        Column(modifier = Modifier.padding(8.dp)) {

                            Image(
                                painter = painterResource(id = R.drawable.whatsapp_image_2024_08_15_at_12_26_21_am),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(200.dp)
                                    .size(110.dp)
                                    .clip(RoundedCornerShape(8.dp))
                            )

                            Spacer(modifier = Modifier.height(7.dp))

                            Text(
                                text = "Pandaa",
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(7.dp))

                            Row {

                                Icon(
                                    Icons.Outlined.CheckCircle,
                                    contentDescription = "Icon",
                                    modifier = Modifier
                                        .size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))

                                Text(text = "10:00  15:00")
                            }
                        }

                            Column(modifier = Modifier.padding(8.dp)) {

                                Image(
                                    painter = painterResource(id = R.drawable.pic),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(200.dp)
                                        .size(110.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )

                                Spacer(modifier = Modifier.height(7.dp))

                                Text(
                                    text = "Too innocent to care",
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(7.dp))

                                Row {

                                    Icon(
                                        Icons.Outlined.CheckCircle,
                                        contentDescription = "Icon",
                                        modifier = Modifier
                                            .size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))

                                    Text(text = "10:00  15:00")
                                }
                            }
                        }
                    }
}
                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.padding(5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween


                ) {

                    Text(
                        text = "Upcoming events",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 12.dp)
                    )
                    Spacer(modifier = Modifier.width(150.dp))

                    TextButton(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color.Gray)
                    )
                    {
                        Text(
                            text = "See All",
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                textDecoration = TextDecoration
                                    .Underline
                            )
                        )
                    }
                }
                Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                    Box (
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.White)
                            .shadow(10.dp)
                            .width(35.dp)
                            .height(35.dp)
                            .clip(RoundedCornerShape(10.dp))

                    ) {
                            Column(
                                modifier = Modifier.padding(start = 7.dp)) {
                                Text(
                                    text = "Nov",
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "18",
                                    fontWeight = FontWeight.ExtraBold
                                )
                            }
                        }
                    
                    Spacer(modifier = Modifier
                        .width(16.dp))

                        Image(
                            painter = painterResource(id = R.drawable.screenshot__110_),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(250.dp)
                                .height(100.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )
                    }
                }
}

@ExperimentalMaterial3Api
@Composable
fun BottomAppBarExample() {

    BottomAppBar(
        actions = {
            Column(modifier = Modifier.padding(start = 25.dp)) {
                Icon(
                    Icons.Outlined.Home,
                    contentDescription = "Home",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Gray

                )
                Text(
                    text = "Home",
                    fontWeight = FontWeight.Bold,

                    )
            }
            Spacer(modifier = Modifier.padding(start = 35.dp))
            Column(modifier = Modifier.padding(start = 25.dp)) {
                Icon(
                    Icons.Outlined.Search,
                    contentDescription = "Search",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Gray

                )
                Text(
                    text = "Search",
                    fontWeight = FontWeight.Bold,

                    )
            }
            Spacer(modifier = Modifier.padding(start = 35.dp))
            Column(modifier = Modifier.padding(start = 25.dp)) {
                Icon(
                    Icons.Outlined.Build,
                    contentDescription = "Build",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Gray

                )
                Text(
                    text = "Build",
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(modifier = Modifier.padding(start = 35.dp))
            Column(modifier = Modifier.padding(start = 25.dp)) {
                Icon(
                    Icons.Outlined.Menu,
                    contentDescription = "Menu",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Gray

                )
                Text(
                    text = "Menu",
                    fontWeight = FontWeight.Bold,

                    )
            }
        }
    )
}













































            








