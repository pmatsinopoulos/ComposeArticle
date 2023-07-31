package com.mixlr.panos.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mixlr.panos.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        TopImage(
            modifier = modifier
        )
        Text(
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp),
            text = stringResource(R.string.article_title)
        )
        Text(
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp),
            text = stringResource(R.string.first_paragraph),
            textAlign = TextAlign.Justify
        )
        Text(
            modifier = modifier
                .padding(16.dp),
            text = stringResource(R.string.second_paragraph),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun TopImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        contentDescription = null,
        painter = image
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        Article()
    }
}
