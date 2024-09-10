package com.ubaya.week1anmp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubaya.week1anmp.databinding.FragmentGameBinding
import com.ubaya.week1anmp.databinding.FragmentMainBinding


class GameFragment : Fragment() {
    private lateinit var  binding: FragmentGameBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            val action = GameFragmentDirections.actionGameFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }


}