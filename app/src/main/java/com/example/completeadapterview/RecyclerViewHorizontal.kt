package com.example.completeadapterview

import recyclerviewadapters.RecyclerViewHorizontalAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dataSource.DataSourceClass

private lateinit var recyclerViewHorizontalAdapter: RecyclerViewHorizontalAdapter
class RecyclerViewHorizontal:AppCompatActivity(){
 
 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linear_horizontal)
        initRecyclerViewHorizontal()
        addDataSet()

    }


    private fun addDataSet(){
        val data = DataSourceClass.createDataSet()
        recyclerViewHorizontalAdapter.submitList(data)
    }

    private fun initRecyclerViewHorizontal(){
        val recyclerViewHorizontal:RecyclerView? = findViewById(R.id.RecyclerViewHorizontal)
        recyclerViewHorizontal?.apply {
            layoutManager = LinearLayoutManager(this@RecyclerViewHorizontal)

            (layoutManager as LinearLayoutManager).orientation = LinearLayoutManager.HORIZONTAL
            recyclerViewHorizontalAdapter = RecyclerViewHorizontalAdapter()
            adapter = recyclerViewHorizontalAdapter
        }
    }

}