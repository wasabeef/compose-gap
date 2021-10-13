package jp.wasabeef.gap.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import jp.wasabeef.gap.Gap

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Column {
        ColumnSample()
        Divider(modifier = Modifier.padding(12.dp))
        RowSample()
        Divider(modifier = Modifier.padding(12.dp))
        LazyColumnSample()
        Divider(modifier = Modifier.padding(12.dp))
        LazyRowSample()
        Divider(modifier = Modifier.padding(12.dp))
      }
    }
  }
}

@Composable
fun ColumnSample() {
  Column(modifier = Modifier.width(IntrinsicSize.Min)) {
    Text(text = "Jetpack")
    Gap(20.dp, modifier = Modifier
      .fillMaxWidth()
      .background(Color.Red))
    Text(text = "Compose")
    Gap(20.dp)
    Text(text = "Gap")
  }
}

@Composable
fun RowSample() {
  Row(modifier = Modifier.width(IntrinsicSize.Min)) {
    Text(text = "Jetpack")
    Gap(20.dp)
    Text(text = "Compose")
    Gap(20.dp)
    Text(text = "Gap")
  }
}

@Composable
@Suppress("MagicNumber")
fun LazyColumnSample() {
  LazyColumn(modifier = Modifier
    .background(Color.LightGray)
    .fillMaxWidth()) {
    item {
      Text(text = "First item1")
      Gap(20.dp)
      Text(text = "First item2")
    }

    items(3) { index ->
      Text(text = "Item: $index")
    }

    item {
      Text(text = "Last item1")
      Gap(20.dp)
      Text(text = "Last item2")
    }
  }
}

@Composable
@Suppress("MagicNumber")
fun LazyRowSample() {
  LazyRow {
    item {
      Text(text = "First item1")
      Gap(20.dp)
      Text(text = "First item2")
    }

    items(3) { index ->
      Text(text = "Item: $index")
    }

    item {
      Text(text = "Last item1")
      Gap(20.dp)
      Text(text = "Last item2")
    }
  }
}
