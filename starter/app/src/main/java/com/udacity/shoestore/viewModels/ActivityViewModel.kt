package com.udacity.shoestore.viewModels

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ActivityViewModel: ViewModel() {
    private lateinit var shoeList: MutableList<Shoe>

    init {
        createShoeList()
    }

    fun createShoeList() {
        shoeList = mutableListOf(
            Shoe(
                "Viamo",
                4.3,
                "Viamo",
                "Viamo"
            ),
            Shoe(
                "Natacha",
                3.3,
                "Natacha",
                "Natacha"
            ),
            Shoe(
                "Briganti",
                6.3,
                "Briganti",
                "Briganti"
            ),
            Shoe(
                "Ferraro",
                7.2,
                "Ferraro",
                "Ferraro"
            ),
        )
    }
}