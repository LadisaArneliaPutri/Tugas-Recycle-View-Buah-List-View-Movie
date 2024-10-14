package com.ladisa.project_kotlin_mobileapp.model

import com.salti.project_kotlin_mobileapp.R


data class ModelBuah(
    val image: Int,
    val judul: String
)

//kita bikin array

object MockList {
    fun getModel(): List<ModelBuah> {
        val item1 = ModelBuah(
            R.drawable.apple,
            "Apel"
        )
        val item2 = ModelBuah(
            R.drawable.grapes,
            "Anggur"
        )
        val item3 = ModelBuah(
            R.drawable.orange,
            "Jeruk"
        )
        val item4 = ModelBuah(
            R.drawable.pear,
            "Per"
        )
        val item5 = ModelBuah(
            R.drawable.strawberry,
            "Strowberry"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        return itemList
    }

}
