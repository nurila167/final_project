package com.example.restaurant_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView
import com.example.restaurant_project.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    lateinit var logo: ImageView
    lateinit var lottie: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        logo = binding.logo
        lottie = binding.lottie

        logo.animate().translationY(-1700f).setDuration(2700).setStartDelay(0)
        lottie.animate().translationX(2000f).setDuration(2000).setStartDelay(2900)

        Handler().postDelayed({
            var i: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
        }, 5000)
    }

}