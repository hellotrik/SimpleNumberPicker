/*
 * Copyright 2017 Stéphane Baiget
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("com.android.library")
    kotlin("android")
    id("com.jfrog.bintray") version "1.8.4"
    `maven-publish`
}

android {
    compileSdkVersion(Android.compileSdkVersion)

    compileOptions {
        sourceCompatibility = Versions.java
        targetCompatibility = Versions.java
    }

    defaultConfig {
        minSdkVersion(Android.minSdkVersion)
        targetSdkVersion(Android.targetSdkVersion)
    }
}

dependencies {
    api(kotlin("stdlib"))

    api(Libs.appcompat)
    api(Libs.ktx)
    api(Libs.anko)
    api(Libs.constraintLayout)
}

apply(from = "../publish.gradle.kts")