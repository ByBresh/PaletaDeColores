package com.clase.paletadecolores

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class VerticalViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    private val cvVertical: CardView = view.findViewById(R.id.cvVertical)
    private val tvVertical: TextView = view.findViewById(R.id.tvVertical)

    fun render(vertical: Vertical) {
        cvVertical.background.setTint(vertical.getColor(view.context))
        tvVertical.text = vertical.text
    }

}