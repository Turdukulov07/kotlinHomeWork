package com.example.kotlinlesson3.ui.fragments.fragment_count_result

import android.os.Bundle
import android.view.View
import com.example.kotlinlesson3.databinding.FragmentCountResultBinding
import com.example.kotlinlesson3.ui.base.BaseFragment

class CountResultFragment : BaseFragment<FragmentCountResultBinding>() {
    override fun bind(): FragmentCountResultBinding {
        return FragmentCountResultBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.counter.observe(viewLifecycleOwner, {
            ui.tvResult.text = it.toString()
        })
    }
}