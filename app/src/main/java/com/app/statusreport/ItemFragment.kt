package com.app.statusreport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.statusreport.databinding.FragmentItemsBinding

class ItemFragment:Fragment() {
    private lateinit var binding: FragmentItemsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentItemsBinding.inflate(layoutInflater)
        setupAdapter()
        return binding.root
    }

    private fun setupAdapter() {
        val startPost=arguments?.getInt("startPos")
        val endPos=arguments?.getInt("endPos")
        val list=ItemModel.getItems().subList(startPost!!,endPos!!)
        binding.rvItems.adapter=ItemAdapter(requireContext(),list)
    }
}