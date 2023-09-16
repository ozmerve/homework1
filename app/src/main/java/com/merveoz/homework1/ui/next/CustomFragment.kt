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
import com.merveoz.homework1.data.model.QuestionModel
import com.merveoz.homework1.databinding.FragmentCustomBinding
import com.merveoz.homework1.databinding.FragmentHomeBinding

class CustomFragment : Fragment(R.layout.fragment_custom) {

    private val binding by viewBinding (FragmentCustomBinding::bind)
    private val args by navArgs<CustomFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvName.text = args.personalObject.name
        binding.btnGoToResult.setOnClickListener {
            val questionOne = binding.etColor.text.toString()
            val questionTwo = binding.etMusic.text.toString()
            val questionThree = binding.etMovie.text.toString()

            //dataclass'tan obje oluşturma
            val questionModel = QuestionModel(args.personalObject.name,args.personalObject.email,
                args.personalObject.phone,questionOne,questionTwo,questionThree)

            val action = CustomFragmentDirections.CustomtoResult(questionModel)
            findNavController().navigate(action)
        }
    }
}

