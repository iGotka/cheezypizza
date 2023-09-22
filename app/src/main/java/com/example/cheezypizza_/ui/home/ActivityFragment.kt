package com.example.cheezypizza_.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cheezypizza_.R
import com.example.cheezypizza_.recadapters.MyPizza
import com.example.cheezypizza_.recadapters.PizzaRecycler


class ActivityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.activity_menu, container, false)
        val pizza_recycler : RecyclerView = root.findViewById(R.id.rec_pizza)
        pizza_recycler.adapter = PizzaRecycler(requireContext(), MyPizza().list)
        return root
    }
    }
