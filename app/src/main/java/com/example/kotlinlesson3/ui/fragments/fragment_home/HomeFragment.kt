package com.example.kotlinlesson3.ui.fragments.fragment_home

import android.os.Bundle
import android.view.View
import com.example.kotlinlesson3.databinding.FragmentHomeBinding
import com.example.kotlinlesson3.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun bind(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ui.btnIncrease.setOnClickListener {
            viewModel.onIncrementClick()
        }

        ui.btnDecrease.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }

}