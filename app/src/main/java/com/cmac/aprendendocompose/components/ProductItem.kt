package com.cmac.aprendendocompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cmac.aprendendocompose.R
import com.cmac.aprendendocompose.extensions.toBrazilianCurrency
import com.cmac.aprendendocompose.model.Product
import com.cmac.aprendendocompose.ui.theme.Purple500
import com.cmac.aprendendocompose.ui.theme.Teal200
import java.math.BigDecimal

@Composable
fun ProductItem(product: Product) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp

    ) {
        Column(
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
//                .verticalScroll(rememberScrollState())
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .height(imageSize)
                    .fillMaxWidth()
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
                    painter = painterResource(id = product.image),
                    contentDescription = "Imagem do item",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(CircleShape)
                        .align(Alignment.BottomCenter)
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))
            Column(
                modifier = Modifier.padding(start = 16.dp, bottom = 20.dp, end = 16.dp)
            ) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = product.price.toBrazilianCurrency(),
                    Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                )

            }
//            Box(
//                Modifier
//                    .padding(top = 20.dp)
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
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem(
        Product(
            name = "teste",
            price = BigDecimal(30),
            image = R.drawable.ic_launcher_background
        )
    )
}