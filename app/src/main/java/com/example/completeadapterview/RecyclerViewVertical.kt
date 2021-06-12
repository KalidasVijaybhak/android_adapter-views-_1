package com.example.completeadapterview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dataSource.DataSourceClass
import kotlinx.android.synthetic.main.linear_vertical.*
import recyclerviewadapters.RecyclerViewVerticalAdapter
import android.widget.Toast
import dataModal.Contacts

lateinit var recyclerViewVerticalAdapter:RecyclerViewVerticalAdapter
class RecyclerViewVertical:AppCompatActivity(),RecyclerViewVerticalAdapter.OnLinearContactClickListener{
 
 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_vertical)
        initRecyclerViewVertical()
        addDataSet()

    }


    private fun addDataSet(){
        val data = DataSourceClass.createDataSet()
        recyclerViewVerticalAdapter.submitList(data)
    }
    private fun initRecyclerViewVertical(){
        val recyclerViewHorizontal:RecyclerView? = findViewById(R.id.recyclerViewVertical)
        recyclerViewVertical?.apply {
            layoutManager = LinearLayoutManager(this@RecyclerViewVertical)

            (layoutManager as LinearLayoutManager).orientation = LinearLayoutManager.VERTICAL
            recyclerViewVerticalAdapter = RecyclerViewVerticalAdapter(this@RecyclerViewVertical)
            adapter = recyclerViewVerticalAdapter
        }
    }

    override fun onItemClicked(contacts: Contacts,position:Int) {
        Toast.makeText(this,"User name ${contacts.pName} Position $position", Toast.LENGTH_LONG)
            .show()
    }

}

