

plugins {
  `module-config`
  com.android.application
  `kotlin-android`
}

dependencies {
  implementation(Kotlin.stdlib.jdk8)
  implementation(project(":gap"))

  implementation(AndroidX.appCompat)
  implementation(AndroidX.core.ktx)
  implementation(AndroidX.Compose.ui)
  implementation(AndroidX.Activity.compose)
  implementation(AndroidX.Compose.material)
  implementation(AndroidX.Compose.Ui.toolingPreview)
}
