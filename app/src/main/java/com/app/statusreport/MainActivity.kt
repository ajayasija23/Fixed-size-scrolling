package com.app.statusreport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.statusreport.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val list=ArrayList<String>()
    private lateinit var adapter: TaskAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        list.add("")
        setAdapter()
        binding.tvAddMore.setOnClickListener {
            list.add("")
            adapter.notifyDataSetChanged()
        }
    }


    private fun setAdapter() {
        adapter=TaskAdapter(this,list)
        binding.rvTasks.adapter=adapter
    }
}