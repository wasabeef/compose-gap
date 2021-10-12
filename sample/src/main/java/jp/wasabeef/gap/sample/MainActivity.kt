package jp.wasabeef.gap.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import jp.wasabeef.gap.Gap

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Column() {
        ColumnSample()
        RowSample()
      }
    }
  }
}

@Composable
fun ColumnSample() {
  Column {
    Text(text = "Hello")
    Gap(height = 20.dp)
    Text(text = "World")
  }
}

@Composable
fun RowSample() {
  Row {
    Text(text = "Hello")
    Gap(width = 20.dp)
    Text(text = "World")
  }
}
