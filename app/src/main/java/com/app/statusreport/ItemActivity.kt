package com.app.statusreport

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.statusreport.databinding.ActivityItemsBinding

class ItemActivity:AppCompatActivity() {

    private lateinit var binding:ActivityItemsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager.adapter=ItemPagerAdapter(this)
    }
}