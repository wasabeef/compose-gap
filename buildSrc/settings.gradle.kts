pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
  plugins {
    id("de.fayard.refreshVersions") version "0.60.6"
  }
}

buildscript {
  repositories { gradlePluginPortal() }
}

plugins {
  id("de.fayard.refreshVersions")
}
