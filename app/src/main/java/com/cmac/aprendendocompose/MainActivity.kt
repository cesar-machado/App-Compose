package com.cmac.aprendendocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
                    ProductSection()
                }
            }
        }
    }
}

@Composable
fun ProductSection() {
    Column() {
        Text(
            text = "Promoções", Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp
            ), fontSize = 20.sp, fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .horizontalScroll(rememberScrollState())
                .padding(
                    top = 8.dp,
                    bottom = 16.dp
                ), horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(Modifier)
            ProductItem(content = LoremIpsum(50).values.first(), withDescription = true)
            ProductItem(content = LoremIpsum(10).values.first(), withDescription = true)
            ProductItem()
            Spacer(Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    ProductSection()

}

@Composable
fun ProductItem(withDescription: Boolean = false, content: String? = null) {
    if (withDescription) {
        if (content != null) {
            ProductItemWithDescription(content)
        }
    } else {
        ProductItemWithoutDescription()
    }
}

@Composable
fun ProductItemWithDescription(content: String) {
    Surface(shadowElevation = 10.dp, shape = RoundedCornerShape(15.dp)) {
        Column(
            modifier = Modifier
                .height(250.dp)
                .widthIn(200.dp, 210.dp)
                .verticalScroll(rememberScrollState())

        ) {
            val size = 100.dp
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(size)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple500,
                                Teal200
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .size(size)
                        .offset(y = size / 2)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter)
                )
            }
            Spacer(modifier = Modifier.height(size / 2))
            Column() {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Text(
                    text = "R$14.99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 8.dp,
                        bottom = 18.dp
                    )
                )
                Column(modifier = Modifier
                    .background(Purple500)
                    .fillMaxWidth()) {
                    Text(
                        text = content,
                        modifier = Modifier.padding(16.dp),
                        fontSize = 18.sp,
                        color = Color.White
                    )
                }
            }
        }

    }
}


@Composable
fun ProductItemWithoutDescription() {
    Surface(shadowElevation = 10.dp, shape = RoundedCornerShape(15.dp)) {
        Column(
            modifier = Modifier
                .heightIn(250.dp, 300.dp)
                .widthIn(200.dp, 210.dp)

        ) {
            val size = 100.dp
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(size)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple500,
                                Teal200
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .size(size)
                        .offset(y = size / 2)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter)
                )
            }
            Spacer(modifier = Modifier.height(size / 2))
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,

                    )
                Text(
                    text = "R$14.99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}


//@Composable
//fun ProductItem() {
//    Surface(
//        shape = RoundedCornerShape(15.dp),
//        shadowElevation = 4.dp
//
//    ) {
//        Column(
//            modifier = Modifier
//                .height(250.dp)
//                .width(200.dp)
//                .verticalScroll(rememberScrollState())
//        ) {
//            val imageSize = 100.dp
//            Box(
//                modifier = Modifier
//                    .height(imageSize)
//                    .fillMaxWidth()
//                    .background(
//                        brush = Brush.horizontalGradient(
//                            colors = listOf(
//                                Purple500,
//                                Teal200
//                            )
//                        )
//                    )
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = "Imagem do item",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .size(imageSize)
//                        .offset(y = imageSize / 2)
//                        .clip(CircleShape)
//                        .align(BottomCenter)
//                )
//            }
//            Spacer(modifier = Modifier.height(imageSize / 2))
//            Column(
//                modifier = Modifier.padding(start = 16.dp, bottom = 20.dp, end = 16.dp  )
//            ) {
//                Text(
//                    text = LoremIpsum(50).values.first(),
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight(700),
//                    maxLines = 2,
//                    overflow = TextOverflow.Ellipsis
//                )
//                Text(
//                    text = "R$ 14,99",
//                    Modifier.padding(top = 8.dp),
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight(400),
//                )
//
//                }
//            Box(
//                Modifier
////                    .padding(top = 5.dp)
//                    .background(Purple500)
//                    .fillMaxWidth()
//            ) {
//                Text(
//                    text = LoremIpsum(50).values.first(),
//                    Modifier.padding(16.dp),
//                    color = Color.White,
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight(700),
//
//
//                    )
//            }
//        }
//    }
//
//}






@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem()
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
