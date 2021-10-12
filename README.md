# Compose Gap

![Android CI](https://github.com/wasabeef/compose-gap/workflows/Android%20CI/badge.svg) ![License](https://img.shields.io/badge/license-Apache%202-blue.svg) ![Language](https://img.shields.io/github/languages/top/cortinico/kotlin-android-template?color=blue&logo=kotlin)

Easily adding gaps inside such as Columns and Rows for Jetpack Compose.

Inspired by [Flutter's Gap](https://pub.dev/packages/gap).

## Features

Gradle settings
```kotlin
// Groovy DSL
implementation 'jp.wasabeef:gap:x.y.z'

// Kotlin DSL
implementation('jp.wasabeef:gap:x.y.z')
```

Then you just have to add a `Gap` inside a `Column` or a `Row` with the specified extent.
```kotlin
  Column {
    Text(text = "Hello")
    Gap(height = 20.dp) // Adds an empty space of 20 pixels.
    Text(text = "World")
  }

  Row {
    Text(text = "Hello")
    Gap(width = 20.dp) // Adds an empty space of 20 pixels.
    Text(text = "World")
  }
```

## Contributing

Feel free to open a issue or submit a pull request for any bugs/improvements.
