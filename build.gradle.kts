// Properties --------------------------------------------------------------------------------------

val versionFooBarAndroid by extra("0.1.0")
val versionCodeFooBarAndroid by extra(1)
val versionFooBarIos by extra("0.1.0")
val versionFooBarShared by extra("0.1.0")

val versionGradle by extra("7.3.3")
val versionJava by extra(JavaVersion.VERSION_11)
val versionAndroidApi by extra(32)
val versionMinAndroidApi by extra(26)
val versionMinIos by extra("14.1")

// Plugins -----------------------------------------------------------------------------------------

plugins {
    id("com.osacky.doctor")
    kotlin("android") apply false
    id("com.android.application") apply false
}

doctor {
    disallowCleanTaskDependencies.set(false)
}

// Tasks -------------------------------------------------------------------------------------------

tasks {
    wrapper {
        gradleVersion = versionGradle
    }
    register<Delete>("clean") {
        delete(rootProject.buildDir)
    }
}