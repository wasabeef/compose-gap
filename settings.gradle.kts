pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
}

plugins {
  id("de.fayard.refreshVersions") version "0.40.2"
}

rootProject.name = "Gap"

include(
  "sample",
  "gap",
)
