package com.app.statusreport

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ItemPagerAdapter(fa:FragmentActivity):FragmentStateAdapter(fa) {
    private val list=ItemModel.getItems()
    override fun getItemCount(): Int {

        if (list.size%3==0){
            return list.size/3
        }
        val size=(list.size/3.0).toInt()+1
        Log.d(TAG, "getItemCount: $size")
        return size
    }

    override fun createFragment(position: Int): Fragment {
        val startPos=position*3
        var endPos=startPos+3
        if (endPos>=list.size){
            endPos=list.size
        }
        val bundle=Bundle().apply {
            putInt("startPos",startPos)
            putInt("endPos",endPos)
        }
        val fragment=ItemFragment()
        fragment.arguments=bundle
        return fragment
    }
}