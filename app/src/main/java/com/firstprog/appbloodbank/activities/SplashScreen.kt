package com.firstprog.appbloodbank.activities


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.firstprog.appbloodbank.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        val handler: Handler = Handler()
        handler.postDelayed(Runnable {
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }, 2500)
    }
}