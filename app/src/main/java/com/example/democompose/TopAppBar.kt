package com.example.democompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun TopAppBar(){
    Row{
        IconButton(onClick = {}) {
            Image(painter = painterResource(R.drawable.greeksalad),
                contentDescription = "")
        }
        Image(painter = painterResource(R.drawable.greeksalad),
            contentDescription = "")
    }
}
