package com.example.completeadapterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import fragments.FragmentOne
import fragments.Fragmenttwo

class FragmentStudyMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_study_main)
         val fragmentOne  = FragmentOne()
         val   fragmentTwo = Fragmenttwo()
        val btn1:Button = findViewById(R.id.button6)
        val btn2:Button = findViewById(R.id.button7)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentHolder_framelayout,fragmentOne)
            commit()
        }
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentHolder_framelayout,fragmentOne)
                addToBackStack(null)
                commit()
            }
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentHolder_framelayout,fragmentTwo)
                addToBackStack(null)
                commit()
            }
        }
    }
}