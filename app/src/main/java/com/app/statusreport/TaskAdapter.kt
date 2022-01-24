package com.app.statusreport

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.statusreport.databinding.ItemTaskBinding

class TaskAdapter(val mContext: Context,val list:ArrayList<String>):RecyclerView.Adapter<TaskAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemTaskBinding.inflate(LayoutInflater.from(mContext),parent,false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       
    }

    override fun getItemCount()=list.size

    class MyViewHolder(val binding:ItemTaskBinding) :RecyclerView.ViewHolder(binding.root)

}