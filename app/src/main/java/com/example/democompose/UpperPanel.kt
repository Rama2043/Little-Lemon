package com.example.democompose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UpperPanel(){

    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxWidth().background(Color(0xFF495E57))){
        Text(
            text = stringResource(R.string.title),
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp , top = 20.dp, bottom = 20.dp)
        )
        Text(
            text = stringResource(R.string.place),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp, bottom = 20.dp)
        )
        Row(modifier = Modifier.padding(start = 20.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center)
        {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center)
            {
                Text(
                    text = stringResource(R.string.description_one),
                    modifier = Modifier.width(200.dp).height(150.dp),
                    fontSize = 21.sp,
                    color = Color.White
                )
                Button(
                    onClick = {
                        Toast.makeText(context,"Order received.Thank you!",Toast.LENGTH_SHORT).show()
                    },
                    colors = ButtonDefaults.buttonColors(Color(0xFFf4CE14))
                )
                {
                    Text(
                        text = "Order",
                        color = Color.Black
                    )
                }
            }
            Image(
                painter = painterResource(R.drawable.upperpanelimage),
                contentDescription = "",
                modifier = Modifier.height(200.dp).clip(RoundedCornerShape(20.dp)).fillMaxWidth()
            )
        }
    }
}
//showBackground=true is for the white background in preview
@Preview(showBackground = true)
@Composable
fun UpperPanelPreview(){
    UpperPanel()
}