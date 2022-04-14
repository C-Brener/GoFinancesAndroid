package com.ciandt.gofinances.ui.MainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ciandt.gofinances.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_GoFinances)
        setContentView(R.layout.activity_main)

    }
}