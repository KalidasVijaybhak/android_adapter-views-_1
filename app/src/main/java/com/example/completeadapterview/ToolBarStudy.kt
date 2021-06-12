package com.example.completeadapterview

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_tool_bar_study.*

class ToolBarStudy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar_study)
        val toolBar: Toolbar = findViewById(R.id.toolbar_study)
   setSupportActionBar(toolBar)
      
     supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_navdrawer)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "SettedTitle"

    }


    override fun onCreateOptionsMenu(menu: Menu?):Boolean {
                                       menuInflater.inflate(R.menu.toolbar_study_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home ->   Toast.makeText(this,"drawer Selected",Toast.LENGTH_SHORT).show()
            R.id.setting_icon -> Toast.makeText(this,"setting Selected",Toast.LENGTH_SHORT).show()
            R.id.calls_icon -> Toast.makeText(this,"calls Selected",Toast.LENGTH_SHORT).show()
            R.id.save_icon -> Toast.makeText(this,"save Selected",Toast.LENGTH_SHORT).show()
            R.id.delete_icon -> Toast.makeText(this,"Delete Selected",Toast.LENGTH_SHORT).show()
            R.id.chat_icon -> Toast.makeText(this,"chat Selected",Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)
    }
}