package es.wokis.poccolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.wokis.poccolumn.ui.theme.PocColumnTheme
import kotlin.coroutines.coroutineContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PocColumnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        "Android",
                        listOf(
                            "Lazy Column FTW 1",
                            "Lazy Column FTW 2",
                            "Lazy Column FTW 3",
                            "Lazy Column FTW 4",
                            "Lazy Column FTW 5",
                            "Lazy Column FTW 6",
                            "Lazy Column FTW 7",
                            "Lazy Column FTW 8",
                            "Lazy Column FTW 9",
                            "Lazy Column FTW 10",
                            "Lazy Column FTW 11",
                            "Lazy Column FTW 12",
                            "Lazy Column FTW 13",
                            "Lazy Column FTW 14",
                            "Lazy Column FTW 15"
                        ),
                        Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, content: List<String>, modifier: Modifier = Modifier) {
    LazyColumn {
        item {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum condimentum nisi, id suscipit leo sodales sed. In sit amet imperdiet sapien. Maecenas sit amet pretium libero. Quisque eleifend arcu felis, et pretium turpis pellentesque sed. Aenean in lorem non dui blandit ornare in in eros. Morbi sagittis mollis nunc, sit amet consequat mi sagittis sit amet. Maecenas lacinia eros ac ante commodo, quis consectetur eros imperdiet. Sed eleifend nunc dui, non tristique augue blandit a. Fusce aliquam accumsan rhoncus. Aliquam nec lacus dapibus, congue ligula quis, tincidunt enim. Ut vitae aliquam orci. Nulla efficitur ut dui interdum accumsan. Vestibulum turpis mauris, scelerisque eu viverra sit amet, mollis nec massa. Ut placerat venenatis tortor ac facilisis. Phasellus suscipit lobortis velit consectetur aliquam. Integer ullamcorper, diam ac lobortis placerat, sapien metus lobortis ex, at cursus enim nisl in dolor.",
                modifier = modifier
            )
            Text(
                text = "Curabitur scelerisque ac arcu ut malesuada. Aenean eget nulla sagittis, tempus nisl et, maximus ipsum. Vivamus vestibulum enim eu luctus dictum. Mauris nisi orci, interdum in suscipit sit amet, efficitur imperdiet erat. Pellentesque faucibus nisi ligula, in ornare urna vehicula sit amet. Aenean pellentesque eros enim, ut pharetra tortor efficitur ut. Cras eu dui ac sem pretium luctus in a ligula. Etiam consequat mi vel condimentum elementum. Vestibulum mattis molestie velit, nec posuere dolor gravida quis. Sed luctus eros at augue iaculis mollis. Maecenas ut dignissim nunc. Nam semper leo nec ante finibus, ut pharetra massa facilisis. Morbi non ipsum pretium justo sodales tincidunt vel ac nisl.",
                modifier = modifier
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum condimentum nisi, id suscipit leo sodales sed. In sit amet imperdiet sapien. Maecenas sit amet pretium libero. Quisque eleifend arcu felis, et pretium turpis pellentesque sed. Aenean in lorem non dui blandit ornare in in eros. Morbi sagittis mollis nunc, sit amet consequat mi sagittis sit amet. Maecenas lacinia eros ac ante commodo, quis consectetur eros imperdiet. Sed eleifend nunc dui, non tristique augue blandit a. Fusce aliquam accumsan rhoncus. Aliquam nec lacus dapibus, congue ligula quis, tincidunt enim. Ut vitae aliquam orci. Nulla efficitur ut dui interdum accumsan. Vestibulum turpis mauris, scelerisque eu viverra sit amet, mollis nec massa. Ut placerat venenatis tortor ac facilisis. Phasellus suscipit lobortis velit consectetur aliquam. Integer ullamcorper, diam ac lobortis placerat, sapien metus lobortis ex, at cursus enim nisl in dolor.",
                modifier = modifier
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur elementum condimentum nisi, id suscipit leo sodales sed. In sit amet imperdiet sapien. Maecenas sit amet pretium libero. Quisque eleifend arcu felis, et pretium turpis pellentesque sed. Aenean in lorem non dui blandit ornare in in eros. Morbi sagittis mollis nunc, sit amet consequat mi sagittis sit amet. Maecenas lacinia eros ac ante commodo, quis consectetur eros imperdiet. Sed eleifend nunc dui, non tristique augue blandit a. Fusce aliquam accumsan rhoncus. Aliquam nec lacus dapibus, congue ligula quis, tincidunt enim. Ut vitae aliquam orci. Nulla efficitur ut dui interdum accumsan. Vestibulum turpis mauris, scelerisque eu viverra sit amet, mollis nec massa. Ut placerat venenatis tortor ac facilisis. Phasellus suscipit lobortis velit consectetur aliquam. Integer ullamcorper, diam ac lobortis placerat, sapien metus lobortis ex, at cursus enim nisl in dolor.",
                modifier = modifier
            )
        }
        items(content) {
            Row {
                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "pepito")
                Text(text = it, modifier = Modifier.background(Color.Black), color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PocColumnTheme {
        Greeting("Android", listOf("ejemplo", "aaaaaaaa"))
    }
}