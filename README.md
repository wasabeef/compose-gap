# Compose Gap

<img height="160px" src="https://github.com/wasabeef/transformers/raw/main/art/jetpack-compose.svg" align="right" />

<p align="left">
  <a href="https://www.apache.org/licenses/LICENSE-2.0">
    <img src="https://img.shields.io/badge/license-Apache%202-blue.svg" />
  </a>
  <a href="https://search.maven.org/search?q=jp.wasabeef.gap">
    <img src="https://maven-badges.herokuapp.com/maven-central/jp.wasabeef/gap/badge.svg" />
  </a>
  <a href="https://github.com/wasabeef/compose-gap/actions">
    <img src="https://github.com/wasabeef/compose-gap/actions/workflows/android-ci.yml/badge.svg" />
  </a>
</p>

Easily adding gaps inside such as Columns and Rows for Jetpack Compose.

Inspired by [Flutter's Gap](https://pub.dev/packages/gap).

## Introduction
When it comes to add empty space between widgets inside a Column or a Row, we have multiple options:

We can either add a Padding around these widgets but it's very verbose
Or we can add Spacer widgets between them.
Gap is another option. It's like Spacer but you don't have to know if it's inside a Row or a Column. So that it's less verbose than using a Spacer.

## Features

Gradle settings
```groovy
implementation 'jp.wasabeef:gap:1.1.0'
```

Then you just have to add a `Gap` inside a `Column` or a `Row` with the specified extent.
```kotlin
  Column {
    Text(text = "Hello")
    Gap(20.dp) // Adds an empty space of 20 dps.
    Text(text = "World")
  }

  Row {
    Text(text = "Hello")
    Gap(20.dp) // Adds an empty space of 20 dps.
    Text(text = "World")
  }
```

## Contributing

Feel free to open a issue or submit a pull request for any bugs/improvements.
