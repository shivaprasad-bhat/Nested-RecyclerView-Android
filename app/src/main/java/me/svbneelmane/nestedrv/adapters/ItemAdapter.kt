package me.svbneelmane.nestedrv.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.svbneelmane.nestedrv.R
import me.svbneelmane.nestedrv.models.Items
import me.svbneelmane.nestedrv.viewholders.ItemViewHolder

class ItemAdapter(
    private val items: List<Items>
) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_contact_list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        return if(items.isEmpty()) -1 else 0

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindItems(item = items[position])
    }

    override fun getItemCount() = items.size

}