package com.example.testecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val movies = listOf(
            Movie(
                imageResource = R.drawable.image1,
                title = "Movie 1",
                group = "Filmes",
                synopsis = "Synopsis for Movie 1",
                originalTitle = "Original Title 1",
                genre = "Genre 1",
                episodes = 10,
                year = 2022,
                country = "Country 1",
                director = "Director 1",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image2,
                title = "Movie 2",
                group = "Filmes",
                synopsis = "Synopsis for Movie 2",
                originalTitle = "Original Title 2",
                genre = "Genre 2",
                episodes = 10,
                year = 2022,
                country = "Country 2",
                director = "Director 2",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image3,
                title = "Movie 3",
                group = "Filmes",
                synopsis = "Synopsis for Movie 3",
                originalTitle = "Original Title 3",
                genre = "Genre 3",
                episodes = 10,
                year = 2022,
                country = "Country 3",
                director = "Director 3",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image4,
                title = "Movie 4",
                group = "Filmes",
                synopsis = "Synopsis for Movie 4",
                originalTitle = "Original Title 4",
                genre = "Genre 4",
                episodes = 10,
                year = 2022,
                country = "Country 4",
                director = "Director 4",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image5,
                title = "Movie 5",
                group = "Filmes",
                synopsis = "Synopsis for Movie 5",
                originalTitle = "Original Title 5",
                genre = "Genre 5",
                episodes = 10,
                year = 2022,
                country = "Country 5",
                director = "Director 5",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image6,
                title = "Movie 6",
                group = "Séries",
                synopsis = "Synopsis for Movie 6",
                originalTitle = "Original Title 6",
                genre = "Genre 6",
                episodes = 10,
                year = 2022,
                country = "Country 6",
                director = "Director 6",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image7,
                title = "Movie 7",
                group = "Séries",
                synopsis = "Synopsis for Movie 7",
                originalTitle = "Original Title 7",
                genre = "Genre 7",
                episodes = 10,
                year = 2022,
                country = "Country 7",
                director = "Director 7",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image8,
                title = "Movie 8",
                group = "Séries",
                synopsis = "Synopsis for Movie 8",
                originalTitle = "Original Title 8",
                genre = "Genre 8",
                episodes = 10,
                year = 2022,
                country = "Country 8",
                director = "Director 8",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image9,
                title = "Movie 9",
                group = "Séries",
                synopsis = "Synopsis for Movie 9",
                originalTitle = "Original Title 9",
                genre = "Genre 9",
                episodes = 10,
                year = 2022,
                country = "Country 9",
                director = "Director 9",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image10,
                title = "Movie 10",
                group = "Séries",
                synopsis = "Synopsis for Movie 10",
                originalTitle = "Original Title 10",
                genre = "Genre 10",
                episodes = 10,
                year = 2022,
                country = "Country 10",
                director = "Director 10",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image11,
                title = "Movie 11",
                group = "Novelas",
                synopsis = "Synopsis for Movie 11",
                originalTitle = "Original Title 11",
                genre = "Genre 11",
                episodes = 10,
                year = 2022,
                country = "Country 11",
                director = "Director 11",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image12,
                title = "Movie 12",
                group = "Novelas",
                synopsis = "Synopsis for Movie 12",
                originalTitle = "Original Title 12",
                genre = "Genre 12",
                episodes = 10,
                year = 2022,
                country = "Country 12",
                director = "Director 12",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image13,
                title = "Movie 13",
                group = "Novelas",
                synopsis = "Synopsis for Movie 13",
                originalTitle = "Original Title 13",
                genre = "Genre 13",
                episodes = 10,
                year = 2022,
                country = "Country 13",
                director = "Director 13",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image14,
                title = "Movie 14",
                group = "Novelas",
                synopsis = "Synopsis for Movie 14",
                originalTitle = "Original Title 14",
                genre = "Genre 14",
                episodes = 10,
                year = 2022,
                country = "Country 14",
                director = "Director 14",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image15,
                title = "Movie 15",
                group = "Novelas",
                synopsis = "Synopsis for Movie 15",
                originalTitle = "Original Title 15",
                genre = "Genre 15",
                episodes = 10,
                year = 2022,
                country = "Country 15",
                director = "Director 15",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image1,
                title = "Movie 16",
                group = "Diversos",
                synopsis = "Synopsis for Movie 16",
                originalTitle = "Original Title 16",
                genre = "Genre 16",
                episodes = 10,
                year = 2022,
                country = "Country 16",
                director = "Director 16",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image2,
                title = "Movie 17",
                group = "Diversos",
                synopsis = "Synopsis for Movie 17",
                originalTitle = "Original Title 17",
                genre = "Genre 17",
                episodes = 10,
                year = 2022,
                country = "Country 17",
                director = "Director 17",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image3,
                title = "Movie 18",
                group = "Diversos",
                synopsis = "Synopsis for Movie 18",
                originalTitle = "Original Title 18",
                genre = "Genre 18",
                episodes = 10,
                year = 2022,
                country = "Country 18",
                director = "Director 18",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image4,
                title = "Movie 19",
                group = "Diversos",
                synopsis = "Synopsis for Movie 14",
                originalTitle = "Original Title 14",
                genre = "Genre 19",
                episodes = 10,
                year = 2022,
                country = "Country 19",
                director = "Director 19",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            ),
            Movie(
                imageResource = R.drawable.image5,
                title = "Movie 20",
                group = "Diversos",
                synopsis = "Synopsis for Movie 20",
                originalTitle = "Original Title 20",
                genre = "Genre 20",
                episodes = 10,
                year = 2022,
                country = "Country 20",
                director = "Director 20",
                cast = listOf("Actor 1", "Actor 2"),
                availableUntil = "January 1, 2023"
            )

        )
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "MyScreen5") {
                composable("MyScreen5") { MyScreen5(navController, movies) }
                composable("DetailScreen/{title}") { backStackEntry ->
                    val title = backStackEntry.arguments?.getString("title")
                    val movie = findMovieByTitle(title, movies)
                    if(movie != null) {
                        DetailScreen(navController, movie)
                    }
                    else {
                        // Caso o filme não seja encontrado, exiba uma mensagem de erro ou retorno
                        Text(text="Movie not Found")
                    }
                }
            }
        }
    }
}

