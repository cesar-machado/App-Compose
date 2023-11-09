package com.cmac.aprendendocompose.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchTextField(
    searchText: String,
    onSearchChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(value = searchText,
        onValueChange = { newValue ->
            onSearchChange(newValue)
        }, Modifier
            .padding(
                top = 16.dp,
                start = 16.dp,
                end = 16.dp
            )
            .fillMaxWidth(), shape = RoundedCornerShape(100), label = {
            Text(text = "Produto")
        }, placeholder = {
            Text(text = "O que você procura?")
        }, leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = "Search icon"
            )
        })
}


@Preview(showBackground = true)
@Composable
fun SearchTextFieldPreview() {

    SearchTextField(
        "",
        onSearchChange = {},
    )
}


@Preview(showBackground = true)
@Composable
fun SearchTextFieldWithSearchTextPreview() {

    SearchTextField(
        searchText = "a",
        onSearchChange = {},
    )
}
