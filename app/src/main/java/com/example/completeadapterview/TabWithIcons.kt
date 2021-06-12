package com.example.completeadapterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle




import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import tabAdapters.TabNormalAdapter

class TabWithIcons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_eith_i_cons)


        val tabLayout:TabLayout=findViewById(R.id.tab_layout)
        val viewPager2:ViewPager2=findViewById (R.id.view_pager_2)

        val adapter=TabNormalAdapter(supportFragmentManager,lifecycle)

        viewPager2.adapter=adapter

        TabLayoutMediator(tabLayout,viewPager2){tab,position->
            when(position){
                0->{
                    tab.text="Chats"
                    tab.setIcon(R.drawable.ic_chats)
                }
                1->{
                    tab.text="Status"
                    tab.setIcon(R.drawable.ic_status)
                }
                2->{
                    tab.text="Calls"
                    tab.setIcon(R.drawable.ic_calls)
                }
            }
        }.attach()


    }
}