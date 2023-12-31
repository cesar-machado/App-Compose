package com.cmac.aprendendocompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.cmac.aprendendocompose.R
import com.cmac.aprendendocompose.extensions.toBrazilianCurrency
import com.cmac.aprendendocompose.model.Product
import com.cmac.aprendendocompose.ui.theme.Indigo400Light
import java.math.BigDecimal

@Composable
fun CardProductItem(
    product: Product,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier
            .fillMaxWidth()
            .heightIn(150.dp),
            elevation = CardDefaults.cardElevation( defaultElevation = 4.dp)

        ) {
        Column {
            AsyncImage(
                model = product.image,
                contentDescription = null,
                modifier
                    .fillMaxWidth()
                    .height(100.dp),
                placeholder = painterResource(id = R.drawable.placeholder),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier
                    .fillMaxWidth()
                    .background(
                        Indigo400Light
                    )
                    .padding(16.dp)
            ) {
                Text(
                    text = product.name, color = Color.Black
                )
                Text(
                    text = product.price.toBrazilianCurrency(), color = Color.Black
                )
            }
            product.description?.let {
                Text(
                        text = product.description,
                        Modifier
                                .padding(16.dp),

                )
            }
        }
    }
}

@Preview
@Composable
private fun CardProductItemPreview() {
    CardProductItem(
        product = Product(
            name = "teste",
            price = BigDecimal("9.99")
        ),
    )
}

