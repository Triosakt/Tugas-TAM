package com.example.tugas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas.ui.theme.TugasTeori3_TAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasTeori3_TAMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MenuUtama()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true


)

@Composable
fun MenuUtama() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "Background",
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier
                .padding(top = 133.dp)
                .padding(start = 30.dp),

            text = "30°C",
            fontSize = 50.sp,
            color = Color.White
        )

        Text(
            modifier = Modifier
                .padding(top = 200.dp)
                .padding(start = 35.dp),

            text = "Berawan | IKU 26",
            fontSize = 14.sp,
            color = Color.White
        )

        Image(
            modifier = Modifier
                .padding(start = 250.dp)
                .padding(top = 60.dp)
                .size(160.dp),
            painter = painterResource(id = R.drawable.cloud),
            contentDescription = " Cuaca",
            contentScale = ContentScale.Crop


        )
        Text(
            modifier = Modifier
                .padding(top = 200.dp)
                .padding(start = 300.dp),

            text = "Rajabasa",
            fontSize = 14.sp,
            color = Color.White
        )

        Image(
            modifier = Modifier
                .padding(start = 200.dp)
                .padding(top = 439.dp)
                .size(140.dp),
            painter = painterResource(id = R.drawable.chrome1),
            contentDescription = " Chrome",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .padding(top = 540.dp)
                .padding(start = 116.dp),

            text = "Play Store",
            fontSize = 14.sp,
            color = Color.White
        )



        Image(
            modifier = Modifier
                .padding(start = 56.dp)
                .padding(top = 387.dp)
                .size(150.dp),
            painter = painterResource(id = R.drawable.ikon),
            contentDescription = " Playstore",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .padding(top = 540.dp)
                .padding(start = 224.dp),

            text = "Chrome",
            fontSize = 14.sp,
            color = Color.White
        )
        Image(
            modifier = Modifier
                .padding(start = 64.dp)
                .padding(top = 550.dp)
                .size(150.dp),
            painter = painterResource(id = R.drawable.gojek),
            contentDescription = " Playstore",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .padding(top = 659.dp)
                .padding(start = 130.dp),

            text = "Gojek",
            fontSize = 14.sp,
            color = Color.White
        )

        Image(
            modifier = Modifier
                .padding(start = 185.dp)
                .padding(top = 552.dp)
                .size(145.dp),
            painter = painterResource(id = R.drawable.canva),
            contentDescription = " Chrome",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .padding(top = 659.dp)
                .padding(start = 227.dp),

            text = "Canva",
            fontSize = 14.sp,
            color = Color.White
        )
        Image(
            modifier = Modifier
                .padding(start = 120.dp)
                .padding(top = 650.dp)
                .size(145.dp),
            painter = painterResource(id = R.drawable.slide),
            contentDescription = " Slide",
            contentScale = ContentScale.Crop
        )
        Image(
            modifier = Modifier
                .padding(start = 0.dp)
                .padding(top = 650.dp)
                .size(115.dp),
            painter = painterResource(id = R.drawable.pesan),
            contentDescription = " pesan",
            contentScale = ContentScale.Crop
        )
        Image(
            modifier = Modifier
                .padding(start = 90.dp)
                .padding(top = 650.dp)
                .size(115.dp),
            painter = painterResource(id = R.drawable.telfon),
            contentDescription = " telfon",
            contentScale = ContentScale.Crop
        )
        Image(
            modifier = Modifier
                .padding(start = 193.dp)
                .padding(top = 655.dp)
                .size(110.dp),
            painter = painterResource(id = R.drawable.sopi),
            contentDescription = " sopi",
            contentScale = ContentScale.Crop
        )
        Image(
            modifier = Modifier
                .padding(start = 282.dp)
                .padding(top = 650.dp)
                .size(120.dp),
            painter = painterResource(id = R.drawable.kamera),
            contentDescription = " Kamera",
            contentScale = ContentScale.Crop
        )






    }





}



