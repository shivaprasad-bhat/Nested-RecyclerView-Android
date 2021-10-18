package me.svbneelmane.nestedrv.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.svbneelmane.nestedrv.MockData
import me.svbneelmane.nestedrv.R
import me.svbneelmane.nestedrv.adapters.HeaderAdapter
import me.svbneelmane.nestedrv.adapters.InnerAdapter

class RootFragment : Fragment(R.layout.fragment_root) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val outerRV = view.findViewById<RecyclerView>(R.id.rvOuter)
        val concatAdapter = ConcatAdapter()
        MockData.contacts.forEach {
            val headerAdapter = HeaderAdapter(it.type)
            val innerAdapter = InnerAdapter(it.contacts)
            concatAdapter.apply {
                addAdapter(headerAdapter)
                addAdapter(innerAdapter)
            }
        }

        outerRV.layoutManager = LinearLayoutManager(requireContext())
        outerRV.adapter = concatAdapter
    }
}