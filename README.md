# My-education-app
pluginManagement {    repositories {        google()        mavenCentral()        gradlePluginPortal()    }}dependencyResolutionManagement {    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)    repositories {        google()        mavenCentral()    }}rootProject.name = "MyEducationApp"include(":app")

package com.rohan.myeducationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "My Education App",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("Welcome Student!")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {}) {
            Text("Study Notes")
        }

        Button(onClick = {}) {
            Text("Video Lectures")
        }

        Button(onClick = {}) {
            Text("My Profile")
        }
    }
}
