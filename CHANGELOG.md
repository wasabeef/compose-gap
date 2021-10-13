Changelog
=========

### 1.1.0
---

Features
- Added Modifier parameter to Row and Column Gap.
```kotlin
Column(modifier = Modifier.width(IntrinsicSize.Min)) {
  Text(text = "Jetpack")
  Gap(20.dp, modifier = Modifier.fillMaxWidth().background(Color.Red))
  Text(text = "Compose")
}
```
- Added Gap to LazyRow and LazyColumn.
```kotlin
LazyColumn {
  item {
    Text(text = "Top")
    Gap(20.dp)
    Text(text = "Bottom")
  }
}
```

### 1.0.0
---

First release
