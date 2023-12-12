package com.jantonioc.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jantonioc.mynewcompose.ui.theme.MynewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MynewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MySuperText("")
                }
            }
        }
    }
}

@Preview(
    name = "Preview 1",
    heightDp = 50,
    widthDp = 200,
    showBackground = true,
    showSystemUi = true,
    apiLevel = 30,
    device = Devices.NEXUS_5 )

@Composable
fun MyTestSuperText()
{
    MySuperText("sdfdfdsf")
}

@Composable
fun MySuperText(name: String)
{
    Text(text = "SOY ARISTIDEV :( dssd $name", modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 20.dp)
        .clickable {

        })
}