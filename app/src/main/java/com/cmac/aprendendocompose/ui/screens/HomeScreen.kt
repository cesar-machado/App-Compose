package com.cmac.aprendendocompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cmac.aprendendocompose.SampleData.sampleProducts
import com.cmac.aprendendocompose.SampleData.sampleSections
import com.cmac.aprendendocompose.ui.components.CardProductItem
import com.cmac.aprendendocompose.ui.components.ProductSection
import com.cmac.aprendendocompose.ui.components.SearchTextField
import com.cmac.aprendendocompose.model.Product

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(sections: Map<String, List<Product>>, searchText: String = "") {
    Column {

        var text by remember { mutableStateOf(searchText) }
        SearchTextField(
            searchText = text,
            onSearchChange = {
                text = it
            },
            Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        )
        val searchedProduct = remember(text) {
            if (text.isNotBlank()) {
                sampleProducts.filter { product ->
                    product.name.contains(
                        text,
                        ignoreCase = true,
                    ) ||
                            product.description?.contains(
                                text,
                                ignoreCase = true,
                            ) ?: false
                }
            } else emptyList()
        }

    LazyColumn(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    )
    {
        if (text.isBlank()) {
            for (section in sections) {
                val title = section.key
                val products = section.value
                item {
                    ProductSection(
                        title = title,
                        products = products
                    )
                }
            }
        } else {
            items(searchedProduct) { p ->
                CardProductItem(
                    product = p,
                    Modifier.padding(horizontal = 16.dp),
                )
            }
        }

    }
}
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(sampleSections)
}

@Preview
@Composable
fun HomeScreenWithSearchTextPreview() {

    HomeScreen(
        sampleSections,
        searchText = "a",
    )
}
