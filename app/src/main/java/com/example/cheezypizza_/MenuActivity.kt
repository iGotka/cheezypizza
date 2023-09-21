package com.example.cheezypizza_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.example.cheezypizza_.recadapters.MyPizza
import com.example.cheezypizza_.recadapters.PizzaRecycler

class MenuActivity : AppCompatActivity() {
    fun onCreate(savedInstanceState: Bundle?,
                 inflater: LayoutInflater,
                 container: ViewGroup?,): View? {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

            val root = inflater.inflate(R.layout.activity_menu, container, false)
            val feel_recycler : RecyclerView = root.findViewById(R.id.rec_pizza)
            feel_recycler.adapter = PizzaRecycler(requireContext(),MyPizza().list)
            return root
    }
}