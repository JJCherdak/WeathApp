package com.geekbrains.weathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: WeatherAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "ПРИЛОЖЕНИИ НАХОДИТСЯ В РАЗРАБОТКЕ",
                Toast.LENGTH_LONG
            ).show()

        }
        initAdapter()
    }

    private fun initAdapter() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        adapter = WeatherAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        adapter.weatherList = Repository.weatherList

    }

}
