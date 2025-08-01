import java.util.Properties
import java.io.FileInputStream

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services")

}


val keystorePropertiesFile = rootProject.file("key.properties")
val keystoreProperties = Properties().apply {
    load(FileInputStream(keystorePropertiesFile))
}

android {
    namespace = "com.flutter.structure"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = "27.0.12077973"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.flutter.structure"
        minSdk = maxOf(23, flutter.minSdkVersion.toInt())
        targetSdk = flutter.targetSdkVersion.toInt()
        versionCode = flutter.versionCode.toInt()
        versionName = flutter.versionName
    }

    signingConfigs {
        create("release") {
            keyAlias = keystoreProperties.getProperty("keyAlias")
            keyPassword = keystoreProperties.getProperty("keyPassword")
            storeFile = keystoreProperties.getProperty("storeFile")?.let { file(it) }
            storePassword = keystoreProperties.getProperty("storePassword")
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")
        }
        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    flavorDimensions += "app"

    productFlavors {
        create("dev") {
            dimension = "app"
            resValue("string", "app_name", "Structure Dev")
            applicationIdSuffix = ".dev"
            versionNameSuffix = ".dev"
        }
        create("stage") {
            dimension = "app"
            resValue("string", "app_name", "Structure Stage")
            applicationIdSuffix = ".stage"
            versionNameSuffix = ".stage"
        }
        create("prod") {
            dimension = "app"
            
        }
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:34.0.0"))
    implementation("com.scottyab:rootbeer-lib:0.1.0")
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")
    configurations.all {
        exclude(group = "com.google.android.gms", module = "play-services-safetynet")
    }
}

flutter {
    source = "../.."
}