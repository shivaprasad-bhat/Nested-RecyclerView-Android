package me.svbneelmane.nestedrv.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.svbneelmane.nestedrv.R
import me.svbneelmane.nestedrv.models.Contacts
import me.svbneelmane.nestedrv.viewholders.InnerViewHolder

class InnerAdapter(
    private val contacts: List<Contacts>
) : RecyclerView.Adapter<InnerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item, parent, false)
        return InnerViewHolder(view)
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        holder.bindData(contacts[position])
    }

    override fun getItemCount() = contacts.size
}