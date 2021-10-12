package jp.wasabeef.gap

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun RowScope.Gap(width: Dp) {
  Spacer(Modifier.width(width))
}

@Composable
fun ColumnScope.Gap(height: Dp) {
  Spacer(Modifier.height(height))
}
