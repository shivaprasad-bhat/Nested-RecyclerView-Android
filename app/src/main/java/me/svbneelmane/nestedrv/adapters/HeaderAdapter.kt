package me.svbneelmane.nestedrv.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.svbneelmane.nestedrv.R
import me.svbneelmane.nestedrv.viewholders.HeaderViewHolder

class HeaderAdapter(
    private val type: String
) : RecyclerView.Adapter<HeaderViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_header, parent, false)
        return HeaderViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.bindHeader(type)
    }

    override fun getItemCount(): Int {
        return 1
    }
}