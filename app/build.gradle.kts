plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion (26)
    defaultConfig {
        applicationId = "com.iambedant.apivsimplementation"
        minSdkVersion (17)
        targetSdkVersion (26)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}


dependencies {
    implementation(project( ":libraryA"))
    implementation (project( ":libraryB"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.11")
    implementation("com.android.support:appcompat-v7:26.0.0")
    implementation("com.android.support.constraint:constraint-layout:1.0.2")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.0")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.0")
}
