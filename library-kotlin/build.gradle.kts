plugins {
  `module-config`
  `java-library`
  kotlin
  id("org.jetbrains.dokka")
  id("com.vanniktech.maven.publish")
}

dependencies {
  implementation(Kotlin.stdlib.jdk8)
}
