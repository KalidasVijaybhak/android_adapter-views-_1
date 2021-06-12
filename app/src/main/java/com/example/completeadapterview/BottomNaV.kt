package com.example.completeadapterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import fragments.CallsFragments
import fragments.ChatsFragments
import fragments.StatusFragments
import kotlinx.android.synthetic.main.activity_bottom_na_v.*

class BottomNaV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_na_v)

        val chatsFrag = ChatsFragments()
        val callsFrag = CallsFragments()
        val statusFrag = StatusFragments()
        makecurrentFragment(ChatsFragments())
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.chat_icon ->   makecurrentFragment(chatsFrag)
                R.id.status_icon -> makecurrentFragment(statusFrag)
                R.id.calls_icon -> makecurrentFragment(callsFrag)
               
            }
            true
        }

        }
    private fun makecurrentFragment(Fragments: Fragment) {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.bottomNavFragHolder,Fragments)
                commit()
            }
    }


}