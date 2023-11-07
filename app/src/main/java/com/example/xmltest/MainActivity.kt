package com.example.xmltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.TestAdapter
import com.example.xmltest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: TestAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = TestAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val list = (1..30).toList().map { it.toString() }
        adapter.setList(list)
    }
}