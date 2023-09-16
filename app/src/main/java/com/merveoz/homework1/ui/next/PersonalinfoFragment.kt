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
import com.merveoz.homework1.data.model.PersonalInformationModel
import com.merveoz.homework1.databinding.FragmentHomeBinding
import com.merveoz.homework1.databinding.FragmentPersonalinfoBinding
import com.merveoz.homework1.ui.Home.HomeFragmentDirections

class PersonalinfoFragment : Fragment(R.layout.fragment_personalinfo) {
    private val binding by viewBinding (FragmentPersonalinfoBinding::bind)
    private val args by navArgs<PersonalinfoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = args.nameObject.toString()
        binding.btnGoToCustom.setOnClickListener {
            val email = binding.etMail.text.toString()
            val phone = binding.etPhone.text.toString()
            val personInfoObject = PersonalInformationModel(args.nameObject.toString(),email,phone)
            val action = PersonalinfoFragmentDirections.PersonaltoCustom(personInfoObject)
            findNavController().navigate(action)

        }
    }
}