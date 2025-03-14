package com.example.democompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ItemOrderStateful(){
    var count by rememberSaveable { mutableIntStateOf(0) }
    ItemOrderStateless(count,{count++},{count--})
}

@Composable
fun ItemOrderStateless(count : Int,onIncrement : () -> Unit,onDecrement : () -> Unit){

    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text = "Greek Salad",
            fontSize = 30.sp
        )
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically)
        {
            IconButton(onClick = { onDecrement() })
            {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Decrease"
                )
            }
            Text(
                text = "$count",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
            IconButton(onClick = { onIncrement() })
            {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Increase"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemOrderPreview(){
    ItemOrderStateful()
}