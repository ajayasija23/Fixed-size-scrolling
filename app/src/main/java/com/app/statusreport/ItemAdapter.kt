package com.app.statusreport

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.statusreport.databinding.ItemListItemBinding

class ItemAdapter(val mContext:Context,val list:List<String>):RecyclerView.Adapter<ItemAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.MyViewHolder {
        return MyViewHolder(
            ItemListItemBinding.inflate(LayoutInflater.from(mContext),parent,false)
        )
    }

    override fun onBindViewHolder(holder: ItemAdapter.MyViewHolder, position: Int) {
        holder.binding.text.text=list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(val binding:ItemListItemBinding):RecyclerView.ViewHolder(binding.root)
}