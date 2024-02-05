pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
}

plugins {
  id("de.fayard.refreshVersions") version "0.60.5"
}

rootProject.name = "Gap"

include(
  "sample",
  "gap",
)
