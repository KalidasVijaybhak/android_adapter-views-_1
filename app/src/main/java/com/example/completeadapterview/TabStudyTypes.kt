package com.example.completeadapterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TabStudyTypes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_study_typres)
        val tabNormal:Button = findViewById(R.id.button2)
        val tabIcon:Button = findViewById(R.id.button9)
        tabNormal.setOnClickListener {
            startActivity(Intent(this@TabStudyTypes, TabNormal::class.java))

        }
        tabIcon.setOnClickListener {
            startActivity(Intent(this@TabStudyTypes, TabWithIcons::class.java))

        }
    }
}