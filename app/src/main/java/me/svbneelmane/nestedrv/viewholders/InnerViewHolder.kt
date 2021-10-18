package me.svbneelmane.nestedrv.viewholders

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.svbneelmane.nestedrv.R
import me.svbneelmane.nestedrv.adapters.ItemAdapter
import me.svbneelmane.nestedrv.models.Contacts

class InnerViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bindData(contacts: Contacts) {
        val itemAdapter = ItemAdapter(contacts.items)
        view.findViewById<TextView>(R.id.tvHeaderInner).text = contacts.category
        view.findViewById<RecyclerView>(R.id.rvInner).adapter = itemAdapter
        Log.d("$$$$$", contacts.toString())
    }
}