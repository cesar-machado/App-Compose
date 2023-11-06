package com.cmac.aprendendocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cmac.aprendendocompose.ui.theme.AprendendoComposeTheme
import com.cmac.aprendendocompose.ui.theme.Purple40
import com.cmac.aprendendocompose.ui.theme.Purple500
import com.cmac.aprendendocompose.ui.theme.PurpleGrey80
import com.cmac.aprendendocompose.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AprendendoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    ProductItem()
//                    ProductItem2()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductItem() {
    Surface(
        modifier = Modifier.padding(8.dp) ,
            shape = RoundedCornerShape(15.dp),
            shadowElevation = 4.dp

    ) {
        Column (modifier = Modifier
            .heightIn(250.dp, 300.dp)
            .width(200.dp)  ) {
            val imageSize = 100.dp
            Box(modifier = Modifier
                .height(imageSize)
                .fillMaxWidth()
                .background(brush = Brush.horizontalGradient(colors = listOf(Purple500, Teal200)))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Imagem do item",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(CircleShape)
                        .align(BottomCenter)
                )
            }
            Spacer(modifier = Modifier.height(imageSize/2))
            Column (
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "R$ 14,99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                )
            }
        }
    }

}



//@Preview(showBackground = true)
//@Composable
//fun ProductItem2() {
//    Surface(
//        modifier = Modifier.padding(8.dp),
//        shape = RoundedCornerShape(15.dp),
//        shadowElevation = 4.dp
//
//    ) {
//        Row (modifier = Modifier
//            .height(250.dp)
//            .width(500.dp)  ) {
//            val imageSize = 100.dp
//            Box(modifier = Modifier
////                .height(imageSize)
//                .fillMaxHeight()
//                .background(brush = Brush.linearGradient(colors = listOf(Purple500, PurpleGrey80)))
//            ) {
//                val rainbowColorsBrush = remember {
//                    Brush.linearGradient(
//                        listOf(
//                            PurpleGrey80,
//                            Purple500,
//                        )
//                    )
//                }
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = "Imagem do item",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .size(imageSize)
//                        .offset(x = imageSize / 2)
//                        .clip(CircleShape)
//                        .border(BorderStroke(4.dp, rainbowColorsBrush), CircleShape )
//                        .align(Center)
//                )
//            }
//            Spacer(modifier = Modifier.width(imageSize/2))
//
//            Column(Modifier.align(CenterVertically) .padding(16.dp)) {
//                Text(
//                    text = LoremIpsum(50).values.first(),
//                    fontSize = 18.sp,
//                    maxLines = 6,
//                    overflow = TextOverflow.Ellipsis,
//
//                    )
//            }
//
//
//
//        }
//    }
//
//}
