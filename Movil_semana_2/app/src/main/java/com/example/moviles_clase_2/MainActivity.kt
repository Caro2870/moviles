package com.example.moviles_clase_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviles_clase_2.ui.theme.Moviles_clase_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContent {
//           Text(text = "Carolina y Jessica")
           PersonalData(name = "Caro")
       }
    }
}

@Composable
private fun PersonalData(name: String){
    MaterialTheme(){
        Column() {
            Text(text = "Mi nombre es: $name",style = MaterialTheme.typography.h4)
                

            Text(text = "Seccion WX71")
            Text(text = "Viernes...")
        }
    }


}

@Preview
@Composable
private fun PreviewPersonalData(){
    PersonalData(name = "Caroas")
}