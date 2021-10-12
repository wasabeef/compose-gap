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

rootProject.name = "Gap"

include(
  "sample",
  "gap",
)