@Composable
fun MyScreen5(navController: NavController, movies: List<Movie>) {

    // Agrupando os filmes por grupo
    val groupedByGroup = movies.groupBy { it.group }

    LazyColumn {
        groupedByGroup.forEach { (group, moviesByGroup) ->
            item {
                Text(
                    text = group,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    ),
                    modifier = Modifier.padding(8.dp)
                )
            }
            item {
                LazyRow {
                    items(moviesByGroup.size) { index ->
                        MoviePoster(movie = moviesByGroup[index], navController = navController)
                        Spacer(modifier = Modifier.width(16.dp))
                    }
                }
            }
            item {
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

@Composable
fun MovieListItem(movie: Movie, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                navController.navigate("DetailScreen/${movie.title}")
            }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = movie.imageResource),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = movie.title)
            Text(text = movie.group)
            Text(text = movie.synopsis)
        }
    }
}

@Composable
fun DetailScreen(navController: NavController, movie: Movie) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Back",
                modifier = Modifier
                    .clickable { navController.popBackStack() }
                    .size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Movie Details", fontWeight = FontWeight.Bold)
        }
        Image(
            painter = painterResource(id = movie.imageResource),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )
        Row() {
            Text(text = "Title: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.title}")
        }
        Row() {
            Text(text = "Group: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.group}")
        }
        Row() {
            Text(text = "Synopsis: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.synopsis}")
        }
        Row() {
            Text(text = "Original Title: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.originalTitle}")
        }
        Row() {
            Text(text = "Genre: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.genre}")
        }
        Row() {
            Text(text = "Episodes: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.episodes}")
        }
        Row() {
            Text(text = "Year: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.year}")
        }
        Row() {
            Text(text = "Country: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.country}")
        }
        Row() {
            Text(text = "Director: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.director}")
        }
        Row() {
            Text(text = "Cast: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.cast.joinToString()}")
        }
        Row() {
            Text(text = "Available Until: ", fontWeight = FontWeight.Bold)
            Text(text = "${movie.availableUntil}")
        }
    }
}

