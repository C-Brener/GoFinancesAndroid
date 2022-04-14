package com.ciandt.gofinances.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ciandt.gofinances.R

class SplashScreenActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)

      setTheme(R.style.Theme_GoFinances)
      setContentView(R.layout.activity_splash_screen)
   }
}