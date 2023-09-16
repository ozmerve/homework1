package com.merveoz.homework1.ui.next

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.merveoz.homework1.R
import com.merveoz.homework1.common.viewBinding
import com.merveoz.homework1.databinding.FragmentHomeBinding
import com.merveoz.homework1.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {
    private val binding by viewBinding (FragmentResultBinding::bind)
    private val args by navArgs<ResultFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView2.text = args.questionObject.name
        binding.textView3.text = args.questionObject.email
        binding.textView4.text = args.questionObject.phone
        binding.textView5.text = args.questionObject.questionOne
        binding.textView6.text = args.questionObject.questionTwo
        binding.textView7.text = args.questionObject.questionThree
        binding.resultButton.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}