data class Movie(
    val imageResource: Int,
    val title: String,
    val group: String,
    val synopsis: String,
    val originalTitle: String,
    val genre: String,
    val episodes: Int,
    val year: Int,
    val country: String,
    val director: String,
    val cast: List<String>,
    val availableUntil: String
)

@Composable
fun MoviePoster(movie: Movie, navController: NavController) {
    Column(
        modifier = Modifier.clickable {
            navController.navigate("DetailScreen/${movie.title}")
        }
    ) {
        Image(
            painter = painterResource(id = movie.imageResource),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp, 180.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )
        Text(
            text = movie.title,
            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

fun findMovieByTitle(title: String?, movies: List<Movie>): Movie? {
    // Verifica se o título não é nulo
    if (title.isNullOrEmpty()) {
        return null
    }

    // Busca o filme na lista de filmes
    return movies.find { it.title == title }
}


/*
package com.example.testecompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testecompose.ui.theme.TesteComposeTheme
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "MyScreen4") {
                composable("MyScreen4") { MyScreen4(navController) }
//                composable("DetailScreen") { DetailScreen(navController)}
                composable("DetailScreen/{imageId}") { backStackEntry ->
                    // Recupere o argumento imageId
                    val imageId = backStackEntry.arguments?.getString("imageId")
                    DetailScreen(navController, imageId = imageId)

                }

            }
            /*
            TesteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //MyScreen1()
                    //MyScreen2()
                    //MyScreen3()
                    DetailScreen(navController)
                }
            }
*/

        }
    }
}


