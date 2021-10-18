package me.svbneelmane.nestedrv.viewholders

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.svbneelmane.nestedrv.R

class HeaderViewHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {
    fun bindHeader(type: String) {
        Log.d("$$$$", type)
        view.findViewById<TextView>(R.id.tvHeaderOuter).text = type
    }
}