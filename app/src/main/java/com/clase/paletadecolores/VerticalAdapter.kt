package com.clase.paletadecolores

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VerticalAdapter(private val verticalList: List<Vertical>): RecyclerView.Adapter<VerticalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical, parent, false)
        return VerticalViewHolder(view)
    }

    override fun getItemCount(): Int = verticalList.size

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        holder.render(verticalList[position])
    }

}