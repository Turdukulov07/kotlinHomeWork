package com.example.kotlinlesson3.ui.fragments.fragment_text_operations

import android.os.Bundle
import android.view.View
import com.example.kotlinlesson3.FragmentOperationsTextBinding
import com.example.kotlinlesson3.ui.base.BaseFragment

class TextOperationsFragment : BaseFragment<FragmentOperationsTextBinding>() {
    override fun bind(): FragmentOperationsTextBinding {
        return FragmentOperationsTextBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.textResult.observe(viewLifecycleOwner, {
            ui.tvOperations.text = it.toString()
        })
    }
}