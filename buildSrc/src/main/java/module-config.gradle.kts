import com.android.build.gradle.AppExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.TestedExtension
import de.fayard.refreshVersions.core.versionFor
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

project.afterEvaluate {
  with(extensions) {
    findByType<AppExtension>()?.androidAppConfig()
    findByType<LibraryExtension>()?.androidLibraryConfig()
    findByType<TestedExtension>()?.androidCommonConfig()
  }
  commonConfig()
}

fun TestedExtension.androidCommonConfig() {
  setCompileSdkVersion(AndroidSdk.compileSdk)

  defaultConfig {
    minSdk = AndroidSdk.minSdk
    targetSdk = AndroidSdk.targetSdk

    compileOptions {
      sourceCompatibility = JavaVersion.VERSION_1_8
      targetCompatibility = JavaVersion.VERSION_1_8
    }

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    testInstrumentationRunnerArguments["clearPackageData"] = "true"

    consumerProguardFiles("consumer-rules.pro")
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
  }

  packagingOptions {
    resources {
      excludes += listOf(
        "META-INF/AL2.0",
        "META-INF/LGPL2.1"
      )
    }
  }
}

fun findPropertyString(s: String) = project.findProperty(s) as String?
fun findPropertyInt(s: String) = project.findProperty(s) as Int

fun AppExtension.androidAppConfig() {
  defaultConfig {
    applicationId = project.findProperty("GROUP") as String
    versionCode = (project.findProperty("VERSION_CODE") as String).toInt()
    versionName = project.findProperty("VERSION_NAME") as String
  }
  buildFeatures.compose = true
  composeOptions.kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.ui)
}

fun LibraryExtension.androidLibraryConfig() {
  buildFeatures {
    buildConfig = false
    compose = true
  }
  composeOptions.kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.ui)
}

fun Project.commonConfig() {

  tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
    targetCompatibility = JavaVersion.VERSION_1_8.toString()
  }

  tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
  }

  tasks.withType<Test> {
    maxParallelForks = Runtime.getRuntime().availableProcessors() * 2
    testLogging {
      events(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
    }
    useJUnitPlatform()
  }
}
