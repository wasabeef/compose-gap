pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
  plugins {
    id("de.fayard.refreshVersions") version "0.40.2"
  }
}

buildscript {
  repositories { gradlePluginPortal() }
}

plugins {
  id("de.fayard.refreshVersions")
}