@Composable
fun CentralizedImageRow1(imageResource: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp) // Ajuste conforme necessário
                .padding(8.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun TitleWithImagesRow1(title: String, imageResources: List<Int>) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Green
            ),
            modifier = Modifier.padding(8.dp)
        )
        LazyRow {
            items(imageResources.size) { index ->
                Image(
                    painter = painterResource(id = imageResources[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(80.dp)
                        .width(150.dp)
                        .height(200.dp), // Ajuste conforme necessário
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}

@Composable
fun MyScreen1() {
    Column {
        CentralizedImageRow1(R.drawable.ic_launcher_foreground) // Sua primeira imagem centralizada

        Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

        LazyColumn {
            item {
                TitleWithImagesRow1(
                    title = "Seu Título 1",
                    imageResources = listOf(
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground
                    )
                ) // Título e imagens

                Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

                TitleWithImagesRow1(
                    title = "Seu Título 2",
                    imageResources = listOf(
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground
                    )
                ) // Título e imagens

                Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

                TitleWithImagesRow1(
                    title = "Seu Título 3",
                    imageResources = listOf(
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground
                    )
                ) // Título e imagens

                Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

                TitleWithImagesRow1(
                    title = "Seu Título 3",
                    imageResources = listOf(
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground
                    )
                ) // Título e imagens

                Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

                TitleWithImagesRow1(
                    title = "Seu Título 3",
                    imageResources = listOf(
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground,
                        R.drawable.ic_launcher_foreground
                    )
                ) // Título e imagens
            }
        }
    }
}

// Versão 2
@Composable
fun CentralizedImageRow2(imageResource: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp) // Ajuste conforme necessário
                .padding(8.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun TitleWithImagesRow2(title: String, imageResources: List<Int>) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(8.dp)
        )
        LazyRow {
            items(imageResources.size) { index ->
                Image(
                    painter = painterResource(id = imageResources[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(80.dp), // Ajuste conforme necessário
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}

@Composable
fun MyScreen2() {
    val imageResources = mutableListOf<Int>()

    for (i in 0..15) {
        val resourceName = "image$i"
        val resourceId = getResourceId2(resourceName, R.drawable::class.java)
        imageResources.add(resourceId)
    }

    Column {
        CentralizedImageRow2(imageResources[0]) // Sua primeira imagem centralizada

        Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

        LazyColumn {
            item {
                TitleWithImagesRow2(
                    title = "Seu Título 1",
                    imageResources = imageResources.subList(1, imageResources.size)
                ) // Título e imagens
            }
        }
    }
}

fun getResourceId2(name: String, c: Class<*>): Int {
    try {
        val idField = c.getDeclaredField(name)
        return idField.getInt(idField)
    } catch (e: Exception) {
        e.printStackTrace()
        return -1
    }
}

// Versão 3
@Composable
fun CentralizedImageRow3(imageResource: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp) // Ajuste conforme necessário
                .padding(8.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun TitleWithImagesRow3(title: String, imageResources: List<Int>) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(8.dp)
        )
        LazyRow {
            items(imageResources.size) { index ->
                Image(
                    painter = painterResource(id = imageResources[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(200.dp), // Ajuste conforme necessário
                    contentScale = ContentScale.Fit,
                )
            }
        }
    }
}

@Composable
fun MyScreen3() {
    val imageResources = mutableListOf<List<Int>>()

    for (i in 0 until 3) {
        val rowImages = mutableListOf<Int>()
        for (j in 0 until 5) {
            val resourceName = "image${i * 5 + (j+1)}"
            val resourceId = getResourceId3(resourceName, R.drawable::class.java)
            rowImages.add(resourceId)
        }
        imageResources.add(rowImages)
    }

    Column {
        CentralizedImageRow3(imageResources[0][0]) // Sua primeira imagem centralizada

        Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

        LazyColumn {
            itemsIndexed(imageResources) { index,rowImages ->
                TitleWithImagesRow3(
                    title = "Título ${index + 1}",
                    imageResources = rowImages
                ) // Título e imagens
                Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

            }
        }
    }
}

fun getResourceId3(name: String, c: Class<*>): Int {
    try {
        val idField = c.getDeclaredField(name)
        return idField.getInt(idField)
    } catch (e: Exception) {
        e.printStackTrace()
        return -1
    }
}

// Versão 4
@Composable
fun CentralizedImageRow4(imageResource: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .size(200.dp)// Ajuste conforme necessário
                .padding(8.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun TitleWithImagesRow4(
    title: String,
    imageResources: List<Int>,
    navController: NavController
    ) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(8.dp)
        )
        LazyRow {
            items(imageResources.size) { index ->
                Image(
                    painter = painterResource(id = imageResources[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(200.dp)
                        .clickable {
                            navController.navigate("DetailScreen/${imageResources[index]}")
                        },
                    contentScale = ContentScale.Fit,
                )
            }
        }
    }
}

@Composable
fun MyScreen4(navController: NavController) {
    val imageResources = mutableListOf<List<Int>>()

    for (i in 0 until 3) {
        val rowImages = mutableListOf<Int>()
        for (j in 0 until 5) {
            val resourceName = "image${i * 5 + (j+1)}"
            val resourceId = getResourceId4(resourceName, R.drawable::class.java)
            rowImages.add(resourceId)
        }
        imageResources.add(rowImages)
    }

    Column {
        CentralizedImageRow4(imageResources[0][0]) // Sua primeira imagem centralizada

        Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

        LazyColumn {
            itemsIndexed(imageResources) { index,rowImages ->
                TitleWithImagesRow4(
                    title = "Título ${index + 1}",
                    imageResources = rowImages,
                    navController = navController
                ) // Título e imagens
                Spacer(modifier = Modifier.height(16.dp)) // Espaço entre as linhas

            }
        }
    }
}

fun getResourceId4(name: String, c: Class<*>): Int {
    try {
        val idField = c.getDeclaredField(name)
        return idField.getInt(idField)
    } catch (e: Exception) {
        e.printStackTrace()
        return -1
    }
}

@Composable
fun DetailScreen(navController: NavController, imageId: String?) {
//    Log.d("DetailScreen", "DetailScreen está sendo renderizada")
    Column() {
        Row() {
            Text(imageId.toString())
            Text(imageId.toString())
            Text(imageId.toString())
            Text(imageId.toString())
            Text(imageId.toString())
            Text(imageId.toString())
            Text(imageId.toString())

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Button(onClick = { navController.popBackStack() }) {
                    Text(text = "Go back")
                }

            }
            Column() {
                Text(imageId.toString())

            }
            Text(imageId.toString())
            Text(imageId.toString())
            Text(imageId.toString())
            Text(imageId.toString())
            Text(imageId.toString())

        }
    }
}


*/




