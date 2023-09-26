package com.example.cheezypizza_.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cheezypizza_.R

data class pizza(val image:Int, val name_pizza:String, val name_vkusno:String)
class MyPizza{val list = arrayListOf(pizza(R.drawable.peperoni,"Peperoni", "Vkusno"),
    pizza(R.drawable.peperoni,"Peperoni", "Vkusno"),
    pizza(R.drawable.peperoni,"Peperoni", "Vkusno"),
    pizza(R.drawable.peperoni,"Peperoni","Vkusno"))
}

class PizzaRecycler(val context: Context, val list: ArrayList<pizza>): RecyclerView.Adapter<PizzaRecycler.MyVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.pizza_adapter,parent,false)
        return PizzaRecycler.MyVH(root)
    }
    class MyVH(itemView: View):RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.img_pizza)
        val TextView: TextView = itemView.findViewById(R.id.text_pizza)
        val TextView2: TextView = itemView.findViewById(R.id.text_vkusno)
    }
    override fun onBindViewHolder(holder: PizzaRecycler.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.TextView.setText(list[position].name_pizza)
        holder.TextView2.setText(list[position].name_vkusno)
    }
    override fun getItemCount(): Int {
        return list.size
    }
}



