plugins {
  `module-config`
  com.android.library
  `kotlin-android`
  id("org.jetbrains.dokka")
  id("com.vanniktech.maven.publish")
}

dependencies {
  implementation(Kotlin.stdlib.jdk8)
  implementation(AndroidX.appCompat)
  implementation(AndroidX.core.ktx)
}
