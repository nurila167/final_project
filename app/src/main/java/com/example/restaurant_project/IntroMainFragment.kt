package com.example.restaurant_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.restaurant_project.databinding.ActivityMainBinding
import com.example.restaurant_project.databinding.FragmentIntroMainBinding


class IntroMainFragment : Fragment() {

    private lateinit var binding: FragmentIntroMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIntroMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonToRegister.setOnClickListener {
            findNavController().navigate(R.id.action_introMainFragment_to_registerMainFragment)
        }
    }

}