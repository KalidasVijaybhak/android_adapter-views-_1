package com.example.completeadapterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
              private var recyclervertical:Button? = null
    private var recyclerHorizontal:Button? = null
    private var recyclerGrid:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerHorizontal = findViewById(R.id.RecyclerView_LinearH)
        recyclervertical = findViewById(R.id.RecyclerView_LinearV)
        recyclerGrid = findViewById(R.id.RecyclerView_Grid)
        recyclervertical?.setOnClickListener {
            startActivity(Intent(this@MainActivity, RecyclerViewVertical::class.java))
        }
        recyclerHorizontal?.setOnClickListener {
            startActivity(Intent(this@MainActivity, RecyclerViewHorizontal::class.java))
        }
        recyclerGrid?.setOnClickListener {
            startActivity(Intent(this@MainActivity, RecyclerViewGrid::class.java))
        }
        val fragButton:Button = findViewById(R.id.button8)
        fragButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, FragmentStudyMain::class.java))
        }

        val button:Button = findViewById(R.id.button)
        button.setOnClickListener{
            startActivity(Intent(this@MainActivity, TabStudyTypes::class.java))

        }
        val navbutton:Button = findViewById(R.id.button3)
        navbutton.setOnClickListener{
            startActivity(Intent(this@MainActivity, NavBarStudy::class.java))

        }
    }
}