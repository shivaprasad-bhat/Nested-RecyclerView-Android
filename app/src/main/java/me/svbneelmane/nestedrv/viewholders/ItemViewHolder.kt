package me.svbneelmane.nestedrv.viewholders

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.svbneelmane.nestedrv.R
import me.svbneelmane.nestedrv.models.Items

class ItemViewHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {
    fun bindItems(item: Items) {
        Log.d("$$$$", "$item")
        view.findViewById<TextView>(R.id.tvName).text = item.name
        view.findViewById<TextView>(R.id.tvPhone).text = item.phone.toString()
    }
}