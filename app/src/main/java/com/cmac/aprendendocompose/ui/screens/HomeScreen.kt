package com.cmac.aprendendocompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cmac.aprendendocompose.SampleData.sampleSections
import com.cmac.aprendendocompose.components.ProductSection
import com.cmac.aprendendocompose.model.Product

@Composable
fun HomeScreen(sections: Map<String, List<Product>>) {
    LazyColumn(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    )
    {
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
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(sampleSections)
}