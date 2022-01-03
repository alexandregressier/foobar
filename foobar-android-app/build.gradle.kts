plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "dev.gressier.foobar.android"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":foobar-shared"))
    implementation(Google.android.material)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.constraintLayout)
}