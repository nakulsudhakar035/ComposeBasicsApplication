package com.nakuls.composebasicsapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nakuls.composebasicsapplication.ui.theme.ComposeBasicsApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicsApplicationTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    DisplayHomeContents(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun DisplayHomeContents(modifier: Modifier = Modifier){
    Column {
        DisplayImageBanner()
        DisplayHeading()
        DisplayTitle()
        DisplayContent()
    }
}

@Composable
fun DisplayImageBanner(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        image,
        null,
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun DisplayImageBannerPreview(){
    ComposeBasicsApplicationTheme {
        DisplayImageBanner()
    }
}

@Composable
fun DisplayHeading(modifier: Modifier = Modifier){
    val headingText = stringResource(R.string.heading)
    Text(
        headingText,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Preview(showBackground = true)
@Composable
fun DisplayHeadingPreview(){
    ComposeBasicsApplicationTheme {
        DisplayHeading()
    }
}

@Composable
fun DisplayTitle(modifier: Modifier = Modifier){
    val titleText = stringResource(R.string.title)
    Text(
        titleText,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        textAlign = TextAlign.Start,
        style = MaterialTheme.typography.bodyLarge
    )
}

@Preview(showBackground = true)
@Composable
fun DisplayTitlePreview(){
    ComposeBasicsApplicationTheme {
        DisplayTitle()
    }
}

@Composable
fun DisplayContent(modifier: Modifier = Modifier){
    val titleText = stringResource(R.string.content)
    Text(
        titleText,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Start,
        style = MaterialTheme.typography.bodyLarge
    )
}

@Preview(showBackground = true)
@Composable
fun DisplayContentPreview(){
    ComposeBasicsApplicationTheme {
        DisplayContent()
    }
}