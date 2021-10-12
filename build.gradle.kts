plugins {
  `detekt-config`
  id("org.jetbrains.dokka")
  id("com.vanniktech.maven.publish")
}

allprojects {
  repositories {
    google()
    mavenCentral()
  }
}

tasks.dokkaHtmlMultiModule.configure {
  outputDirectory.set(rootDir.resolve("docs/api"))
}
