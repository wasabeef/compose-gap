pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
}

plugins {
  id("de.fayard.refreshVersions") version "0.23.0"
}

rootProject.name = "kotlin-android-template"

include(
  "sample",
  "library-android",
  "library-kotlin"
)
