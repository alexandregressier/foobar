import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Properties --------------------------------------------------------------------------------------

val versionFooBarAndroid: String by rootProject.extra
val versionCodeFooBarAndroid: Int by rootProject.extra
val versionFooBarShared: String by rootProject.extra

val versionJava: JavaVersion by rootProject.extra
val versionAndroidApi: Int by rootProject.extra
val versionMinAndroidApi: Int by rootProject.extra
val versionMinIos: String by rootProject.extra

// Plugins -----------------------------------------------------------------------------------------

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
}

version = versionFooBarShared

kotlin {
    android()
    ios()

    sourceSets {
        // Common ----------------------------------------------------------------------------------

        val commonMain by getting {
            dependencies {

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        // Android ---------------------------------------------------------------------------------

        val androidMain by getting {
            dependencies {

            }
        }
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation(Testing.junit4)
            }
        }

        // iOS -------------------------------------------------------------------------------------

        val iosMain by getting {
            dependencies {

            }
        }
        val iosTest by getting {
            dependencies {

            }
        }
    }

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "https://example.com"
        ios.deploymentTarget = versionMinIos
        podfile = project.file("../foobar-ios-app/Podfile")
        framework {
            baseName = "FooBarShared"
        }
    }
}

android {
    compileSdk = versionAndroidApi
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        minSdk = versionMinAndroidApi
        targetSdk = versionAndroidApi
    }
    compileOptions {
        sourceCompatibility = versionJava
        targetCompatibility = sourceCompatibility
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

// Tasks -------------------------------------------------------------------------------------------

tasks {
    withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "$versionJava"
//            freeCompilerArgs = freeCompilerArgs + listOf(
//                "-Xopt-in=${
//                    listOf(
//                    ).joinToString(",")
//                }"
//            )
        }
    }
}