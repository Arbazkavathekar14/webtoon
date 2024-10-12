import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.webtoon.data.Webtoon
import com.example.webtoon.viewmodel.WebtoonViewModel

@Composable
fun DetailScreen(
    navController: NavController,
    title: String,
    imageUrl: String,
    fullDescription: String,
    viewModel: WebtoonViewModel,
    briefDescription: String,
    rating: Float
) {
    val context = LocalContext.current

    var userRating by remember { mutableStateOf(0f) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = title,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = fullDescription,
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(12.dp))


        Text(
            text = buildAnnotatedString {
                append("Average Rating: $rating ")
                withStyle(style = SpanStyle(color = Color.Yellow)) {
                    append("★")
                }
            },
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))


        RatingBar(
            currentRating = userRating,
            onRatingChanged = { newRating -> userRating = newRating },
            modifier = Modifier.padding(vertical = 6.dp)
        )


        Button(
            onClick = {
                viewModel.addFavorite(
                    Webtoon(
                        title = title,
                        imageUrl = imageUrl,
                        description = fullDescription,
                        rating = userRating,
                        briefDescription = briefDescription
                    )
                )
                Toast.makeText(context, "Webtoon saved successfully", Toast.LENGTH_SHORT).show()
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EE)),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Add to Favorites", color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))


        IconButton(
            onClick = { navController.navigate("favorites") },
            modifier = Modifier.size(124.dp)
        ){
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Favorites",
                tint = Color.Red,
                modifier = Modifier.size(124.dp)
            )
        }
    }
}

@Composable
fun RatingBar(
    currentRating: Float,
    onRatingChanged: (Float) -> Unit,
    modifier: Modifier = Modifier,
    stars: Int = 5
) {
    Row(modifier = modifier) {
        for (i in 1..stars) {
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Star $i",
                tint = if (i <= currentRating.toInt()) Color.Yellow else Color.Gray,
                modifier = Modifier
                    .size(32.dp)
                    .clickable {
                        onRatingChanged(i.toFloat())
                    }
            )
        }
    }
}
