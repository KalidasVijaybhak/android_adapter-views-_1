package com.example.completeadapterview

import recyclerviewadapters.RecyclerViewGridAdapter

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dataSource.DataSourceClass

private lateinit var recyclerViewGridAdapter: RecyclerViewGridAdapter
class RecyclerViewGrid:AppCompatActivity() {
 
 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_grid)
        initRecyclerViewGrid()
        addDataSet()

    }


    private fun addDataSet(){
        val data = DataSourceClass.createDataSet()
        recyclerViewGridAdapter.submitList(data)
    }

    private fun initRecyclerViewGrid(){
        val recyclerViewGrid:RecyclerView? = findViewById(R.id.RecyclerViewGrid)
        recyclerViewGrid?.apply {
            layoutManager = GridLayoutManager(this@RecyclerViewGrid,3)

             setHasFixedSize(true)
            recyclerViewGridAdapter =RecyclerViewGridAdapter(this@RecyclerViewGrid)
            adapter = recyclerViewGridAdapter
        }
    }

//    override fun onItemClick(each_contact: Contacts, position: Int) {
//
//    }
}