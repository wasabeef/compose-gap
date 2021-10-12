plugins {
  `module-config`
  com.android.application
  `kotlin-android`
}

dependencies {
  implementation(Kotlin.stdlib.jdk8)

  implementation(project(":library-android"))
  implementation(project(":library-kotlin"))

  implementation(AndroidX.appCompat)
  implementation(AndroidX.constraintLayout)
  implementation(AndroidX.core.ktx)
}
