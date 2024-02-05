pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
  plugins {
    id("de.fayard.refreshVersions") version "0.60.5"
  }
}

buildscript {
  repositories { gradlePluginPortal() }
}

plugins {
  id("de.fayard.refreshVersions")
}
