package me.svbneelmane.nestedrv.models
import me.svbneelmane.nestedrv.models.Items


data class Contacts(

    var category: String,
    var items: List<Items>

)