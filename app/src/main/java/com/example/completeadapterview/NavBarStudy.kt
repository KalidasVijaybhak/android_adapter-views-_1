package com.example.completeadapterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NavBarStudy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_bar_study)

        val button: Button = findViewById(R.id.button10)
        button.setOnClickListener{
            startActivity(Intent(this@NavBarStudy, ToolBarStudy::class.java))

        }
        val botNav:Button = findViewById(R.id.button12)
        botNav.setOnClickListener{
            startActivity(Intent(this@NavBarStudy, BottomNaV::class.java))

        }
    }
}