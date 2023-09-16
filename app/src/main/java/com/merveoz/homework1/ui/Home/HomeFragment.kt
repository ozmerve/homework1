package com.merveoz.homework1.ui.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.merveoz.homework1.R
import com.merveoz.homework1.common.viewBinding
import com.merveoz.homework1.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding (FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnEnter.setOnClickListener {
            val nameSurname = binding.etNameSurname.text.toString()
            val action = HomeFragmentDirections.HometoPersonal(nameSurname)
            findNavController().navigate(action)
        }
    }
}