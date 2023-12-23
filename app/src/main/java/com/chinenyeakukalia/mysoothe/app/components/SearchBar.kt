package com.chinenyeakukalia.mysoothe.app.components
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chinenyeakukalia.mysoothe.R
import com.chinenyeakukalia.mysoothe.ui.theme.MySootheTheme


@Composable
fun SearchBar(modifier: Modifier = Modifier){
    var searchContent by remember { mutableStateOf("") }
    TextField(
        value = "searchContent",
        onValueChange = {searchContentInput -> searchContent = searchContentInput},
        leadingIcon = {
                      Icon(
                          imageVector = Icons.Default.Search,
                          contentDescription = null
                      )
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = MaterialTheme.colorScheme.surface,
            unfocusedIndicatorColor = MaterialTheme.colorScheme.surface,
        ),
        placeholder = {
            Text(stringResource(R.string.placeholder_search))
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun SearchBarPreview() {
    MySootheTheme {
        SearchBar()
    }
}