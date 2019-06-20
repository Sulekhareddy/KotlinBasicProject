package com.example.kotlinbasicproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

       recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val dataList = ArrayList<Model>()
        dataList.add(Model("John", 33))
        dataList.add(Model("Sana", 23))
        dataList.add(Model("Jenn", 21))
        dataList.add(Model("Mac", 18))
        dataList.add(Model("OS", 21))

        val namesAdapter = NamesListAdapter(dataList)
        recyclerView.adapter = namesAdapter

    }
}
