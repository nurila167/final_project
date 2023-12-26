package com.example.restaurant_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val buttonNavigation = findViewById<BottomNavigationView>(R.id.btm_navigation)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_screen) as NavHostFragment
        val navController = navHostFragment.navController

        NavigationUI.setupWithNavController(buttonNavigation, navController)
    }
}